package com.floridadee.controller;

import com.floridadee.model.Account;
import com.floridadee.service.AccountSummaryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/accounts")
public class AccountSummaryController {

    private static final Logger logger = LoggerFactory.getLogger(AccountSummaryController.class);

    @Autowired
    private AccountSummaryService accountService;

    @GetMapping("/active")
    public List<Account> getActiveAccounts() {
        logger.info("Fetching all active accounts");
        return accountService.getAllActiveAccounts();
    }
}
