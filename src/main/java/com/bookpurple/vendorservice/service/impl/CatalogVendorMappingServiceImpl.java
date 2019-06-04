package com.bookpurple.vendorservice.service.impl;

import com.bookpurple.vendorservice.bo.CatalogVendorMappingRequestBo;
import com.bookpurple.vendorservice.bo.CatalogVendorMappingResponseBo;
import com.bookpurple.vendorservice.bo.EventVendorMappingBo;
import com.bookpurple.vendorservice.bo.ServiceVendorMappingBo;
import com.bookpurple.vendorservice.entity.EventVendorMappingEntity;
import com.bookpurple.vendorservice.entity.ServiceVendorMappingEntity;
import com.bookpurple.vendorservice.entity.VendorEntity;
import com.bookpurple.vendorservice.mapper.VendorServiceMapper;
import com.bookpurple.vendorservice.model.mongo.VendorModel;
import com.bookpurple.vendorservice.repo.master.EventVendorMappingMasterRepo;
import com.bookpurple.vendorservice.repo.master.ServiceVendorMappingMasterRepo;
import com.bookpurple.vendorservice.repo.slave.EventVendorMappingSlaveRepo;
import com.bookpurple.vendorservice.repo.slave.ServiceVendorMappingSlaveRepo;
import com.bookpurple.vendorservice.service.ICatalogVendorMappingService;
import com.bookpurple.vendorservice.service.IVendorService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/*
 * Written by Gaurav Sharma on 03 Jun 2019
 */
@Service
public class CatalogVendorMappingServiceImpl implements ICatalogVendorMappingService {

    @Autowired
    private IVendorService vendorService;

    @Autowired
    private EventVendorMappingMasterRepo eventVendorMappingMasterRepo;

    @Autowired
    private EventVendorMappingSlaveRepo eventVendorMappingSlaveRepo;

    @Autowired
    private ServiceVendorMappingMasterRepo serviceVendorMappingMasterRepo;

    @Autowired
    private ServiceVendorMappingSlaveRepo serviceVendorMappingSlaveRepo;

    @Autowired
    private VendorServiceMapper vendorServiceMapper;

    private static Logger logger = Logger.getLogger(CatalogVendorMappingServiceImpl.class);

    @Override
    public CatalogVendorMappingResponseBo createVendorMapping(CatalogVendorMappingRequestBo catalogVendorMappingRequestBo) {
        String eventId = catalogVendorMappingRequestBo.getEventId();
        String serviceId = catalogVendorMappingRequestBo.getServiceId();
        String vendorId = catalogVendorMappingRequestBo.getVendorId();
        EventVendorMappingBo eventVendorMappingBo = getEventVendorMapping(eventId);
        ServiceVendorMappingBo serviceVendorMappingBo = getServiceVendorMapping(serviceId);

        // find vendor
        VendorEntity vendorEntity = vendorService.getVendorEntityByVendorId(vendorId);
        if (null == vendorEntity) {
            logger.error("No Vendor Found for vendorId: " + vendorId);
        }

        if (null != eventId) {
            // map vendor to event
            eventVendorMappingBo.getVendorEntities().add(vendorEntity);
            eventVendorMappingBo =
                    vendorServiceMapper
                            .convertEventVendorMappingEntityToBo(
                                    eventVendorMappingMasterRepo
                                            .save(vendorServiceMapper
                                                    .convertEventVendorMappingBoToEntity(eventVendorMappingBo)));
        }
        if (null != serviceId) {
            // map vendor to service
            serviceVendorMappingBo.getVendorEntities().add(vendorEntity);
            serviceVendorMappingBo =
                    vendorServiceMapper
                            .convertServiceVendorMappingEntityToBo(serviceVendorMappingMasterRepo
                                    .save(vendorServiceMapper
                                            .convertServiceVendorMappingBoToEntity(serviceVendorMappingBo)));
        }
        return CatalogVendorMappingResponseBo.builder()
                .eventVendorMappingBo(eventVendorMappingBo)
                .serviceVendorMappingBo(serviceVendorMappingBo)
                .build();
    }

    private EventVendorMappingBo getEventVendorMapping(String eventId) {
        EventVendorMappingEntity eventVendorMappingEntity = eventVendorMappingSlaveRepo.findByEventId(eventId);
        if (null != eventVendorMappingEntity) {
            return vendorServiceMapper.convertEventVendorMappingEntityToBo(eventVendorMappingEntity);

        }
        logger.info("No event found for eventId: " + eventId);
        return EventVendorMappingBo.builder()
                .eventId(eventId)
                .vendorEntities(new ArrayList<>())
                .build();
    }

    private ServiceVendorMappingBo getServiceVendorMapping(String serviceId) {
        ServiceVendorMappingEntity serviceVendorMappingEntity = serviceVendorMappingSlaveRepo.findByServiceId(serviceId);
        if (null != serviceVendorMappingEntity) {
            return vendorServiceMapper.convertServiceVendorMappingEntityToBo(serviceVendorMappingEntity);
        }
        logger.info("No event found for serviceId: " + serviceId);
        return ServiceVendorMappingBo.builder()
                .serviceId(serviceId)
                .vendorEntities(new ArrayList<>())
                .build();
    }
}
