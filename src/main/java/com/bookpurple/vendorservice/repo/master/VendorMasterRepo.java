package com.bookpurple.vendorservice.repo.master;

import com.bookpurple.vendorservice.entity.VendorEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/*
 * Created by Gaurav Sharma on 18 May 2019
 */
@Repository
public interface VendorMasterRepo extends MongoRepository<VendorEntity, String> {
}
