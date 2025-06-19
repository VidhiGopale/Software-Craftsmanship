package org.unusualspends.repo;
//something missing here
import org.unusualspends.db.MerchantDB;
import org.unusualspends.domain.entity.Merchant;
import org.unusualspends.domain.valueobject.SpendingCategory;
import org.unusualspends.exception.MerchantNotFoundException;

import java.util.List;

public class MerchantRepo {
    private final MerchantDB merchantDB;

    public MerchantRepo(MerchantDB merchantDB) {
        this.merchantDB = merchantDB;
    }

    public void addMerchant(Merchant merchant) {
        this.merchantDB.addMerchant(merchant);
    }

    public List<Merchant> getAllMerchants() {
        return this.merchantDB.getMerchants();
    }

    public Merchant getMerchantById(String merchantId){
        var merchant =this.merchantDB.getMerchantById(merchantId);
        if(merchant==null){
            throw new MerchantNotFoundException(merchantId);
        }
        return merchant;
    }

    public SpendingCategory getMerchantCategoryById(String merchantId){
        var merchant=getMerchantById(merchantId);
        return merchant.getCategory();
    }
}
