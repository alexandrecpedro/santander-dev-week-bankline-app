package com.dio.santander.bankline.api.services;

import com.dio.santander.bankline.api.dto.AccountHolderDTO;
import com.dio.santander.bankline.api.model.AccountHolder;
import com.dio.santander.bankline.api.model.BankAccount;
import com.dio.santander.bankline.api.repository.AccountHolderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class AccountHolderService {
    // Attributes
    @Autowired
    private AccountHolderRepository repository;

    // Method
    public void save(AccountHolderDTO newAccountHolder) {
        AccountHolder accountHolder = new AccountHolder();
        accountHolder.setName(newAccountHolder.getName());
        accountHolder.setCpf(newAccountHolder.getCpf());

        BankAccount bankAccount = new BankAccount();
        bankAccount.setBalance(0.0);
        bankAccount.setNumber(new Date().getTime());

        accountHolder.setAccount(bankAccount);
        repository.save(accountHolder);
    }
}
