package com.dio.santander.bankline.api.dto;

public class AccountHolderDTO {
    // Attributes
    private String name;
    private String cpf;

    // Getters/Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
