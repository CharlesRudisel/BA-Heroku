package com.example.BankDemo2.repositories;


import com.example.BankDemo2.models.Account;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AccountRepository extends CrudRepository<Account, String> {

    List<Account> findByCustomer_CustomerNumber(Long customer_customerNumber);



    List<Account> findByCustomer_UsernameAndCustomer_Password(String customer_username, String customer_password);

    Account findAccountByAccountNumber(Long accountNumber);
}