package com.bookpurple.vendorservice.component;

import com.bookpurple.vendorservice.bo.DetailsPageResponseBo;

/*
 * Written by Gaurav Sharma on 10 Jun 2019
 */
public interface IVendorDetailsPageService {

    /**
     * Function to create Vendor Details Page
     *
     * @param vendorId vendorId
     * @return {@link DetailsPageResponseBo}
     */
    DetailsPageResponseBo createVendorDetailsPage(String vendorId);
}
