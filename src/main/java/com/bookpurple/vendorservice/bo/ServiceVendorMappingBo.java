package com.bookpurple.vendorservice.bo;

import com.bookpurple.vendorservice.entity.VendorEntity;
import com.bookpurple.vendorservice.model.mongo.ServiceVendorMappingModel;
import com.bookpurple.vendorservice.model.mongo.VendorModel;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.List;

/*
 * Written by Gaurav Sharma on 04 Jun 2019
 */
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
public class ServiceVendorMappingBo extends ServiceVendorMappingModel {

    @Builder
    public ServiceVendorMappingBo(String id, String serviceId, List<VendorEntity> vendorEntities) {
        super(id, serviceId, vendorEntities);
    }
}
