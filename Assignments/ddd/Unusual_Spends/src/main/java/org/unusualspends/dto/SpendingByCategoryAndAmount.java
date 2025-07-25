package org.unusualspends.dto;

import org.unusualspends.domain.valueobject.SpendingCategory;

public class SpendingByCategoryAndAmount {
    private final SpendingCategory category;
    private final Double amount;

    public SpendingByCategoryAndAmount(SpendingCategory category, Double amount) {
        this.category = category;
        this.amount = amount;
    }

    public SpendingCategory getCategory() {
        return category;
    }

    public Double getAmount() {
        return amount;
    }
}
