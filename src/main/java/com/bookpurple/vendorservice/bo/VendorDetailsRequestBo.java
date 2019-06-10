package com.bookpurple.vendorservice.bo;

import com.bookpurple.vendorservice.model.mongo.AbstractVendorDetailsModel;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.List;

/*
 * Written by Gaurav Sharma on 10 Jun 2019
 */
@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
public class VendorDetailsRequestBo extends AbstractVendorDetailsModel {

    @Builder
    public VendorDetailsRequestBo(String id,
                                  String vendorId,
                                  String vendorName,
                                  String vendorDesc,
                                  int reviewCount,
                                  String location,
                                  List<String> providedServices,
                                  List<String> tags,
                                  List<String> images) {
        super(id, vendorId, vendorName, vendorDesc, reviewCount, location, providedServices, tags, images);
    }
}
