package org.unusualspends.service;

import org.unusualspends.domain.valueobject.SpendingCategory;

import java.util.HashMap;
import java.util.Map;

public class UnusualSpendsProcessor {

    public Map<SpendingCategory, Double> getUnusualSpending(
            Map<SpendingCategory, Double> lastMonthSpending,
            Map<SpendingCategory, Double> currentMonthSpending) {

        Map<SpendingCategory, Double> result = new HashMap<>();

        for (SpendingCategory category : currentMonthSpending.keySet()) {
            double current = currentMonthSpending.getOrDefault(category, 0.0);
            double last = lastMonthSpending.getOrDefault(category, 0.0);

            if (last == 0 && current > 0) {
                result.put(category, current); // first time spending
            } else if (current >= 1.5 * last) {
                result.put(category, current); // 50% more
            }
        }

        return result;
    }
}

