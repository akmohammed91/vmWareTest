package com.example.demo.service.impl;

import com.example.demo.model.DriverRegister;
import com.example.demo.model.Register;
import com.example.demo.model.UserRegister;
import com.example.demo.service.UserRegisterService;
import org.springframework.stereotype.Service;

@Service("userRegisterService")
public class UserRegisterServiceImpl implements UserRegisterService {
    @Override
    public void register(Register register) {

        UserRegister userRegister = (UserRegister)register;

    }
}
