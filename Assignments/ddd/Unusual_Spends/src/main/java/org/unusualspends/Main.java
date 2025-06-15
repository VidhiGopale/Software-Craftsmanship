package org.unusualspends;

import org.unusualspends.domain.entity.CreditCard;
import org.unusualspends.domain.entity.Merchant;
import org.unusualspends.domain.entity.Transaction;
import org.unusualspends.domain.entity.User;
import org.unusualspends.domain.valueobject.SpendingCategory;

import java.time.LocalDateTime;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        User user=new User("U12345","Vidhi", "vidhigopale@gmail.com","9518970490");
        CreditCard card=new CreditCard("C123456789012", user.getId());
        Merchant jwellery = new Merchant("M1000001","Giva", SpendingCategory.JWELLERY);
        Merchant groceries = new Merchant("M1000002", "Dmart", SpendingCategory.GROCERIES);
        Transaction t1=new Transaction("T1000001", 5000, jwellery.getId(), card.getNumber(), LocalDateTime.now().minusMonths(1));
        Transaction t2=new Transaction("T1000002", 1000, groceries.getId(), card.getNumber(), LocalDateTime.now().minusMonths(1));
        Transaction t3=new Transaction("T1000003", 8000, jwellery.getId(), card.getNumber(), LocalDateTime.now());
        Transaction t4=new Transaction("T1000004", 1600, groceries.getId(), card.getNumber(), LocalDateTime.now());
        card.addTransaction(t1.getId());
        card.addTransaction(t2.getId());
        card.addTransaction(t3.getId());
        card.addTransaction(t4.getId());
    }
}