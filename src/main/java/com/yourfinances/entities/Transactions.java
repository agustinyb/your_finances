package com.yourfinances.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "transactions")
@Data
public class Transactions {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    @Column(name = "user_id")
    Integer userId;
    Integer categoryId;
    BigDecimal amount;
    String type;
    String description;
    LocalDateTime TransactionDate = LocalDateTime.now();
}
