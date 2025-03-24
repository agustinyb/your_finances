package com.yourfinances.repository;

import com.yourfinances.entities.Transactions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TransactionsRepository extends JpaRepository<Transactions, Integer> {

    @Query("SELECT t FROM Transactions t WHERE t.userId = :userId")
    List<Transactions> findByTransId(@Param("userId") Integer userId);

}
