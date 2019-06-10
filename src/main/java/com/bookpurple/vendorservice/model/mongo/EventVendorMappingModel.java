package com.bookpurple.vendorservice.model.mongo;

import com.bookpurple.vendorservice.entity.VendorEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.codehaus.jackson.annotate.JsonProperty;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;

import java.util.List;

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
    @JsonProperty("eventId")
    private String eventId;

    @DBRef(db = "vendor")
    @JsonProperty("vendor")
    private List<VendorEntity> vendorEntities;
}