package org.unusualspends.db;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MerchantDBTest {
    @Test
    void shouldCreateObjectWithEmptyMerchantList(){
        var merchantDB = new CreditCardDB();
        var merchants = merchantDB.get()
        assertTrue(creditCards.isEmpty());
    }
}