package org.unusualspends.exception;

public class InvalidEmailIdException extends RuntimeException {
    public InvalidEmailIdException(String email) {
        super("Invalid Email Id: "+ email);
    }
}
