package com.bookpurple.vendorservice.entity;

import com.bookpurple.vendorservice.model.mongo.ServiceVendorMappingModel;
import org.springframework.data.mongodb.core.mapping.Document;

/*
 * Written by Gaurav Sharma on 30 May 2019
 */
@Document(collection = "service_vendor_mapping")
public class ServiceVendorMappingEntity extends ServiceVendorMappingModel {
}
