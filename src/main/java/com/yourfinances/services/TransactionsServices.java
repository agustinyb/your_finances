package com.yourfinances.services;

import com.yourfinances.entities.Transactions;

import java.util.List;


public interface TransactionsServices {

    Transactions addTransaction(Transactions transaction);
    Transactions updateTransaction(Transactions transaction, Integer id);
    List<Transactions> getAllTransactions();
    Transactions findTrasactionById(Integer id);
    void removeTransaction(Integer id);
    List<Transactions> allTransactionsUser(Integer userId);
}
