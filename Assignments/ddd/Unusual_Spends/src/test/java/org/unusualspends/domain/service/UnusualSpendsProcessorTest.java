package org.unusualspends.domain.service;

import org.junit.jupiter.api.Test;
import org.unusualspends.config.UnusualSpendsConfig;
import org.unusualspends.domain.valueobject.SpendingCategory;
import org.unusualspends.dto.SpendingByCategoryAndAmount;
import org.unusualspends.dto.UnusualSpend;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
class UnusualSpendsProcessorTest {
//    private final UnusualSpendsProcessor testSubject = new UnusualSpendsProcessor();
//
//    private static List<SpendingByCategoryAndAmount> getSpendingByCategory(SpendingCategory category, Double amount) {
//        return List.of(
//                new SpendingByCategoryAndAmount(category, amount)
//        );
//    }
//
//    @Test
//    void shouldBeAbleToGetUnusualSpendsWhenExceedThreshold() {
//        var lastMonthSpendingByCategoryAndAmountList = getSpendingByCategory(SpendingCategory.GROCERIES, 100.0);
//        var currentMonthSpendingByCategoryAndAmountList = getSpendingByCategory(SpendingCategory.GROCERIES, 200.0);
//        var unusualSpendsConfig = new UnusualSpendsConfig(50.0);
//        var expectedUnusualSpend1 = new UnusualSpend(SpendingCategory.GROCERIES, 200.0);
//        var expected = List.of(expectedUnusualSpend1);
//
//        var actual = testSubject.getUnusualSpending(
//                lastMonthSpendingByCategoryAndAmountList,
//                currentMonthSpendingByCategoryAndAmountList,
//                unusualSpendsConfig
//        );
//
//        assertTrue(expected.containsAll(actual));
//    }
//
//    @Test
//    void shouldBeAbleToReturnEmptyUnusualSpendsIfNotExceededThreshold() {
//
//        var lastMonthSpendingByCategoryAndAmountList = getSpendingByCategory(SpendingCategory.FOOD, 200.0);
//        var currentMonthSpendingByCategoryAndAmountList = getSpendingByCategory(SpendingCategory.FOOD, 250.0);
//        var unusualSpendsConfig = new UnusualSpendsConfig(50.0);
//
//        var actual = testSubject.getUnusualSpending(
//                lastMonthSpendingByCategoryAndAmountList,
//                currentMonthSpendingByCategoryAndAmountList,
//                unusualSpendsConfig
//        );
//
//        assertTrue(actual.isEmpty());
//    }
//
//    @Test
//    void shouldBeAbleToReturnUnusualSpendsIfMetThreshold() {
//        // Arrange
//        var lastMonthSpendingByCategoryAndAmountList = getSpendingByCategory(SpendingCategory.FOOD, 100.0);
//        var currentMonthSpendingByCategoryAndAmountList = getSpendingByCategory(SpendingCategory.FOOD, 150.0);
//        var unusualSpendsConfig = new UnusualSpendsConfig(50.0);
//        var expected = List.of(
//                new UnusualSpend(SpendingCategory.FOOD, 150.0)
//        );
//
//        var actual = testSubject.getUnusualSpending(
//                lastMonthSpendingByCategoryAndAmountList,
//                currentMonthSpendingByCategoryAndAmountList,
//                unusualSpendsConfig
//        );
//
//        assertTrue(actual.containsAll(expected));
//    }
}