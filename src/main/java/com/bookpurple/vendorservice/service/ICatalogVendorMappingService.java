package com.bookpurple.vendorservice.service;

import com.bookpurple.vendorservice.bo.CatalogVendorMappingRequestBo;
import com.bookpurple.vendorservice.bo.CatalogVendorMappingResponseBo;

/*
 * Written by Gaurav Sharma on 03 Jun 2019
 */
public interface ICatalogVendorMappingService {

    /**
     * Function to create vendor mapping with event and service
     *
     * @param catalogVendorMappingRequestBo catalogVendorMappingRequestBo
     * @return {@link CatalogVendorMappingResponseBo}
     */
    CatalogVendorMappingResponseBo createVendorMapping(CatalogVendorMappingRequestBo catalogVendorMappingRequestBo);
}
