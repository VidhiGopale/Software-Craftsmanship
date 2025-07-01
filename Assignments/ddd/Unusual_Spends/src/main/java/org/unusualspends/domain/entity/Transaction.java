package org.unusualspends.domain.entity;

import org.unusualspends.exception.InvalidTransactionAmountException;
import org.unusualspends.exception.InvalidTransactionIdException;

import java.time.LocalDateTime;

public class Transaction {
    private final String id;
    private final double amount;
    private final String merchantId;
    private final String creditCardId;
    private final LocalDateTime timestamp;

    public Transaction(String id, double amount, String merchantId, String creditCardId, LocalDateTime localDateTime) {
        if(id==null|| id.isBlank()){
            throw new InvalidTransactionIdException(id);
        }
        if(amount<0){
            throw new InvalidTransactionAmountException(amount);
        }
        this.id = id;
        this.amount = amount;
        this.merchantId = merchantId;
        this.creditCardId = creditCardId;
        this.timestamp = LocalDateTime.now();
    }

    public String getId() {
        return id;
    }
    public double getAmount() {
        return amount;
    }
    public String getMerchantId() {
        return merchantId;
    }
    public String getCreditCardId() {
        return creditCardId;
    }
    public LocalDateTime getTimestamp() {
        return timestamp;
    }
    public String getMonth() {
        return timestamp.getMonth().toString();
    }
}
