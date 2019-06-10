package com.bookpurple.vendorservice.repo.slave;

import com.bookpurple.vendorservice.entity.EventVendorMappingEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/*
 * Written by Gaurav Sharma on 03 Jun 2019
 */
@Repository
public interface EventVendorMappingSlaveRepo extends MongoRepository<EventVendorMappingEntity, String> {

    EventVendorMappingEntity findByEventId(String eventId);
}
