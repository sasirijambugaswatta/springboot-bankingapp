package com.sasiri.cruddemo.bankingapp.repository;

import com.sasiri.cruddemo.bankingapp.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {
}
