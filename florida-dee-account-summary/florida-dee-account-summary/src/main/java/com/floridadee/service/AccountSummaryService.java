package com.floridadee.service;

import com.floridadee.model.Account;
import com.floridadee.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AccountSummaryService {

    @Autowired
    private AccountRepository accountRepository;

    public List<Account> getAllActiveAccounts() {
        return accountRepository.findByActiveTrue();
    }
}
