package com.example.tips;

import java.math.BigDecimal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TipController {

    private final TipCalculator calculator;

    public TipController(TipCalculator calculator) {
        this.calculator = calculator;
    }

    @GetMapping("/tip")
    public BigDecimal tip(@RequestParam BigDecimal bill, @RequestParam int percent) {
        return calculator.tip(bill, percent);
    }
}
