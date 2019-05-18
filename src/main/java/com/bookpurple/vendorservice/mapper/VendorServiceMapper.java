package com.bookpurple.vendorservice.mapper;

import com.bookpurple.vendorservice.bo.VendorBo;
import com.bookpurple.vendorservice.dto.VendorDto;
import com.bookpurple.vendorservice.entity.VendorEntity;
import org.mapstruct.Mapper;

import java.util.List;

/*
 * Created by Gaurav Sharma on 18 May 2019
 */
@Mapper(componentModel = "spring")
public interface VendorServiceMapper {

    List<VendorBo> convertVendorEntityListToBoList(List<VendorEntity> vendorEntities);

    List<VendorDto> convertVendorBoListToDto(List<VendorBo> vendorBos);
}
