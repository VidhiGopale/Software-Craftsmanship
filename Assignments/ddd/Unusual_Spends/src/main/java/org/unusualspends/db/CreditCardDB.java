package org.unusualspends.db;

import org.unusualspends.domain.entity.CreditCard;

import java.util.ArrayList;
import java.util.List;

public class CreditCardDB {

    private final List<CreditCard> creditCards;

    public CreditCardDB() {
        creditCards = new ArrayList<>();
    }

    public List<CreditCard> getCreditCards(){
        return creditCards;
    }

    public void addCreditCard(CreditCard creditCard){
        this.creditCards.add(creditCard);
    }
}


