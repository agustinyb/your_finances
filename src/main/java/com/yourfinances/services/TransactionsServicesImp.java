package com.yourfinances.services;

import com.yourfinances.entities.Transactions;
import com.yourfinances.repository.TransactionsRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Data
public class TransactionsServicesImp implements TransactionsServices {

    @Autowired
    private TransactionsRepository transactionsRepo;

    public Transactions addTransaction(Transactions transaction) {
        return transactionsRepo.save(transaction);
    }

    public Transactions updateTransaction(Transactions transaction, Integer id) {
        Optional<Transactions> updateTr = transactionsRepo.findById(id);
        if (updateTr.isPresent()) {
            transactionsRepo.save(transaction);
        }
        return null;
    }

    public List<Transactions> getAllTransactions() {
        return transactionsRepo.findAll();
    }

    public Transactions findTrasactionById(Integer id) {
        Optional<Transactions> findId = transactionsRepo.findById(id);
        if (findId.isPresent()) {
            return findId.get();
        }
        return null;
    }

    public void removeTransaction(Integer id) {
        transactionsRepo.deleteById(id);
    }

    public List<Transactions> allTransactionsUser(Integer userId) {
        return transactionsRepo.findByTransId(userId);
    }

}
