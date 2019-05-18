package com.bookpurple.vendorservice.controller;

import com.bookpurple.vendorservice.constant.Constants;
import com.bookpurple.vendorservice.dto.VendorDto;
import com.bookpurple.vendorservice.mapper.VendorServiceMapper;
import com.bookpurple.vendorservice.service.IVendorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

/*
 * Created by Gaurav Sharma on 11 May 2019
 */
@RestController
@RequestMapping("/vendor/v1")
public class VendorController {

    @Autowired
    private IVendorService vendorService;

    @Autowired
    private VendorServiceMapper vendorServiceMapper;

    @GetMapping(value = Constants.UriConstants.GET_ALL_VENDORS, produces = {APPLICATION_JSON_VALUE})
    public ResponseEntity<List<VendorDto>> getAllVendors() {
        List<VendorDto> vendorDtos = vendorServiceMapper.
                convertVendorBoListToDto(vendorService.getAllVendors());
        return new ResponseEntity(vendorDtos, HttpStatus.OK);
    }
}
