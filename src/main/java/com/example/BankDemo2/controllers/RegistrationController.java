package com.example.BankDemo2.controllers;

import com.example.BankDemo2.models.Customer;
import com.example.BankDemo2.services.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")
@RestController
public class RegistrationController {

    @Autowired
    private RegistrationService service;

    @PostMapping("/registerUser")
    public Customer registerUser(@RequestBody Customer customer) throws Exception {

        String tempEmailId = customer.getEmail();
        if(tempEmailId != null && !"".equals(tempEmailId)){
           Customer userObj =  service.fetchUserByEmailId(tempEmailId);
           if(userObj != null){
               throw new Exception("User with "+ tempEmailId + " already exists");
           }
        }
        Customer userObj = null;
        userObj = service.saveUser(customer);
        return userObj;

    }

    @PostMapping("/login")
    public Customer loginUser(@RequestBody Customer customer) throws Exception {
        String tempEmailId = customer.getEmail();
        String tempPassword = customer.getPassword();

        Customer userObj = null;
        if(tempEmailId != null && tempPassword != null){
           userObj = service.fetchUserByEmailIdAndPassword(tempEmailId, tempPassword);
        }
        if(userObj == null){
            throw new Exception("Bad Credentials");
        }
        return userObj;
    }
}
