package com.bookpurple.vendorservice.model.mongo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;

/*
 * Written by Gaurav Sharma on 30 May 2019
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EventVendorMappingModel {

    @Id
    private String id;

    @Indexed(unique = true)
    private String eventId;

    @DBRef
    private VendorModel vendorModel;
}
