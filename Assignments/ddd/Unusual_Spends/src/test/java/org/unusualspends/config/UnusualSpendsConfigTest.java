package org.unusualspends.config;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UnusualSpendsConfigTest {

    @Test
    void shouldCreateObjectWithGivenValues() {
        double percentage=40;

        var unusalSpendsConfig = new UnusualSpendsConfig(percentage);

        assertEquals(percentage, unusalSpendsConfig.getPercentage());
    }
}