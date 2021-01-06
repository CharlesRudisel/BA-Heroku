package com.example.BankDemo2;

import com.example.BankDemo2.models.Account;
import com.example.BankDemo2.models.Customer;
import com.example.BankDemo2.models.Transaction;
import com.example.BankDemo2.repositories.AccountRepository;
import com.example.BankDemo2.repositories.CustomerRepository;
import com.example.BankDemo2.repositories.TransactionRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BankDemo2Application extends SpringBootServletInitializer {


	public static void main(String[] args) {
		SpringApplication.run(BankDemo2Application.class, args);
	}

	@Bean
	public CommandLineRunner mappingDemo(CustomerRepository customerRepository,
										 AccountRepository accountRepository, TransactionRepository transactionRepository) {
		return args -> {

			//create a new book
			Customer customer = new Customer("Rudisel", "Devante", "charlesrudisel@gmail.com", ("a").replaceAll("\\s", ""));
			Customer customer2 = new Customer("Rudisel", "Riley", "rileyrudisel@gmail.com", ("a").replaceAll("\\s", ""));
			Customer customer3 = new Customer("Watkins", "Hannah", "hannawatkins@gmail.com", ("a").replaceAll("\\s", ""));

			// save the book
			customerRepository.save(customer);
			customerRepository.save(customer2);


			Account acct1 = new Account(1, "checking", 0, customer);
			Account acct2 = new Account(65, "savings", 0.3, customer);
			Account acct3 = new Account(95, "credit card", 0.05, customer);
			Account acct4 = new Account(1, "checking", 0, customer2);
			Account acct5 = new Account(65, "savings", 0.3, customer2);
			Account acct6 = new Account(95, "credit card", 0.05, customer2);

			accountRepository.save(acct1);
			accountRepository.save(acct2);
			accountRepository.save(acct3);
			accountRepository.save(acct4);
			accountRepository.save(acct5);
			accountRepository.save(acct6);



			Transaction trans1 = new Transaction(Math.round(((double)(Math.random() * 1000) * 100.0) / 100.0), "Vans Store","Income",acct1);
			Transaction trans2 = new Transaction(Math.round(((double)(Math.random() * 100) * 100.0) / -100.0), "CVS Store","Pharmacy",acct1);
			Transaction trans3 = new Transaction(Math.round(((double)(Math.random() * 10000) * 100.0) / 100.0), "Paycheck","Income",acct1);
			Transaction trans4 = new Transaction(Math.round(((double)(Math.random() * 100) * 100.0) / -100.0), "Publix Supermarket","Grocery", acct1);
			Transaction trans5 = new Transaction(Math.round(((double)(Math.random() * 1000) * 100.0) / -100.0), "Youtube Tv","Entertainment", acct1);
			Transaction trans6 = new Transaction(Math.round(((double)(Math.random() * 10000) * 100.0) / -100.0), "Rent","Living",acct1);
			Transaction trans7 = new Transaction(Math.round(((double)(Math.random() * 10000) * 100.0) / -100.0), "Car Insurance Co.","Auto",acct2);
			Transaction trans8 = new Transaction(Math.round(((double)(Math.random() * 1000) * 100.0) / -100.0), "T-Mobile Co.","Mobile",acct2);
			Transaction trans9 = new Transaction(Math.round(((double)(Math.random() * 1000) * 100.0) / 100.0), "Fiver Payment","Income",acct2);
			Transaction trans10 = new Transaction(Math.round(((double)(Math.random() * 10000) * 100.0) / -100.0), "AT&T Wifi","Mobile",acct2);
			Transaction trans11 = new Transaction(Math.round(((double)(Math.random() * 100) * 100.0) / 100.0), "Fiver Payment", "Income",acct2);
			Transaction trans12 = new Transaction(Math.round(((double)(Math.random() * 1000) * 100.0) / -100.0), "vans store","Retail",acct2);
			Transaction trans13 = new Transaction(Math.round(((double)(Math.random() * 100) * 100.0) / -100.0), " UPS store","Retail",acct3);
			Transaction trans14 = new Transaction(Math.round(((double)(Math.random() * 1000) * 100.0) / -100.0), "Target Supermarket","Retail",acct3);
			Transaction trans15 = new Transaction(Math.round(((double)(Math.random() * 10000) * 100.0) / -100.0), "iphone 11","Retail",acct3);
			Transaction trans16 = new Transaction(Math.round(((double)(Math.random() * 100) * 100.0) / -100.0), "vans store","Retail",acct3);
			Transaction trans17 = new Transaction(Math.round(((double)(Math.random() * 100000) * 100.0) / 100.0), "Paycheck", "Income",acct3);
			Transaction trans18 = new Transaction(Math.round(((double)(Math.random() * 1000) * 100.0) / -100.0), "Youtube Tv","Entertainment",acct3);


			Transaction trans19 = new Transaction(Math.round(((double)(Math.random() * 1000) * 100.0) / 100.0), "Vans Store", "Income",acct4);
			Transaction trans20 = new Transaction(Math.round(((double)(Math.random() * 100) * 100.0) / -100.0), "CVS Store","Pharmacy",acct4);
			Transaction trans21 = new Transaction(Math.round(((double)(Math.random() * 10000) * 100.0) / 100.0), "Paycheck", "Income",acct4);
			Transaction trans22 = new Transaction(Math.round(((double)(Math.random() * 100) * 100.0) / -100.0), "Publix Supermarket","Grocery",acct4);
			Transaction trans23 = new Transaction(Math.round(((double)(Math.random() * 1000) * 100.0) / -100.0), "Youtube Tv","Entertainment",acct4);
			Transaction trans24 = new Transaction(Math.round(((double)(Math.random() * 10000) * 100.0) / -100.0), "Rent","Living",acct4);
			Transaction trans25 = new Transaction(Math.round(((double)(Math.random() * 10000) * 100.0) / -100.0), "Car Insurance Co.","Auto",acct5);
			Transaction trans26 = new Transaction(Math.round(((double)(Math.random() * 1000) * 100.0) / -100.0), "T-Mobile Co.","Mobile",acct5);
			Transaction trans27 = new Transaction(Math.round(((double)(Math.random() * 1000) * 100.0) / 100.0), "Fiver Payment","Income",acct5);
			Transaction trans28 = new Transaction(Math.round(((double)(Math.random() * 10000) * 100.0) / -100.0), "AT&T Wifi","Mobile",acct5);
			Transaction trans29 = new Transaction(Math.round(((double)(Math.random() * 100) * 100.0) / 100.0), "Fiver Payment","Income",acct5);
			Transaction trans30 = new Transaction(Math.round(((double)(Math.random() * 1000) * 100.0) / -100.0), "vans store","Retail",acct5);
			Transaction trans31 = new Transaction(Math.round(((double)(Math.random() * 100) * 100.0) / -100.0), " UPS store","Retail",acct6);
			Transaction trans32 = new Transaction(Math.round(((double)(Math.random() * 1000) * 100.0) / -100.0), "Target Supermarket","Retail",acct6);
			Transaction trans33 = new Transaction(Math.round(((double)(Math.random() * 10000) * 100.0) / -100.0), "iphone 11","Retail",acct6);
			Transaction trans34 = new Transaction(Math.round(((double)(Math.random() * 100) * 100.0) / -100.0), "vans store","Retail",acct6);
			Transaction trans35 = new Transaction(Math.round(((double)(Math.random() * 100000) * 100.0) / 100.0), "Paycheck","Income",acct6);
			Transaction trans36 = new Transaction(Math.round(((double)(Math.random() * 1000) * 100.0) / -100.0), "Youtube Tv","Entertainment",acct6);



			transactionRepository.save((trans1));
			transactionRepository.save((trans2));
			transactionRepository.save((trans3));
			transactionRepository.save((trans4));
			transactionRepository.save((trans5));
			transactionRepository.save((trans6));
			transactionRepository.save((trans7));
			transactionRepository.save((trans8));
			transactionRepository.save((trans9));
			transactionRepository.save((trans10));
			transactionRepository.save((trans11));
			transactionRepository.save((trans12));
			transactionRepository.save((trans13));
			transactionRepository.save((trans14));
			transactionRepository.save((trans15));
			transactionRepository.save((trans16));
			transactionRepository.save((trans17));
			transactionRepository.save((trans18));
			transactionRepository.save((trans19));
			transactionRepository.save((trans20));
			transactionRepository.save((trans21));
			transactionRepository.save((trans22));
			transactionRepository.save((trans23));
			transactionRepository.save((trans24));
			transactionRepository.save((trans25));
			transactionRepository.save((trans26));
			transactionRepository.save((trans27));
			transactionRepository.save((trans28));
			transactionRepository.save((trans29));
			transactionRepository.save((trans30));
			transactionRepository.save((trans31));
			transactionRepository.save((trans32));
			transactionRepository.save((trans33));
			transactionRepository.save((trans34));
			transactionRepository.save((trans35));
			transactionRepository.save((trans36));

		};
	}
}


