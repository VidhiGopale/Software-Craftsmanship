package org.unusualspends.db;

import org.unusualspends.domain.entity.Merchant;
import org.unusualspends.domain.entity.Transaction;

import java.util.ArrayList;
import java.util.List;

public class MerchantDB {
    private final List<Merchant> merchants;

    public MerchantDB(){
        merchants=new ArrayList<>();
    }

    public List<Merchant> getMerchants(){
        return merchants;
    }

    public void addMerchant(Merchant merchant){
        this.merchants.add(merchant);
    }
}
