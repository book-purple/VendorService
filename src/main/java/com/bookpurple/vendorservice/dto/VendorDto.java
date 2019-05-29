package com.bookpurple.vendorservice.dto;

import com.bookpurple.vendorservice.model.mongo.VendorModel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/*
 * Created by Gaurav Sharma on 18 May 2019
 */
@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
public class VendorDto extends VendorModel {
}
