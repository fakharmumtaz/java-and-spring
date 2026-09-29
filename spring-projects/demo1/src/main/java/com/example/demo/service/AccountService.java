package com.example.demo.service;

import com.example.demo.dto.AccountRequest;
import com.example.demo.dto.AccountResponse;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.model.Account;
import com.example.demo.repository.AccountRepository;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AccountService {

    private final AccountRepository repository;

    public AccountService(AccountRepository repository) {
        this.repository = repository;
    }

    @PreAuthorize("hasRole('USER') or hasRole('ADMIN')")
    public AccountResponse getAccount(Long id) {

        Account account = repository.findById(id)
                .orElseThrow(() ->
                        new ResourceNotFoundException(
                                "Account not found: " + id));

        return toResponse(account);
    }

    //@PreAuthorize("hasRole('USER') or hasRole('ADMIN')")
    public List<AccountResponse> getAllAccount() {

        List<Account> list = repository.findAll()        ;

        return toResponse(list);
    }

    @PreAuthorize("hasRole('ADMIN')")
    public AccountResponse createAccount(
            AccountRequest request) {

        System.out.println(request);

        Account account = new Account(
                request.accountNumber(),
                request.customerName(),
                request.balance()
        );

        Account saved = repository.save(account);

        return toResponse(saved);
    }


    @PreAuthorize("hasRole('ADMIN')")
    public void deleteAccount(Long id) {

        if (!repository.existsById(id)) {
            throw new ResourceNotFoundException(
                    "Account not found: " + id);
        }

        repository.deleteById(id);
    }

    private AccountResponse toResponse(Account account) {

        return new AccountResponse(
                account.getId(),
                account.getAccountNumber(),
                account.getCustomerName(),
                account.getBalance()
        );
    }

    private List<AccountResponse> toResponse(List<Account> account) {
        List<AccountResponse> accRes = new ArrayList<>();
        for (Account a : account) {
            accRes.add(new AccountResponse(
                    a.getId(),
                    a.getAccountNumber(),
                    a.getCustomerName(),
                    a.getBalance())) ;
        }
        return accRes;
    }
}