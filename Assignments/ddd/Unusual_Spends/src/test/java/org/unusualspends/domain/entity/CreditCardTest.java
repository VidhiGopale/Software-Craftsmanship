package org.unusualspends.domain.entity;

import org.junit.jupiter.api.Test;
import org.unusualspends.exception.InvalidCreditCardNumberException;
import org.unusualspends.exception.InvalidUserIdException;

import static org.junit.jupiter.api.Assertions.*;

class CreditCardTest {
    @Test
    void shouldBeAbleToInstantiateCreditCardWithGivenValue() {
        var creditCardNumber = "123-456";
        var userId = "111";

        var creditCard = new CreditCard(creditCardNumber, userId);

        assertEquals(creditCardNumber, creditCard.getNumber());
        assertEquals(userId, creditCard.getUserId());
    }

    @Test
    void shouldBeAbleToInstantiateCreditCardWithEmptyTransaction() {
        var creditCardNumber = "123-456";
        var userId = "111";
        var creditCard = new CreditCard(creditCardNumber, userId);

        var actual = creditCard.getTransaction();

        assertTrue(actual.isEmpty());
    }

    @Test
    void shouldThrowInvalidCreditCardNumberExceptionWhenNumberIsNull(){
        String number=null;
        String userId="123";
        String expectedExceptionMessage="Invalid Credit Card Number: null";

        var exceptionObj=assertThrows(InvalidCreditCardNumberException.class, ()->  new CreditCard(number,userId));
        assertEquals(expectedExceptionMessage, exceptionObj.getMessage());
    }

    @Test
    void shouldThrowInvalidCreditCardNumberExceptionWhenNumberIsBlank(){
        String number=" ";
        String userId="123";
        String expectedExceptionMessage="Invalid Credit Card Number:  ";

        var exceptionObj=assertThrows(InvalidCreditCardNumberException.class, ()->  new CreditCard(number,userId));
        assertEquals(expectedExceptionMessage, exceptionObj.getMessage());
    }

    @Test
    void shouldThrowInvalidUserIdExceptionWhenIdIsNull(){
        String number="123456324509";
        String userId=null;
        String expectedExceptionMessage="Invalid UserId: null";

        var exceptionObj=assertThrows(InvalidUserIdException.class, ()->  new CreditCard(number,userId));
        assertEquals(expectedExceptionMessage, exceptionObj.getMessage());
    }

    @Test
    void shouldThrowInvalidUserIdExceptionWhenIdIsBlank(){
        String number="123456324509";
        String userId=" ";
        String expectedExceptionMessage="Invalid UserId:  ";

        var exceptionObj=assertThrows(InvalidUserIdException.class, ()->  new CreditCard(number,userId));
        assertEquals(expectedExceptionMessage, exceptionObj.getMessage());
    }

}