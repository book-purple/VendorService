package com.bookpurple.vendorservice.entity;

import com.bookpurple.vendorservice.model.mongo.VendorModel;
import org.springframework.data.mongodb.core.mapping.Document;

/*
 * Created by Gaurav Sharma on 18 May 2019
 */
@Document(collection = "vendor")
public class VendorEntity extends VendorModel {
}
