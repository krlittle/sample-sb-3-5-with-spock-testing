package com.example.tips;

import java.math.BigDecimal;
import java.math.RoundingMode;

import org.springframework.stereotype.Component;

@Component
public class TipCalculator {

    public BigDecimal tip(BigDecimal bill, int percent) {
        return bill.multiply(BigDecimal.valueOf(percent)).divide(BigDecimal.valueOf(100), 2, RoundingMode.HALF_UP);
    }
}
