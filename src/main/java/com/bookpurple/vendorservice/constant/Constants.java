package com.bookpurple.vendorservice.constant;

/*
 * Created by Gaurav Sharma on 18 May 2019
 */
public class Constants {

    public static class SecurityConstants {
        public static final String X_GBP_AUTH = "X-GBP-AUTH";
        public static final String AUTHORIZATION = "Authorization";
    }

    public static class UriConstants {
        public static final String GET_ALL_VENDORS = "/get/all";
        public static final String PUT_DUMMY_VENDORS = "/dummy/put";
        public static final String ADD_VENDOR = "/add";
        public static final String GET_VENDOR_DETAILS = "/details";
        public static final String GET_VENDOR_LIST = "/vendors/{catalogRequestId}";
        public static final String ADD_VENDOR_MAPPING = "/vendor/mapping/add";
        public static final String GET_VENDOR_MAPPING = "/vendor/mapping/get";
        public static final String ADD_SERVICE_VENDOR_MAPPING = "/service/vendor/add";

        public static final String VENDOR_DETAILS_API = "vendor/details/{vendor_id}";
    }
}
