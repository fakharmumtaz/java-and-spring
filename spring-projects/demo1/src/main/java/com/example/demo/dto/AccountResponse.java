package com.example.demo.dto;

public record AccountResponse(
        Long id,
        String accountNumber,
        String customerName,
        Double balance
) {
}