package com.bookpurple.vendorservice.bo;

import com.bookpurple.vendorservice.model.AbstractDetailsPageResponseModel;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/*
 * Written by Gaurav Sharma on 09 Jun 2019
 */
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
public class DetailsPageResponseBo extends AbstractDetailsPageResponseModel {

    @Builder
    public DetailsPageResponseBo(VendorDetailsBo vendorDetails) {
        super(vendorDetails);
    }
}
