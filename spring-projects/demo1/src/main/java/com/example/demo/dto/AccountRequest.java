package com.example.demo.dto;

import com.example.demo.validation.ValidAccountNumber;
import jakarta.validation.constraints.*;

public record AccountRequest(

        @NotBlank(message = "Account number is required")
        @ValidAccountNumber
        String accountNumber,

        @NotBlank(message = "Customer name is required")
        @Size(min = 3, max = 100)
        String customerName,

        @NotNull(message = "Balance is required")
        @PositiveOrZero(message = "Balance cannot be negative")
        Double balance

) {
}