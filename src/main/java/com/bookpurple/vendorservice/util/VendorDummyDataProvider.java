package com.bookpurple.vendorservice.util;

import com.bookpurple.vendorservice.bo.VendorBo;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/*
 * Created by Gaurav Sharma on 18 May 2019
 */
@Component
public class VendorDummyDataProvider {

    public List<VendorBo> getDummyVendorList() {
        List<VendorBo> vendorBos = new ArrayList<>();
        vendorBos.add(generateVendorBo("The Taramind Tree", "bptt@gmail.com", "9991110008", ""));
        vendorBos.add(generateVendorBo("Shadi Mubarak", "bpsm@gmail.com", "8889998889", ""));
        vendorBos.add(generateVendorBo("The Lalits", "bplalits@gmail.com", "7980704123", ""));
        vendorBos.add(generateVendorBo("Happy Wedding", "bphp@gmail.com", "9898989898", ""));
        vendorBos.add(generateVendorBo("BC Venue", "bpbcvenue@gmail.com", "7878787878", ""));
        vendorBos.add(generateVendorBo("MC Sher Catering", "bpmcsher@gmail.com", "8686867878", ""));
        vendorBos.add(generateVendorBo("Slim Shady Venue", "bpssv@gmail.com", "9999999999", ""));
        return vendorBos;
    }

    private VendorBo generateVendorBo(String name,
                                      String email,
                                      String mobile,
                                      String image) {
        return VendorBo.builder()
                .name(name)
                .uid("BP" + CommonUtil.UidGenerator(5))
                .email(email)
                .mobile(mobile)
                .image(image)
                .createdAt(new Date())
                .build();
    }
}
