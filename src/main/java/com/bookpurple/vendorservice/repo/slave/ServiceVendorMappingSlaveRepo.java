package com.bookpurple.vendorservice.repo.slave;

import com.bookpurple.vendorservice.entity.ServiceVendorMappingEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/*
 * Written by Gaurav Sharma on 04 Jun 2019
 */
@Repository
public interface ServiceVendorMappingSlaveRepo extends MongoRepository<ServiceVendorMappingEntity, String> {

    ServiceVendorMappingEntity findByServiceId(String serviceId);
}
