package com.bookpurple.vendorservice.entity;

import com.bookpurple.vendorservice.model.mongo.AbstractVendorDetailsModel;
import org.springframework.data.mongodb.core.mapping.Document;

/*
 * Written by Gaurav Sharma on 09 Jun 2019
 */
@Document(collection = "vendor_details")
public class VendorDetailsEntity extends AbstractVendorDetailsModel {
}
