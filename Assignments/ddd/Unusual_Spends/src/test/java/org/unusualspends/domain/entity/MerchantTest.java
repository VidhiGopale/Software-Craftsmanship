package org.unusualspends.domain.entity;

import org.junit.jupiter.api.Test;
import org.unusualspends.domain.valueobject.SpendingCategory;
import org.unusualspends.exception.InvalidMerchantIdException;
import org.unusualspends.exception.InvalidMerchantNameException;

import static org.junit.jupiter.api.Assertions.*;

class MerchantTest {

    @Test
    void shouldCreateObjectWithGivenValues(){
        String merchId = "101";
        String merchName = "Vidhi";
        SpendingCategory spendingCategory = SpendingCategory.FOOD;

        var merch = new Merchant(merchId, merchName, spendingCategory);

        assertEquals(merchId, merch.getId() );
        assertEquals(merchName, merch.getName() );
        assertEquals(spendingCategory, merch.getCategory() );
    }

    @Test
    void shouldThrowInvalidIdExceptionWhenIdIsNull(){
        String id = null;
        String merchName = "Vidhi";
        SpendingCategory spendingCategory = SpendingCategory.TRAVEL;
        String expectedExceptionMessage = "Invalid Merchant ID: null";

        var exceptionObj = assertThrows(InvalidMerchantIdException.class , () -> new Merchant(id, merchName, spendingCategory));

        assertEquals(expectedExceptionMessage, exceptionObj.getMessage());
    }

    @Test
    void shouldThrowInvalidIdExceptionWhenIdIsBlank(){
        String id = " ";
        String merchName = "Vidhi";
        SpendingCategory spendingCategory = SpendingCategory.TRAVEL;
        String expectedExceptionMessage = "Invalid Merchant ID:  ";

        var exceptionObj = assertThrows(InvalidMerchantIdException.class , () -> new Merchant(id, merchName, spendingCategory));

        assertEquals(expectedExceptionMessage,exceptionObj.getMessage());
    }

    @Test
    void shouldThrowInvalidNameExceptionWhenNameIsNull(){
        String id = "101";
        String merchName = null;
        SpendingCategory spendingCategory = SpendingCategory.TRAVEL;
        String expectedExceptionMessage = "Invalid Merchant Name: null";

        var exceptionObj = assertThrows(InvalidMerchantNameException.class , () -> new Merchant(id, merchName, spendingCategory));

        assertEquals(expectedExceptionMessage, exceptionObj.getMessage());
    }

    @Test
    void shouldThrowInvalidNameExceptionWhenNameIsBlank(){
        String id = "101";
        String merchName = " ";
        SpendingCategory spendingCategory = SpendingCategory.TRAVEL;
        String expectedExceptionMessage = "Invalid Merchant Name:  ";

        var exceptionObj = assertThrows(InvalidMerchantNameException.class , () -> new Merchant(id, merchName, spendingCategory));

        assertEquals(expectedExceptionMessage, exceptionObj.getMessage());
    }

}