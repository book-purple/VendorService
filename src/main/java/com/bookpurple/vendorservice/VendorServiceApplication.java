package com.bookpurple.vendorservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/*
 * Created by Gaurav Sharma on 11 May 2019
 */
@SpringBootApplication
@ComponentScan({"com.bookpurple"})
public class VendorServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(VendorServiceApplication.class, args);
    }
}
