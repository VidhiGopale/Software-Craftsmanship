package org.unusualspends.domain.entity;

import java.util.ArrayList;
import java.util.List;

public class User {
    private final String id;
    private final String name;
    private final String email;
    private final String mobile;
    private final List<CreditCard> cards;

    public User(String id, String name, String email, String mobile) {
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
