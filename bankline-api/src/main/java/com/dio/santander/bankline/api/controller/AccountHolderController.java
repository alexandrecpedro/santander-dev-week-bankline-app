package com.dio.santander.bankline.api.controller;

import com.dio.santander.bankline.api.dto.AccountHolderDTO;
import com.dio.santander.bankline.api.model.AccountHolder;
import com.dio.santander.bankline.api.repository.AccountHolderRepository;
import com.dio.santander.bankline.api.services.AccountHolderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/accountholders")
public class AccountHolderController {
    // Attributes
    @Autowired
    private AccountHolderRepository repository;

    @Autowired
    private AccountHolderService service;

    // Methods
    @GetMapping
    public List<AccountHolder> findAll() {
        return repository.findAll();
    }

    @PostMapping
    public void save(@RequestBody AccountHolderDTO accountHolder) {
        service.save(accountHolder);
    }
}
