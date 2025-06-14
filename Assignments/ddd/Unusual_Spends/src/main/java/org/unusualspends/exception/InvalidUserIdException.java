package org.unusualspends.exception;

public class InvalidUserIdException extends RuntimeException {

    public InvalidUserIdException(String userId) {
        super("Invalid UserId: " + userId);
    }
}