package org.unusualspends.dto;

import org.unusualspends.domain.entity.Transaction;
import org.unusualspends.domain.valueobject.SpendingCategory;

public class TransactionWithCategory {
    private final Transaction transaction;
    private final SpendingCategory spendingCategory;

    public TransactionWithCategory(Transaction transaction, SpendingCategory spendingCategory) {
        this.transaction = transaction;
        this.spendingCategory = spendingCategory;
    }

    public Transaction getTransaction(){
        return transaction;
    }

    public SpendingCategory getSpendingCategory(){
        return  spendingCategory;
    }
}
