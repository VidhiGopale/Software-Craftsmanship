package org.unusualspends.db;

import org.junit.jupiter.api.Test;

import java.awt.font.TransformAttribute;

import static org.junit.jupiter.api.Assertions.*;

class TransactionDBTest {
    @Test
    void shouldCreateObjectWithEmptyTransactionList(){
        var TransactionDB=new TransactionDB();
        var transaction=TransactionDB.getTransactions();
        assertTrue(transaction.isEmpty());
    }
}