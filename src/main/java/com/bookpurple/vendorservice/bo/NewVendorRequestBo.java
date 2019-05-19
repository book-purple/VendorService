package com.bookpurple.vendorservice.bo;

import com.bookpurple.vendorservice.model.AbstractNewVendorRequest;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/*
 * Created by Gaurav Sharma on 18 May 2019
 */
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
public class NewVendorRequestBo extends AbstractNewVendorRequest {

    @Builder
    public NewVendorRequestBo(String name, String email, String mobile, String image) {
        super(name, email, mobile, image);
    }
}
