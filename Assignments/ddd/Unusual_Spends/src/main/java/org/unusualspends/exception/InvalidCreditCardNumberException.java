package org.unusualspends.exception;

public class InvalidCreditCardNumberException extends RuntimeException {

    public InvalidCreditCardNumberException(String number) {
        super("Invalid Credit Card Number: " + number);
    }
}