package com.ai.ciycool;

import com.ai.ciycool.TransactionRepository.TransactionRepository;
import com.ai.ciycool.entities.Transaction;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@CrossOrigin("*")
@RequestMapping("/transactions")
@NoArgsConstructor
public class TransactionController {

    private  TransactionRepository transactionRepository;

    public TransactionController(TransactionRepository transactionRepository) {
        this.transactionRepository = transactionRepository;
    }
    @GetMapping
    public List<Transaction>transactions(){
        return transactionRepository.findAll();
    }

}
