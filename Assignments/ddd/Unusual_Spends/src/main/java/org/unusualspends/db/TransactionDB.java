package org.unusualspends.db;

import org.unusualspends.domain.entity.Transaction;

import java.util.ArrayList;
import java.util.List;

public class TransactionDB {
    private final List<Transaction> transactions;

    public TransactionDB() {
        transactions = new ArrayList<>();
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void addTransaction(Transaction transaction) {
        this.transactions.add(transaction);
    }
}
