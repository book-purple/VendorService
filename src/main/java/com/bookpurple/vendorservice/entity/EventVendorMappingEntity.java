package com.bookpurple.vendorservice.entity;

import com.bookpurple.vendorservice.model.mongo.EventVendorMappingModel;
import org.springframework.data.mongodb.core.mapping.Document;

/*
 * Written by Gaurav Sharma on 30 May 2019
 */
@Document(collection = "event_vendor_mapping")
public class EventVendorMappingEntity extends EventVendorMappingModel {
}
