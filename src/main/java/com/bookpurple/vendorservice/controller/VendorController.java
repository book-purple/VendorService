package com.bookpurple.vendorservice.controller;

import com.bookpurple.vendorservice.bo.NewVendorRequestBo;
import com.bookpurple.vendorservice.bo.VendorBo;
import com.bookpurple.vendorservice.dto.VendorRequestDto;
import com.bookpurple.vendorservice.constant.Constants;
import com.bookpurple.vendorservice.dto.VendorDto;
import com.bookpurple.vendorservice.mapper.VendorServiceMapper;
import com.bookpurple.vendorservice.service.IVendorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping(value = Constants.UriConstants.PUT_DUMMY_VENDORS, produces = {APPLICATION_JSON_VALUE})
    public ResponseEntity<String> addDummyVendors() {
        vendorService.addDummyVendors();
        return new ResponseEntity("success", HttpStatus.OK);
    }

    @PostMapping(value = Constants.UriConstants.ADD_VENDOR,
            consumes = {APPLICATION_JSON_VALUE},
            produces = {APPLICATION_JSON_VALUE})
    public ResponseEntity<String> addVendor(@RequestBody VendorRequestDto vendorRequestDto) {
        NewVendorRequestBo vendorRequestBo = vendorServiceMapper.convertNewVendorDtoToBo(vendorRequestDto);
        vendorService.createVendor(vendorRequestBo);
        return new ResponseEntity<>("Success", HttpStatus.OK);
    }
}
