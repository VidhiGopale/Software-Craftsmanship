package org.unusualspends.exception;

public class InvalidMerchantIdException extends RuntimeException {
    public InvalidMerchantIdException(String id) {
        super("Invalid Merchant ID: "+id);
    }
}
