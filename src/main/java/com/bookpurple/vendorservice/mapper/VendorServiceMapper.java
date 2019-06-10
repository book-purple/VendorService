package com.bookpurple.vendorservice.mapper;

import com.bookpurple.vendorservice.bo.*;
import com.bookpurple.vendorservice.dto.*;
import com.bookpurple.vendorservice.entity.EventVendorMappingEntity;
import com.bookpurple.vendorservice.entity.ServiceVendorMappingEntity;
import com.bookpurple.vendorservice.entity.VendorDetailsEntity;
import com.bookpurple.vendorservice.entity.VendorEntity;
import org.mapstruct.Mapper;

import java.util.List;

/*
 * Created by Gaurav Sharma on 18 May 2019
 */
@Mapper(componentModel = "spring")
public interface VendorServiceMapper {

    VendorEntity convertVendorBoToEntity(VendorBo vendorBo);

    VendorBo convertVendorEntityToBo(VendorEntity vendorEntity);

    List<VendorBo> convertVendorEntityListToBoList(List<VendorEntity> vendorEntities);

    List<VendorDto> convertVendorBoListToDto(List<VendorBo> vendorBos);

    NewVendorRequestBo convertNewVendorDtoToBo(VendorRequestDto vendorRequestDto);

    CatalogVendorMappingResponseDto convertCatalogVendorMappingResponseBoToDto(CatalogVendorMappingResponseBo responseBo);

    CatalogVendorMappingResponseBo convertCatalogVendorMappingResponseDtoToBo(CatalogVendorMappingResponseDto responseDto);

    CatalogVendorMappingRequestBo convertCatalogVendorMappingRequestDtoToBo(CatalogVendorMappingRequestDto catalogVendorMappingRequestDto);

    EventVendorMappingBo convertEventVendorMappingEntityToBo(EventVendorMappingEntity eventVendorMappingEntity);

    EventVendorMappingEntity convertEventVendorMappingBoToEntity(EventVendorMappingBo eventVendorMappingBo);

    ServiceVendorMappingBo convertServiceVendorMappingEntityToBo(ServiceVendorMappingEntity serviceVendorMappingEntity);

    ServiceVendorMappingEntity convertServiceVendorMappingBoToEntity(ServiceVendorMappingBo serviceVendorMappingBo);

    VendorDetailsBo convertVendorDetailsEntityToBo(VendorDetailsEntity vendorDetailsEntity);

    VendorDetailsEntity convertVendorDetailsBoToEntity(VendorDetailsBo vendorDetailsBo);

    DetailsPageResponseDto convertDetailsPageResponseBoToDto(DetailsPageResponseBo detailsPageResponseBo);

    VendorDetailsRequestBo convertVendorDetailsRequestDtoToBo(VendorDetailsRequestDto vendorDetailsRequestDto);
}
