package org.unusualspends.service;

import org.unusualspends.domain.entity.Transaction;
import org.unusualspends.domain.valueobject.SpendingCategory;
import org.unusualspends.dto.SpendingByCategoryAndAmount;
import org.unusualspends.dto.TransactionWithCategory;
import org.unusualspends.repo.MerchantRepo;
import org.unusualspends.repo.TransactionRepo;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class TransactionService {
    private final TransactionRepo transactionRepo;
    private final MerchantRepo merchantRepo;
    private final List<TransactionWithCategory> transactionWithCategory;

    public TransactionService(TransactionRepo transactionRepo, MerchantRepo merchantRepo) {
        this.transactionRepo = transactionRepo;
        this.merchantRepo = merchantRepo;
        transactionWithCategory = new ArrayList<>();
    }

    public List<TransactionWithCategory> createAndAddTransactionWithCategory() {
        for(Transaction transaction : transactionRepo.getAllTransactions()){
            var category=merchantRepo.getMerchantCategoryById(transaction.getMerchantId());
            var transactionWithCategory=new TransactionWithCategory(transaction,category);
            this.transactionWithCategory.add(transactionWithCategory);
        }
        return transactionWithCategory;
    }

    public List<TransactionWithCategory> getTransactionWithCategory(){
        return this.transactionWithCategory;
    }

    public List<SpendingByCategoryAndAmount> getSpendingByCategoryAndAmountFor(Set<String> creditCardIds,String month,List<TransactionWithCategory> transactionWithCategoryList){
        return transactionWithCategoryList.stream()
                .filter(transactionWithCategory ->
                        Objects.equals(month,transactionWithCategory.getTransaction().getMonth())&&
                                creditCardIds.contains(transactionWithCategory.getTransaction().getCreditCardId())
                )
                .map(validTransaction ->
                        new SpendingByCategoryAndAmount(
                                validTransaction.getSpendingCategory(),
                                validTransaction.getTransaction().getAmount()
                        )
                ).toList();
    }
}
