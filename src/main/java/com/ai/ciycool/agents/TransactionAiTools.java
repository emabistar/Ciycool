package com.ai.ciycool.agents;

import com.ai.ciycool.TransactionRepository.TransactionRepository;
import com.ai.ciycool.entities.Transaction;
import com.ai.ciycool.entities.TransactionStatus;
import dev.langchain4j.agent.tool.Tool;
import jakarta.persistence.EntityNotFoundException;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
@Slf4j
@NoArgsConstructor
public class TransactionAiTools {
    private TransactionRepository transactionRepository;
    public TransactionAiTools(TransactionRepository transactionrepository) {
        this.transactionRepository =  transactionrepository;

    }
    @Tool("Get all transaction")
    public List<Transaction> getTransactionAiTools() {
        return  transactionRepository.findAll();
    }
    @Tool("Get All Transaction By Account ID")
    public  List<Transaction> getAllTransactionByAccountId(long accountId) {
        return transactionRepository.findByAccountId(accountId);
    }

    @Tool
    public Transaction updateTransactionStatus(Long transactionId, TransactionStatus transactionStatus) {
        Transaction transaction = transactionRepository.findById(transactionId).get();
        transaction.setStatus(transactionStatus);
        return transactionRepository.save(transaction);
    }




}
