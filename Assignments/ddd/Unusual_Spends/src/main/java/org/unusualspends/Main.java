package org.unusualspends;

import org.unusualspends.config.UnusualSpendsConfig;
import org.unusualspends.db.MerchantDB;
import org.unusualspends.db.TransactionDB;
import org.unusualspends.db.UserDB;
import org.unusualspends.domain.entity.CreditCard;
import org.unusualspends.domain.entity.Merchant;
import org.unusualspends.domain.entity.Transaction;
import org.unusualspends.domain.entity.User;
import org.unusualspends.domain.service.UnusualSpendsProcessor;
import org.unusualspends.domain.valueobject.SpendingCategory;
import org.unusualspends.repo.MerchantRepo;
import org.unusualspends.repo.TransactionRepo;
import org.unusualspends.repo.UserRepo;
import org.unusualspends.service.TransactionService;


import java.time.LocalDateTime;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        // Initialize user and credit card
        User u1 = new User("1111", "Vidhi", "vidhigopale@gmail.com", "9518970490");
        CreditCard c1 = new CreditCard("C1111", u1.getId());
        u1.addCreditCard(c1);

        // Initialize merchants
        Merchant m1 = new Merchant("M1111", "Giva", SpendingCategory.JWELLERY);
        Merchant m2 = new Merchant("M2222", "Aroma", SpendingCategory.FOOD);

        // Create transactions
        Transaction t1 = new Transaction("T1111", 5000, m1.getId(), c1.getNumber(), LocalDateTime.now().minusMonths(1)); // May
        Transaction t2 = new Transaction("T2222", 10000, m1.getId(), c1.getNumber(), LocalDateTime.now()); // June
        Transaction t3 = new Transaction("T3333", 6000, m2.getId(), c1.getNumber(), LocalDateTime.now().minusMonths(1)); // May
        Transaction t4 = new Transaction("T4444", 12000, m2.getId(), c1.getNumber(), LocalDateTime.now()); // June

        // Repos & DBs
        TransactionDB transactionDB = new TransactionDB();
        TransactionRepo transactionRepo = new TransactionRepo(transactionDB);
        MerchantDB merchantDB = new MerchantDB();
        MerchantRepo merchantRepo = new MerchantRepo(merchantDB);
        UserDB userDB = new UserDB();
        UserRepo userRepo = new UserRepo(userDB);

        // Add data to repositories
        transactionRepo.addTransaction(t1);
        transactionRepo.addTransaction(t2);
        transactionRepo.addTransaction(t3);
        transactionRepo.addTransaction(t4);
        merchantRepo.addMerchant(m1);
        merchantRepo.addMerchant(m2);
        userRepo.addUser(u1);

        // Config
        UnusualSpendsConfig unusualSpendsConfig = new UnusualSpendsConfig(50);

        // Transaction Service
        TransactionService transactionService = new TransactionService(transactionRepo, merchantRepo);
        transactionService.createAndAddTransactionWithCategory();

        // Get credit card ID set
        var creditCardIds = Collections.singleton(c1.getNumber());

        // Determine current and previous months
        String currentMonth = LocalDateTime.now().getMonth().toString();
        String lastMonth = LocalDateTime.now().minusMonths(1).getMonth().toString();


        // Get spending by category
        var currentMonthSpend = transactionService.getSpendingByCategoryAndAmountFor(creditCardIds, currentMonth, transactionService.getTransactionWithCategory());
        var lastMonthSpend = transactionService.getSpendingByCategoryAndAmountFor(creditCardIds, lastMonth, transactionService.getTransactionWithCategory());


        // Unusual Spend Processing
        UnusualSpendsProcessor unusualSpendsProcessor = new UnusualSpendsProcessor();
        var unusualSpends = unusualSpendsProcessor.getUnusualSpending(lastMonthSpend, currentMonthSpend, unusualSpendsConfig);

    }
}