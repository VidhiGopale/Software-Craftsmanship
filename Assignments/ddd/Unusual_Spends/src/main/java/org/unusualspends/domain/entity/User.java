package org.unusualspends.domain.entity;

import org.unusualspends.exception.InvalidEmailIdException;
import org.unusualspends.exception.InvalidMobileNumberException;
import org.unusualspends.exception.InvalidTransactionIdException;
import org.unusualspends.exception.InvalidUserIdException;

import java.util.ArrayList;
import java.util.List;

public class User {
    private final String id;
    private final String name;
    private final String email;
    private final String mobile;
    private final List<CreditCard> cards;

    public User(String id, String name, String email, String mobile) {
        if(id==null|| id.isBlank()){
            throw new InvalidUserIdException(id);
        }
        if (mobile == null || !mobile.matches("\\d{10}")) {
            throw new InvalidMobileNumberException(mobile);
        }
        if(email==null || email.isBlank()){
            throw new InvalidEmailIdException(email);
        }
        this.id = id;
        this.name = name;
        this.email = email;
        this.mobile = mobile;
        this.cards = new ArrayList<>();
    }

    public void addCard(CreditCard card) {
        cards.add(card);
    }
    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public String getMobile() {
        return mobile;
    }
    public List<CreditCard> getCards() {
        return cards;
    }
}
