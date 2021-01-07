package com.example.BankDemo2.controllers;


import com.example.BankDemo2.models.Account;
import com.example.BankDemo2.models.Customer;
import com.example.BankDemo2.repositories.AccountRepository;
import com.example.BankDemo2.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;



@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/account")
public class AccountController {

    public String woah = "this test worked";

    @Autowired
    AccountRepository accountRepository;
    @Autowired
    CustomerRepository customerRepository;

    @GetMapping("/accounts")
    public List<Account> getAllAccounts() {return (List<Account>) accountRepository.findAll();}

    @GetMapping("/accountz")
    public String test() {

        return (woah);
    };

    @GetMapping("/accounts/{customer_number}")
    public List<Account> getCustomerByCustomerNumber(@PathVariable(value = "customer_number") Long customerNumber){
        return accountRepository.findByCustomer_CustomerNumber(customerNumber);
    }

    @GetMapping("/accounts/email/{email}")
    public List<Account> getCustomerByEmail(@PathVariable(value = "email") String email){
        System.out.println("Accounts were viewed by email");
        return accountRepository.findByCustomer_email(email);

    }


    @GetMapping("/accounts/focus/{account_number}")
    public Account getCustomerByAccountNumber(@PathVariable(value = "account_number") Long accountNumber){
        return accountRepository.findAccountByAccountNumber(accountNumber);
    }

    @PostMapping("/accounts/create/{email}")
    public void createAccountByCustomerNumber(@RequestBody Account account, @PathVariable(value = "email") String email ){

        Customer customer = customerRepository.findByEmail(email);
        account.setCustomer(customer);
        account.setDate_of_creation(LocalDate.now());
        accountRepository.save(account);
        System.out.println("Account was created");

    }


    @PutMapping("/accounts/focus/{account_number}")
    public ResponseEntity<?> updateTopic(@RequestBody Account account, @PathVariable long account_number) {
        Account newAccount = accountRepository.findAccountByAccountNumber(account_number);
        if (newAccount != null) {
            newAccount.setBalance(account.getBalance());

            accountRepository.save(newAccount);
            System.out.println("Account Update was made: Account Balance Modified");

        }
        return null;
    }



}
