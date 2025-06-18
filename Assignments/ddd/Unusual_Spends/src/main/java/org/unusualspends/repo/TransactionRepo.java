package org.unusualspends.repo;

import org.unusualspends.db.TransactionDB;
import org.unusualspends.domain.entity.Transaction;

import java.util.List;

public class TransactionRepo {

    private final TransactionDB transactionDB;

    public TransactionRepo(TransactionDB transactionDB) {
        this.transactionDB = transactionDB;
    }

    public void addTransaction(Transaction transaction) {
        this.transactionDB.addTransaction(transaction);
    }

    public List<Transaction> getAllTransactions() {
        return this.transactionDB.getTransactions();
    }
}
