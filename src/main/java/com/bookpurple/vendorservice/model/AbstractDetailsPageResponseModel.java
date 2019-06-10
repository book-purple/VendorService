package com.bookpurple.vendorservice.model;

import com.bookpurple.vendorservice.bo.VendorDetailsBo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

/*
 * Written by Gaurav Sharma on 09 Jun 2019
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class AbstractDetailsPageResponseModel {

    @JsonProperty("vendorDetails")
    private VendorDetailsBo vendorDetails;


    // can add new fields
}
