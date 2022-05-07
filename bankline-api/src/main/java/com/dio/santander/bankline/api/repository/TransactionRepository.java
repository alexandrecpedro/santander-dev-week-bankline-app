package com.dio.santander.bankline.api.repository;

import com.dio.santander.bankline.api.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TransactionRepository extends JpaRepository<Transaction, Integer> {
    // Method
    public List<Transaction> findByIdAccount(Integer idAccount);
}
