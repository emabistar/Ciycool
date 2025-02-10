package com.ai.ciycool;

import com.ai.ciycool.TransactionRepository.TransactionRepository;
import com.ai.ciycool.entities.Transaction;
import com.ai.ciycool.entities.TransactionStatus;
import com.ai.ciycool.entities.TransactionType;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import lombok.Builder;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.Date;
import java.util.List;


@SpringBootApplication
public class CiycoolApplication {
    public static void main(String[] args) {
        SpringApplication.run(CiycoolApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(TransactionRepository transactionRepository) {
        return args -> {
            List<Long> accounts = List.of(11L, 22L, 33L);
            accounts.forEach(accountId -> {
                for (TransactionType type : TransactionType.values()) {
                    for (int i = 0; i < 3; i++) {
                        Transaction transaction = Transaction.builder()
                                .accountId(accountId)
                                .type(type)
                                .amount(1000 + Math.random() * 70000)
                                .date(new Date())
                                .status(TransactionStatus.PENDING)
                                .build();

                        transactionRepository.save(transaction);
                    }
                }
            });
        };


    }

}
