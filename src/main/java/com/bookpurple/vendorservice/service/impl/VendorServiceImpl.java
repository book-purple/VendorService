package com.bookpurple.vendorservice.service.impl;

import com.bookpurple.vendorservice.bo.NewVendorRequestBo;
import com.bookpurple.vendorservice.bo.VendorBo;
import com.bookpurple.vendorservice.bo.VendorDetailsBo;
import com.bookpurple.vendorservice.bo.VendorDetailsRequestBo;
import com.bookpurple.vendorservice.entity.VendorDetailsEntity;
import com.bookpurple.vendorservice.entity.VendorEntity;
import com.bookpurple.vendorservice.mapper.VendorServiceMapper;
import com.bookpurple.vendorservice.repo.master.VendorDetailsMasterRepo;
import com.bookpurple.vendorservice.repo.master.VendorMasterRepo;
import com.bookpurple.vendorservice.repo.slave.VendorDetailsSlaveRepo;
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
    private VendorDetailsMasterRepo vendorDetailsMasterRepo;

    @Autowired
    private VendorDetailsSlaveRepo vendorDetailsSlaveRepo;

    @Autowired
    private VendorDummyDataProvider vendorDummyDataProvider;

    @Autowired
    private VendorServiceMapper serviceMapper;

    @Override
    public VendorBo createVendor(NewVendorRequestBo vendorRequestBo) {
        VendorBo vendorBo = VendorBo.builder()
                .name(vendorRequestBo.getName())
                .email(vendorRequestBo.getEmail())
                .mobile(vendorRequestBo.getMobile())
                .image(vendorRequestBo.getImage())
                .uid("BP" + CommonUtil.UidGenerator(5))
                .createdAt(new Date())
                .build();
        return saveVendor(vendorBo);
    }

    private VendorBo saveVendor(VendorBo vendorBo) {
        return serviceMapper.convertVendorEntityToBo(
                vendorMasterRepo
                        .save(serviceMapper
                                .convertVendorBoToEntity(vendorBo)));
    }

    @Override
    public List<VendorBo> getAllVendors() {
        return serviceMapper.convertVendorEntityListToBoList(vendorSlaveRepo.findAll());
    }

    public void addDummyVendors() {
        for (VendorBo vendorBo : vendorDummyDataProvider.getDummyVendorList()) {
            VendorEntity vendorEntity = serviceMapper.convertVendorBoToEntity(vendorBo);
            vendorMasterRepo.save(vendorEntity);
        }
    }

    @Override
    public VendorBo getVendorByVendorId(String vendorId) {
        VendorEntity vendorEntity = vendorSlaveRepo.findById(vendorId).orElse(null);
        return serviceMapper.convertVendorEntityToBo(vendorEntity);
    }

    @Override
    public VendorEntity getVendorEntityByVendorId(String vendorId) {
        return vendorSlaveRepo.findById(vendorId).orElse(null);
    }

    @Override
    public VendorDetailsBo getVendorDetails(String vendorId) {
        VendorDetailsEntity vendorDetailsEntity = vendorDetailsSlaveRepo.findByVendorId(vendorId);
        return serviceMapper.convertVendorDetailsEntityToBo(vendorDetailsEntity);
    }

    @Override
    public VendorDetailsBo createVendorDetails(VendorDetailsRequestBo vendorDetailsRequestBo) {
        VendorDetailsBo vendorDetailsBo = VendorDetailsBo.builder()
                .vendorId(vendorDetailsRequestBo.getVendorId())
                .vendorName(vendorDetailsRequestBo.getVendorName())
                .vendorDesc(vendorDetailsRequestBo.getVendorDesc())
                .images(vendorDetailsRequestBo.getImages())
                .reviewCount(vendorDetailsRequestBo.getReviewCount())
                .providedServices(vendorDetailsRequestBo.getProvidedServices())
                .tags(vendorDetailsRequestBo.getTags())
                .build();
        VendorDetailsEntity vendorDetailsEntity = serviceMapper.convertVendorDetailsBoToEntity(vendorDetailsBo);
        return serviceMapper.convertVendorDetailsEntityToBo(vendorDetailsMasterRepo.save(vendorDetailsEntity));
    }

    @Override
    public VendorDetailsBo updateVendorDetails(VendorDetailsBo vendorDetailsBo) {
        VendorDetailsEntity vendorDetailsEntity = serviceMapper.convertVendorDetailsBoToEntity(vendorDetailsBo);
        return serviceMapper.convertVendorDetailsEntityToBo(vendorDetailsEntity);
    }


}
