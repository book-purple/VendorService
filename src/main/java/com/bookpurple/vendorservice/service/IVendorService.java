package com.bookpurple.vendorservice.service;

import com.bookpurple.vendorservice.bo.NewVendorRequestBo;
import com.bookpurple.vendorservice.bo.VendorBo;
import com.bookpurple.vendorservice.bo.VendorDetailsBo;
import com.bookpurple.vendorservice.bo.VendorDetailsRequestBo;
import com.bookpurple.vendorservice.entity.VendorEntity;

import java.util.List;

/*
 * Created by Gaurav Sharma on 18 May 2019
 */
public interface IVendorService {

    VendorBo createVendor(NewVendorRequestBo vendorRequestBo);

    List<VendorBo> getAllVendors();

    void addDummyVendors();

    VendorBo getVendorByVendorId(String vendorId);

    VendorEntity getVendorEntityByVendorId(String vendorId);

    VendorDetailsBo getVendorDetails(String vendorId);

    VendorDetailsBo createVendorDetails(VendorDetailsRequestBo vendorDetailsRequestBo);

    VendorDetailsBo updateVendorDetails(VendorDetailsBo vendorDetailsBo);
}
