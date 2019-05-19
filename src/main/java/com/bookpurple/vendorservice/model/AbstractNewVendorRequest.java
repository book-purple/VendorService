package com.bookpurple.vendorservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

/*
 * Created by Gaurav Sharma on 18 May 2019
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class AbstractNewVendorRequest {

    @JsonProperty("name")
    private String name;

    @JsonProperty("email")
    private String email;

    @JsonProperty("mobile")
    private String mobile;

    @JsonProperty("image")
    private String image;
}
