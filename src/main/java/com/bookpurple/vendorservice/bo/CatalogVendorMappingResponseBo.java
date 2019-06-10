package com.bookpurple.vendorservice.bo;

import com.bookpurple.vendorservice.model.AbstractCatalogVendorMappingResponse;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/*
 * Written by Gaurav Sharma on 03 Jun 2019
 */
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
public class CatalogVendorMappingResponseBo extends AbstractCatalogVendorMappingResponse {

    @Builder
    public CatalogVendorMappingResponseBo(EventVendorMappingBo eventVendorMappingBo,
                                          ServiceVendorMappingBo serviceVendorMappingBo) {
        super(eventVendorMappingBo, serviceVendorMappingBo);
    }
}
