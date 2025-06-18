package org.unusualspends.exception;

public class InvalidTransactionAmountException extends RuntimeException {
    public InvalidTransactionAmountException(double amount) {
        super("Invalid Transaction Amount: "+amount);
    }
}
