package com.bookpurple.vendorservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Date;

/*
 * Created by Gaurav Sharma on 18 May 2019
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class AbstractVendorModel {

    @Id
    private String id;

    @NotNull
    @NotBlank
    @NotEmpty
    private String name;

    @NotNull
    @NotBlank
    @NotEmpty
    private String uid;
    private String email;
    private String mobile;
    private Date createdAt;
    private String image;
}
