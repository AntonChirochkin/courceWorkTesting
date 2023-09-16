package ru.skypro.courseworktesting.repository;

import ru.skypro.courseworktesting.entity.Account;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {
    Optional<Account> getAccountByUser_IdAndId(Long userId, Long accountId);
}
