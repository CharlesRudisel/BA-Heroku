package com.example.BankDemo2.services;

import com.example.BankDemo2.models.Customer;
import com.example.BankDemo2.repositories.RegistrationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegistrationService {

    @Autowired
    private RegistrationRepository repo;

    public Customer saveUser(Customer customer){

        return repo.save(customer);

    }

    public Customer fetchUserByEmailId(String email){

        return  repo.findByEmail(email);
    }

    public Customer fetchUserByEmailIdAndPassword(String email, String password){

        return  repo.findByEmailAndPassword(email, password);
    }
}
