package com.example.BankDemo2.controllers;


import com.example.BankDemo2.models.Transaction;
import com.example.BankDemo2.repositories.AccountRepository;
import com.example.BankDemo2.repositories.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.BankDemo2.models.Account;

import java.time.LocalDate;
import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/transaction")
public class TransactionController {

    @Autowired
    TransactionRepository transactionRepository;
    @Autowired
    AccountRepository accountRepository;

    @GetMapping("/transactions")
    public List<Transaction> getAllTransactions() {return (List<Transaction>) transactionRepository.findAll();}

    @GetMapping("/transactions/{accountNumber}")
    public List<Transaction> getTransactionByAccountNumber(@PathVariable(value = "accountNumber") Long accountNumber){
        return transactionRepository.findByAccount_AccountNumber(accountNumber);
    }

    @PostMapping("/transactions/{accountNumber}")
    public void addTransactionByAccountNumber(@RequestBody Transaction transaction, @PathVariable(value = "accountNumber") Long accountNumber){

        Account account = accountRepository.findAccountByAccountNumber(accountNumber);
        transaction.setAccount(account);
        transaction.setDate(LocalDate.now());
        transactionRepository.save(transaction);
        System.out.println("Transaction Update Made: Transaction Added");
    }

}
