package com.bookpurple.vendorservice.repo.slave;

import com.bookpurple.vendorservice.entity.VendorDetailsEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

/*
 * Written by Gaurav Sharma on 10 Jun 2019
 */
public interface VendorDetailsSlaveRepo extends MongoRepository<VendorDetailsEntity, String> {

    VendorDetailsEntity findByVendorId(String vendorId);
}
