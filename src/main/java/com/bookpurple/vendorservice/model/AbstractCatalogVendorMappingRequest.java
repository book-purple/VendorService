package com.bookpurple.vendorservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

/*
 * Written by Gaurav Sharma on 03 Jun 2019
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AbstractCatalogVendorMappingRequest {

    @JsonProperty("eventId")
    private String eventId;

    @JsonProperty("serviceId")
    private String serviceId;

    @JsonProperty("vendorId")
    private String vendorId;
}
