package com.ai.ciycool.entities;
import jakarta.persistence.*;
import lombok.*;
import lombok.Builder;
import java.util.Date;
@Entity
@Getter
@Setter

@Table(name = "transactions")
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long accountId;
    @Enumerated(EnumType.STRING)
    private TransactionType type;
    private Double amount;
    @Temporal(TemporalType.TIMESTAMP)
    private Date date;
    @Enumerated(EnumType.STRING)
    private TransactionStatus status;

    // Default constructor (required for JPA)
    public Transaction() {}

    // Private constructor for builder
    private Transaction(Builder builder) {
        this.accountId = builder.accountId;
        this.type = builder.type;
        this.amount = builder.amount;
        this.date = builder.date;
        this.status = builder.status;
    }

    // **Static Builder Class**
    public static class Builder {
        private Long accountId;
        private TransactionType type;
        private Double amount;
        private Date date;
        private TransactionStatus status;

        public Builder accountId(Long accountId) {
            this.accountId = accountId;
            return this;
        }

        public Builder type(TransactionType type) {
            this.type = type;
            return this;
        }

        public Builder amount(Double amount) {
            this.amount = amount;
            return this;
        }

        public Builder date(Date date) {
            this.date = date;
            return this;
        }

        public Builder status(TransactionStatus status) {
            this.status = status;
            return this;
        }

        public Transaction build() {
            return new Transaction(this);
        }
    }

    // **Static method to start the builder**
    public static Builder builder() {
        return new Builder();
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public Long getAccountId() {
        return accountId;
    }

    public TransactionType getType() {
        return type;
    }

    public Double getAmount() {
        return amount;
    }

    public Date getDate() {
        return date;
    }

    public TransactionStatus getStatus() {
        return status;
    }
}









    /***
    // Default constructor (required for JPA)
    public Transaction() {}

    // Private constructor for builder


    private Transaction(Builder builder) {
        this.accountId = builder.accountId;
        this.type = builder.type;
        this.amount = builder.amount;
        this.date = builder.date;
        this.status = builder.status;
    }

    // **Static Builder Class**
    public static class Builder {
        private Long accountId;
        private TransactionType type;
        private Double amount;
        private Date date;
        private TransactionStatus status;

        public Builder accountId(Long accountId) {
            this.accountId = accountId;
            return this;
        }

        public Builder type(TransactionType type) {
            this.type = type;
            return this;
        }

        public Builder amount(Double amount) {
            this.amount = amount;
            return this;
        }

        public Builder date(Date date) {
            this.date = date;
            return this;
        }

        public Builder status(TransactionStatus status) {
            this.status = status;
            return this;
        }

        public Transaction build() {
            return new Transaction(this);
        }
    }

    // **Static method to start the builder**
    public static Builder builder() {
        return new Builder();
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public Long getAccountId() {
        return accountId;
    }

    public TransactionType getType() {
        return type;
    }

    public Double getAmount() {
        return amount;
    }

    public Date getDate() {
        return date;
    }

    public TransactionStatus getStatus() {
        return status;
    }**/


