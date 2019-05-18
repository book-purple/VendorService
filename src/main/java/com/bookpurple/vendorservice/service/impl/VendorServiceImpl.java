package com.bookpurple.vendorservice.service.impl;

import com.bookpurple.vendorservice.bo.VendorBo;
import com.bookpurple.vendorservice.entity.VendorEntity;
import com.bookpurple.vendorservice.mapper.VendorServiceMapper;
import com.bookpurple.vendorservice.repo.master.VendorMasterRepo;
import com.bookpurple.vendorservice.repo.slave.VendorSlaveRepo;
import com.bookpurple.vendorservice.service.IVendorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

    @Override
    public VendorBo createVendor() {
        // todo: complete this function
        return null;
    }

    @Override
    public List<VendorBo> getAllVendors() {
        return serviceMapper.convertVendorEntityListToBoList(vendorSlaveRepo.findAll());
    }
}
