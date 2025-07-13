package org.unusualspends.repo;

import org.junit.jupiter.api.Test;
import org.unusualspends.db.CreditCardDB;
import org.unusualspends.domain.entity.CreditCard;

import static org.junit.jupiter.api.Assertions.*;

class CreditCardRepoTest {
    @Test
    void shouldAbleToAddAndGetAllCreditCards(){
        var expectedCreditCard1=new CreditCard("123-456","111");
        var expectedCreditCard2 = new CreditCard("652-728","222");
        var creditCardDB = new CreditCardDB();
        var creditCardRepo = new CreditCardRepo(creditCardDB);
        creditCardRepo.addCreditCard(expectedCreditCard1);
        creditCardRepo.addCreditCard(expectedCreditCard2);
        var creditCards=creditCardRepo.getAllCreditCards();

        assertFalse(creditCards.isEmpty());
        assertTrue(creditCards.size()==2);
    }
}



