// Placeholder for AccountRepository.java

package com.floridadee.repository;

import com.floridadee.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface AccountRepository extends JpaRepository<Account, Long> {
    List<Account> findByActiveTrue();
}
