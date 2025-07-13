package org.unusualspends.repo;

import org.junit.jupiter.api.Test;
import org.unusualspends.db.MerchantDB;
import org.unusualspends.domain.entity.Merchant;
import org.unusualspends.domain.valueobject.SpendingCategory;

import static org.junit.jupiter.api.Assertions.*;

class MerchantRepoTest {
    @Test
    void shouldAbleToAddAndGetAllMerchants(){

        var merch1 = new Merchant("101","Vidhi",SpendingCategory.FOOD);
        var merch2 = new Merchant("201", "Nidhi", SpendingCategory.JWELLERY);
        var merchantDb=new MerchantDB();
        var merchantRepo=new MerchantRepo(merchantDb);
        merchantRepo.addMerchant(merch1);
        merchantRepo.addMerchant(merch2);
        var merchants=merchantRepo.getAllMerchants();

        assertFalse(merchants.isEmpty());
        assertTrue(merchants.size()==2);
    }

    @Test
    void shouldAbleToGetMerchantById(){
        var merch = new Merchant("101","Vidhi",SpendingCategory.FOOD);
        var merchantDb = new MerchantDB();
        var merchantRepo = new MerchantRepo(merchantDb);
        merchantRepo.addMerchant(merch);
        var merchantId = merchantRepo.getMerchantById(merch.getId());

        assertFalse(merchantId.getId().isEmpty());
        assertEquals("101",merchantId.getId());
    }

    @Test
    void shouldAbleToGetMerchantCategoryById(){
        var merch = new Merchant("101","Vidhi",SpendingCategory.FOOD);
        var merchantDb = new MerchantDB();
        var merchantRepo = new MerchantRepo(merchantDb);
        merchantRepo.addMerchant(merch);
        var spendingCategory = merchantRepo.getMerchantCategoryById(merch.getId());
//test push
//        assertEquals("FOOD",merch.getCategory());
    }

}