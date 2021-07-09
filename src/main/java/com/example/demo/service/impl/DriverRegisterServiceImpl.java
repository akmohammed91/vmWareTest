package com.example.demo.service.impl;

import com.example.demo.model.DriverRegister;
import com.example.demo.model.Register;
import com.example.demo.service.DriverRegisterService;
import org.springframework.stereotype.Service;

@Service("driverRegisterService")
public class DriverRegisterServiceImpl implements DriverRegisterService {

    @Override
    public void register(Register register) {
        DriverRegister driverRegister = (DriverRegister)register;


    }
}
