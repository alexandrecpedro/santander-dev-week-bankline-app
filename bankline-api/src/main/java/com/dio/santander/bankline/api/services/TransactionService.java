package com.dio.santander.bankline.api.services;

import com.dio.santander.bankline.api.dto.TransactionDTO;
import com.dio.santander.bankline.api.model.AccountHolder;
import com.dio.santander.bankline.api.model.Transaction;
import com.dio.santander.bankline.api.model.TransactionType;
import com.dio.santander.bankline.api.repository.AccountHolderRepository;
import com.dio.santander.bankline.api.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class TransactionService {
    // Attribute
    @Autowired
    private TransactionRepository repository;

    @Autowired
    private AccountHolderRepository accountHolderRepository;

    // Method
    public void save(TransactionDTO newTransaction) {
        Transaction transaction = new Transaction();

        Double value = newTransaction.getType() == TransactionType.REVENUE ?
                newTransaction.getValue() : newTransaction.getValue() * (-1);

        transaction.setDateTime(LocalDateTime.now());
        transaction.setDescription(newTransaction.getDescription());
        transaction.setIdAccount(newTransaction.getIdAccount());
        transaction.setType(newTransaction.getType());
        transaction.setValue(value);

        // Search account holder by id and update its balance
        AccountHolder accountHolder = accountHolderRepository.findById(newTransaction.getIdAccount())
                .orElse(null);
        if (accountHolder != null) {
            accountHolder.getAccount().setBalance(accountHolder.getAccount().getBalance() + value);
            accountHolderRepository.save(accountHolder);
        }

        repository.save(transaction);
    }
}
