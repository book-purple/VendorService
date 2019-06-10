package com.bookpurple.vendorservice.model.mongo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;

import java.util.List;

/*
 * Written by Gaurav Sharma on 09 Jun 2019
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class AbstractVendorDetailsModel {

    @Id
    private String id;

    @Indexed(unique = true)
    @JsonProperty("vendorId")
    private String vendorId;

    @JsonProperty("vendorName")
    private String vendorName;

    @JsonProperty("vendorDesc")
    private String vendorDesc;

    @JsonProperty("reviewCount")
    private int reviewCount;

    @JsonProperty("location")
    private String location;

    @JsonProperty("providedServices")
    private List<String> providedServices;

    @JsonProperty("tags")
    private List<String> tags;

    @JsonProperty("images")
    private List<String> images;
}
