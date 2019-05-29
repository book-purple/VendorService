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
    }
}
