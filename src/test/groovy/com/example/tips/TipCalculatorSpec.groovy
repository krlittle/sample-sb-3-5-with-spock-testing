package com.example.tips

import spock.lang.Specification

class TipCalculatorSpec extends Specification {

    def calculator = new TipCalculator()

    def "a #percent percent tip on #bill is #tip"() {
        expect:
        calculator.tip(bill, percent) == tip

        where:
        bill  | percent || tip
        20.00 | 15      || 3.00
        10.00 | 20      || 2.00
        33.33 | 18      || 6.00
    }
}
