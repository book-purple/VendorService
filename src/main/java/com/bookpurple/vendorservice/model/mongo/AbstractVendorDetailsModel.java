package com.bookpurple.vendorservice.model.mongo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;

import java.util.List;

/*
 * Written by Gaurav Sharma on 09 Jun 2019
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public abstract class AbstractVendorDetailsModel {

    @Id
    private String id;

    @Indexed(unique = true)
    private String vendorId;

    private String vendorName;
    private String vendorDesc;

    private int reviewCount;
    private String location;
    private List<String> providedServices;
    private List<String> tags;
    private List<String> images;
}
