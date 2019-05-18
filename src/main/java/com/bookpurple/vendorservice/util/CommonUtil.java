package com.bookpurple.vendorservice.util;

import org.apache.commons.lang3.RandomStringUtils;

/*
 * Created by Gaurav Sharma on 18 May 2019
 */
public class CommonUtil {

    public static String UidGenerator(int length) {
        return RandomStringUtils.randomAlphabetic(length);
    }
}
