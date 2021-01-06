package com.example.BankDemo2.controllers;


import com.example.BankDemo2.models.Customer;
import com.example.BankDemo2.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    CustomerRepository customerRepository;

    @GetMapping("/customers")
    public List<Customer> getAllCustomers() {return (List<Customer>) customerRepository.findAll();}

    @GetMapping("/customers/{customer_number}")
    public Optional<Customer> getCustomerByCustomerNumber(@PathVariable(value = "customer_number") Long customerNumber){
        return customerRepository.findById(customerNumber);
    }

    @GetMapping("/customers/email/{email}")
    public Customer getCustomerByEmail(@PathVariable(value = "email") String email){
        return customerRepository.findByEmail(email);
    }


}
