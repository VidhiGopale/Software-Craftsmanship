package org.unusualspends.repo;

import org.unusualspends.db.MerchantDB;
import org.unusualspends.db.TransactionDB;
import org.unusualspends.domain.entity.Merchant;
import org.unusualspends.domain.entity.Transaction;

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
}
