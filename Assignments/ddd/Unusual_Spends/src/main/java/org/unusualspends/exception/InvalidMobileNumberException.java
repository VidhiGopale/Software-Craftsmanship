package org.unusualspends.exception;

public class InvalidMobileNumberException extends RuntimeException {
    public InvalidMobileNumberException(String mobile) {
        super("Invalid mobile number: " + mobile);
    }
}