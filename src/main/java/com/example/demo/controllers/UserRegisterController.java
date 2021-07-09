package com.example.demo.controllers;

import com.example.demo.model.DriverRegister;
import com.example.demo.model.UserRegister;
import com.example.demo.service.DriverRegisterService;
import com.example.demo.service.UserRegisterService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;

@RestController
public class UserRegisterController {
    private UserRegisterService userRegisterService;

    @Inject
    public UserRegisterController(UserRegisterService userRegisterService){
        this.userRegisterService = userRegisterService;
    }


    @RequestMapping(value = "/register/user/", method = RequestMethod.POST)
    public ResponseEntity<String> create(@RequestBody UserRegister userRegister) {
        //look for existing games or create new game
        userRegisterService.register(userRegister);

        return new ResponseEntity<>("user msg", HttpStatus.OK);
    }
}
