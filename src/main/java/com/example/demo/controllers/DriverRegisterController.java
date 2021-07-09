package com.example.demo.controllers;

import com.example.demo.model.DriverRegister;
import com.example.demo.service.DriverRegisterService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;

@RestController
public class DriverRegisterController {
    private DriverRegisterService driverRegisterService;

    @Inject
    public DriverRegisterController(DriverRegisterService driverRegisterService){
        this.driverRegisterService = driverRegisterService;
    }


    @RequestMapping(value = "/register/driver/", method = RequestMethod.POST)
    public ResponseEntity<String> create(@RequestBody DriverRegister driverRegister) {
        //look for existing games or create new game
        driverRegisterService.register(driverRegister);

        return new ResponseEntity<>("msg", HttpStatus.OK);
    }


}
