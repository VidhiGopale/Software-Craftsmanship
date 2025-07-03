package org.unusualspends.repo;

import org.unusualspends.db.CreditCardDB;
import org.unusualspends.domain.entity.CreditCard;


import java.util.List;

public class CreditCardRepo {

    private final CreditCardDB creditCardDB;

    public CreditCardRepo(CreditCardDB creditCardDB) {
        this.creditCardDB = creditCardDB;
    }

    public void addCreditCard(CreditCard creditCard) {
        this.creditCardDB.addCreditCard(creditCard);
    }

    public List<CreditCard> getAllCreditCards() {
        return this.creditCardDB.getCreditCards();
    }

}


