package com.yourfinances.controllers;

import com.yourfinances.entities.Transactions;
import com.yourfinances.services.TransactionsServicesImp;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Data
@RequestMapping("api/v1/")
public class TransactionsController {

    @Autowired
    private TransactionsServicesImp transactionService;

    @PostMapping("transaction")
    public ResponseEntity<Transactions> addTransaction(@RequestBody Transactions transaction) {
        return ResponseEntity.status(HttpStatus.CREATED).body(transactionService.addTransaction(transaction));
    }

    @PutMapping("transaction/{id}")
    public ResponseEntity<Transactions> updateTransaction(@RequestBody Transactions transaction, @PathVariable Integer id) {
        return ResponseEntity.status(HttpStatus.OK).body(transactionService.updateTransaction(transaction, id));
    }


    @GetMapping("alltrsns")
    public ResponseEntity<List> getAll() {
        return ResponseEntity.status(HttpStatus.OK).body(transactionService.getAllTransactions());
    }

    @GetMapping("transaction/{id}")
    public ResponseEntity<Transactions> findById(@PathVariable Integer id) {
        return ResponseEntity.status(HttpStatus.OK).body(transactionService.findTrasactionById(id));
    }


    @DeleteMapping("transaction/{id}")
    public ResponseEntity<Transactions> removeTransaction(@PathVariable Integer id) {
        transactionService.removeTransaction(id);
        return ResponseEntity.status(HttpStatus.OK).build();
    }

    @GetMapping("transaction/user/{userId}")
    public List<Transactions> getAllTrans(@PathVariable Integer userId) {
        return transactionService.allTransactionsUser(userId);
    }

}
