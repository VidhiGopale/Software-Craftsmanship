package org.unusualspends.domain.entity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TransactionTest {
    @Test
    void shouldCreateObjectWithGivenValues(){
        String userId="111";
        String userName="Vidhi";
        String userEmail="vidhigopale@gmail.com";
        String userMobile="9518970490";

        var user=new User("111", "Vidhi","vidhigopale@gmail.com", "9518970490");

        assertEquals(userId, user.getId());
        assertEquals(userName, user.getName());
        assertEquals(userEmail, user.getEmail());
        assertEquals(userMobile, user.getMobile());
    }
}