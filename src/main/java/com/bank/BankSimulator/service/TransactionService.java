package com.bank.BankSimulator.service;

import java.math.BigDecimal;

import com.bank.BankSimulato.repository.TransactionRepository;
import com.bank.BankSimulator.exceptions.AccountNotFoundException;
import com.bank.BankSimulator.exceptions.InvalidAmountException;
import com.bank.BankSimulator.model.Account;

public class TransactionService {
	private AccountService accountService;
	private TransactionRepository transactionRepository;
	
	public TransactionService(AccountService accountService ,TransactionRepository transactionRepository) {
		this.accountService = accountService;
		this.transactionRepository = transactionRepository;
	}
	
	public void deposite(String accNo ,BigDecimal amount) throws InvalidAmountException, AccountNotFoundException {
		if(amount.compareTo(BigDecimal.ZERO) <= 0) {
			throw new InvalidAmountException("Amount should not be negative");
		}
		
		Account acc = accountService.getAccount(accNo);
		acc.credit(amount);
		transactionRepository.logTransaction("DEPOSITE", accNo, amount.doubleValue(), null);
	}
	
}
