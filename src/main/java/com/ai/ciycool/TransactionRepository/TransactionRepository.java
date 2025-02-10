package com.ai.ciycool.TransactionRepository;

import com.ai.ciycool.entities.Transaction;
import com.ai.ciycool.entities.TransactionStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
@Repository
@Service
public interface TransactionRepository extends JpaRepository<Transaction, Long> {
    List<Transaction> findByAccountId(Long accountId);
    List<Transaction> findByStatus(TransactionStatus transactionStatus);

}
