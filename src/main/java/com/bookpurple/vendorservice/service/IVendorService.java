package com.bookpurple.vendorservice.service;

import com.bookpurple.vendorservice.bo.NewVendorRequestBo;
import com.bookpurple.vendorservice.bo.VendorBo;

import java.util.List;

/*
 * Created by Gaurav Sharma on 18 May 2019
 */
public interface IVendorService {

    VendorBo createVendor(NewVendorRequestBo vendorRequestBo);

    List<VendorBo> getAllVendors();

    void addDummyVendors();
}
