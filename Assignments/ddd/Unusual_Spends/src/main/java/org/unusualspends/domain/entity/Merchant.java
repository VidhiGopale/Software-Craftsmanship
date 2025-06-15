package org.unusualspends.domain.entity;

import org.unusualspends.domain.valueobject.SpendingCategory;
import org.unusualspends.exception.InvalidMerchantIdException;

public class Merchant {
    private final String id;
    private final String name;
    private final SpendingCategory category;

    public Merchant(String id, String name, SpendingCategory category) {
        if(id==null|| id.isBlank()){
            throw new InvalidMerchantIdException(id);
        }
        this.id = id;
        this.name = name;
        this.category = category;
    }

    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public SpendingCategory getCategory() {
        return category;
    }
}

