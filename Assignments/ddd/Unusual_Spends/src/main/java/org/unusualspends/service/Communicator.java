package org.unusualspends.service;

public interface Communicator {
    boolean communicate(String recipientContact, String subject, String message);
}
