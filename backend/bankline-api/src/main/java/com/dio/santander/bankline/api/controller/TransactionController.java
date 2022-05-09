package com.dio.santander.bankline.api.controller;

import com.dio.santander.bankline.api.dto.TransactionDTO;
import com.dio.santander.bankline.api.model.Transaction;
import com.dio.santander.bankline.api.repository.TransactionRepository;
import com.dio.santander.bankline.api.services.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/transactions")
public class TransactionController {
    // Attributes
    @Autowired
    private TransactionRepository repository;

    @Autowired
    private TransactionService service;

    // Methods
    @GetMapping
    public List<Transaction> findAll() {
        return repository.findAll();
    }

    @GetMapping("/{idConta}")
    public List<Transaction> findAll(@PathVariable("idConta") Integer idAccount){
        return repository.findByIdAccount(idAccount);
    }

    @PostMapping
    public void save(@RequestBody TransactionDTO transaction) {
        service.save(transaction);
    }
}
