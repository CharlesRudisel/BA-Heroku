package com.example.BankDemo2.repositories;

import com.example.BankDemo2.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegistrationRepository extends JpaRepository<Customer, Integer> {

    public Customer findByEmail(String email);
    public Customer findByEmailAndPassword(String email, String password);
}
