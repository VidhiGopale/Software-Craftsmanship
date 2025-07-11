package org.unusualspends.domain.entity;

import org.junit.jupiter.api.Test;
import org.unusualspends.exception.InvalidTransactionAmountException;
import org.unusualspends.exception.InvalidTransactionIdException;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class TransactionTest {
    @Test
    void shouldCreateObjectWithGivenValues(){
        String id="123";
        double amount=200;
        String merchantId="M234";
        String creditCardId="12839030393";
        LocalDateTime timestamp = LocalDateTime.now();

        var transaction = new Transaction(id,amount,merchantId,creditCardId,timestamp);

        assertEquals(id, transaction.getId() );
        assertEquals(amount, transaction.getAmount() );
        assertEquals(merchantId, transaction.getMerchantId());
        assertEquals(creditCardId, transaction.getCreditCardId() );
        assertEquals(timestamp,transaction.getTimestamp());
    }

    @Test
    void shouldThrowInvalidTransactionIdExceptionWhenIdIsNull(){
        String id=null;
        double amount=200;
        String merchantId="M234";
        String creditCardId="12839030393";
        LocalDateTime timestamp = LocalDateTime.now();
        String expectedExceptionMessage = "Invalid Transaction id: null";

        var exceptionObj = assertThrows(InvalidTransactionIdException.class , () -> new Transaction(id, amount, merchantId,creditCardId,timestamp));

        assertEquals(expectedExceptionMessage, exceptionObj.getMessage());
    }

    @Test
    void shouldThrowInvalidTransactionIdExceptionWhenIdIsBlank(){
        String id=" ";
        double amount=200;
        String merchantId="M234";
        String creditCardId="12839030393";
        LocalDateTime timestamp = LocalDateTime.now();
        String expectedExceptionMessage = "Invalid Transaction id:  ";

        var exceptionObj = assertThrows(InvalidTransactionIdException.class , () -> new Transaction(id, amount, merchantId,creditCardId,timestamp));

        assertEquals(expectedExceptionMessage, exceptionObj.getMessage());
    }

    @Test
    void shouldThrowInvalidTransactionAmountExceptionWhenTransactionLessThanZero(){
        String id="123";
        double amount=-1;
        String merchantId="M234";
        String creditCardId="12839030393";
        LocalDateTime timestamp = LocalDateTime.now();
        String expectedExceptionMessage = "Invalid Transaction Amount: -1.0";

        var exceptionObj = assertThrows(InvalidTransactionAmountException.class , () -> new Transaction(id, amount, merchantId,creditCardId,timestamp));

        assertEquals(expectedExceptionMessage, exceptionObj.getMessage());
    }
}