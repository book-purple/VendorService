package com.bookpurple.vendorservice.bo;

import com.bookpurple.vendorservice.model.mongo.VendorModel;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Date;

/*
 * Created by Gaurav Sharma on 18 May 2019
 */
@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
public class VendorBo extends VendorModel {

    @Builder
    public VendorBo(String id,
                    @NotNull @NotBlank @NotEmpty String name,
                    @NotNull @NotBlank @NotEmpty String uid,
                    String email,
                    String mobile,
                    Date createdAt,
                    String image) {
        super(id, name, uid, email, mobile, createdAt, image);
    }
}
