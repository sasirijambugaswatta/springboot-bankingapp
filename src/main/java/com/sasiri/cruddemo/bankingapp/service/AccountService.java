package com.sasiri.cruddemo.bankingapp.service;

import com.sasiri.cruddemo.bankingapp.dto.AccountDto;
import com.sasiri.cruddemo.bankingapp.entity.Account;

import java.math.BigDecimal;
import java.util.List;

public interface AccountService {
    AccountDto createAccount(AccountDto accountDto);
    AccountDto getAccountById(Long id);
    AccountDto deposit(Long id, Double amount);
    AccountDto withdraw(Long id, Double amount);
    List<AccountDto> getAllAccounts();
    void deleteAccount(Long id);
}
