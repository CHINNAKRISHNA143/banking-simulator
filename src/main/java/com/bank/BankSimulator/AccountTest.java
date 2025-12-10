package com.bank.BankSimulator;

import java.math.BigDecimal;

import com.bank.BankSimulator.model.Account;

public class AccountTest {
	public static void main(String[] args) {
		 
		Account acc1 = new Account("chinni","chinni@gmail.com",new BigDecimal("1000"));
		Account acc2 = new Account("krishna","krishna@gmail.com",new BigDecimal("2000"));
		
		 
		System.out.println(acc1);
		System.out.println(acc2);
		
		System.out.println("--------------------------");
		
		acc1.credit(new BigDecimal("1000"));
		
		acc2.debit(new BigDecimal("500"));
		
		System.out.println(acc1);
		System.out.println(acc2);
		 
	}
}
