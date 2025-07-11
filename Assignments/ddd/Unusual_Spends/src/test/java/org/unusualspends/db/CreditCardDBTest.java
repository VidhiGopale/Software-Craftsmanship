package org.unusualspends.db;

import org.junit.jupiter.api.Test;
import org.unusualspends.domain.entity.CreditCard;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CreditCardDBTest {
    @Test
    void shouldCreateObjectWithEmptyCreditCardList(){
        var creditCardDB = new CreditCardDB();
        var creditCards = creditCardDB.getCreditCards();
        assertTrue(creditCards.isEmpty());
    }
}