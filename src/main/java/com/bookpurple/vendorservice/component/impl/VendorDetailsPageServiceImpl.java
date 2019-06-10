package com.bookpurple.vendorservice.component.impl;

import com.bookpurple.vendorservice.bo.DetailsPageResponseBo;
import com.bookpurple.vendorservice.bo.VendorDetailsBo;
import com.bookpurple.vendorservice.component.IVendorDetailsPageService;
import com.bookpurple.vendorservice.service.IVendorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/*
 * Written by Gaurav Sharma on 10 Jun 2019
 */
@Component
public class VendorDetailsPageServiceImpl implements IVendorDetailsPageService {

    @Autowired
    private IVendorService vendorService;

    @Override
    public DetailsPageResponseBo createVendorDetailsPage(String vendorId) {
        VendorDetailsBo vendorDetailsBo = vendorService.getVendorDetails(vendorId);
        return DetailsPageResponseBo.builder()
                .vendorDetails(vendorDetailsBo)
                .build();
    }
}
