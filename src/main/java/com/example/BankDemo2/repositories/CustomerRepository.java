package com.example.BankDemo2.repositories;


import com.example.BankDemo2.models.Customer;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

    Customer findBycustomerNumber(Long customerNumber);
    Customer findByEmailAndPassword(String email, String password);


    Customer findByEmail(String email);
}