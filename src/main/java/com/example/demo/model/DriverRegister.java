package com.example.demo.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(
        ignoreUnknown = true
)

public class DriverRegister extends Register{
    public DriverRegister(String name, String mobileNo, String id) {
        super(name, mobileNo, id);
    }
}
