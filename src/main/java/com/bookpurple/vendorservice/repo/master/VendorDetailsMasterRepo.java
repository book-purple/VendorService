package com.bookpurple.vendorservice.repo.master;

import com.bookpurple.vendorservice.entity.VendorDetailsEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

/*
 * Written by Gaurav Sharma on 10 Jun 2019
 */
public interface VendorDetailsMasterRepo extends MongoRepository<VendorDetailsEntity, String> {
}
