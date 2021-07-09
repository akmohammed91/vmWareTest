package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(
        ignoreUnknown = true
)
public class UserRegister extends Register {
    public UserRegister(String name, String mobileNo, String id) {
        super(name, mobileNo, id);
    }
}
