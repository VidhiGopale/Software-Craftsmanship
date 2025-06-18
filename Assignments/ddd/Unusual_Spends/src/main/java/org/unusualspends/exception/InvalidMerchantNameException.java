package org.unusualspends.exception;

public class InvalidMerchantNameException extends RuntimeException {
    public InvalidMerchantNameException(String name) {
        super("Invalid Merchant Name: "+name);
    }
}
