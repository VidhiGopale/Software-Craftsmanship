package org.unusualspends.service;

import org.unusualspends.domain.entity.Transaction;
import org.unusualspends.domain.valueobject.SpendingCategory;
import org.unusualspends.dto.SpendingByCategoryAndAmount;
import org.unusualspends.dto.TransactionWithCategory;
import org.unusualspends.repo.MerchantRepo;
import org.unusualspends.repo.TransactionRepo;

import java.util.ArrayList;
import java.util.List;
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

        List<SpendingByCategoryAndAmount> spendingByCategoryAndAmountList = new ArrayList<>();
        List<TransactionWithCategory> validTransactions = new ArrayList<>();

        //loop through all transactions
        for (TransactionWithCategory transactionWithCategory : transactionWithCategoryList){
            //find transaction month
            String transactionMonth = transactionWithCategory.getTransaction().getMonth();
            //check if transaction month is equal to given month
            if(transactionMonth == month){
                //find the credit card from which the transaction was performed
                String creditCardIdFromTransaction = transactionWithCategory.getTransaction().getCreditCardId();
                // check if the credit card ids contains this credit card id

                if(creditCardIds.contains(creditCardIdFromTransaction)) {
                    // if yes then this is valid transaction
                    validTransactions.add(transactionWithCategory);
                }
            }
        }

        for (TransactionWithCategory transactionWithCategory : validTransactions){

            SpendingCategory spendingCategory = transactionWithCategory.getSpendingCategory();

            Double amount = transactionWithCategory.getTransaction().getAmount();

            var spendingByCategoryAndAmount = new SpendingByCategoryAndAmount(spendingCategory,amount);

            spendingByCategoryAndAmountList.add(spendingByCategoryAndAmount);
        }

        return spendingByCategoryAndAmountList;
    }
}
