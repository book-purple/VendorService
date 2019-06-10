package com.bookpurple.vendorservice.model;

import com.bookpurple.vendorservice.bo.EventVendorMappingBo;
import com.bookpurple.vendorservice.bo.ServiceVendorMappingBo;
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
public class AbstractCatalogVendorMappingResponse {

    @JsonProperty("event_vendor_mapping")
    private EventVendorMappingBo eventVendorMappingBo;

    @JsonProperty("service_vendor_mapping")
    private ServiceVendorMappingBo serviceVendorMappingBo;
}
