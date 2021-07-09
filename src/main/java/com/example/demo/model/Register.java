package com.example.demo.model;

import java.io.Serializable;

public class Register implements Serializable {
    String name;
    String mobileNo;
    String id;

    public Register(String name, String mobileNo, String id) {
        this.name = name;
        this.mobileNo = mobileNo;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public String getId() {
        return id;
    }

}
