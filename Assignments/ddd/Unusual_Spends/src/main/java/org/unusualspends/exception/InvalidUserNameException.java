package org.unusualspends.exception;

public class InvalidUserNameException extends RuntimeException {
    public InvalidUserNameException(String userName) {
        super("Invalid UserName : "+ userName);
    }
}
