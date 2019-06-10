package com.bookpurple.vendorservice.bo;

import com.bookpurple.vendorservice.entity.VendorEntity;
import com.bookpurple.vendorservice.model.mongo.EventVendorMappingModel;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.List;

/*
 * Written by Gaurav Sharma on 03 Jun 2019
 */
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
public class EventVendorMappingBo extends EventVendorMappingModel {

    @Builder
    public EventVendorMappingBo(String id, String eventId, List<VendorEntity> vendorEntities) {
        super(id, eventId, vendorEntities);
    }
}
