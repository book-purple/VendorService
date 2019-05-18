package com.bookpurple.vendorservice.service.impl;

import com.bookpurple.vendorservice.bo.NewVendorRequestBo;
import com.bookpurple.vendorservice.bo.VendorBo;
import com.bookpurple.vendorservice.entity.VendorEntity;
import com.bookpurple.vendorservice.mapper.VendorServiceMapper;
import com.bookpurple.vendorservice.repo.master.VendorMasterRepo;
import com.bookpurple.vendorservice.repo.slave.VendorSlaveRepo;
import com.bookpurple.vendorservice.service.IVendorService;
import com.bookpurple.vendorservice.util.CommonUtil;
import com.bookpurple.vendorservice.util.VendorDummyDataProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/*
 * Created by Gaurav Sharma on 18 May 2019
 */
@Service
public class VendorServiceImpl implements IVendorService {

    @Autowired
    private VendorMasterRepo vendorMasterRepo;

    @Autowired
    private VendorSlaveRepo vendorSlaveRepo;

    @Autowired
    private VendorServiceMapper serviceMapper;

    @Autowired
    private VendorDummyDataProvider vendorDummyDataProvider;

    @Override
    public VendorBo createVendor(NewVendorRequestBo vendorRequestBo) {
        VendorBo vendorBo = VendorBo.builder()
                .name(vendorRequestBo.getName())
                .email(vendorRequestBo.getEmail())
                .mobile(vendorRequestBo.getMobile())
                .image(vendorRequestBo.getImage())
                .uid("BP"+ CommonUtil.UidGenerator(5))
                .createdAt(new Date())
                .build();
        return saveVendor(vendorBo);
    }

    private VendorBo saveVendor(VendorBo vendorBo) {
        return serviceMapper.converVendorEntityToBo(
                vendorMasterRepo
                        .save(serviceMapper
                                .convertVendorBoToEntity(vendorBo)));
    }

    @Override
    public List<VendorBo> getAllVendors() {
        return serviceMapper.convertVendorEntityListToBoList(vendorSlaveRepo.findAll());
    }

    public void addDummyVendors() {
        for (VendorBo vendorBo: vendorDummyDataProvider.getDummyVendorList()) {
            VendorEntity vendorEntity = serviceMapper.convertVendorBoToEntity(vendorBo);
            vendorMasterRepo.save(vendorEntity);
        }
    }
}
