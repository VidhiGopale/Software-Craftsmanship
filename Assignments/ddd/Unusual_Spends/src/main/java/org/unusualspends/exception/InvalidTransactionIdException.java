package org.unusualspends.exception;

public class InvalidTransactionIdException extends RuntimeException {
    public InvalidTransactionIdException(String id) {
        super("Invalid Transaction id: "+ id);
    }
}
