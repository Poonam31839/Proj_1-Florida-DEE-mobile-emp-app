package com.floridadee.service;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

import com.floridadee.model.Account;
import com.floridadee.repository.AccountRepository;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import java.util.Arrays;
import java.util.List;

public class AccountSummaryServiceTest {

    @Mock
    AccountRepository accountRepository;

    @InjectMocks
    AccountSummaryService service;

    @Test
    public void testGetAllActiveAccounts() {
        Account acc1 = new Account();
        acc1.setActive(true);

        when(accountRepository.findByActiveTrue()).thenReturn(Arrays.asList(acc1));

        List<Account> result = service.getAllActiveAccounts();
        assertEquals(1, result.size());
    }
}
