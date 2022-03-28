package com.futureSheep.CalculatorMS_kbe.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;

import org.junit.jupiter.api.Disabled;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ContextConfiguration(classes = {MWSCalculatorService.class})
@ExtendWith(SpringExtension.class)
class MWSCalculatorServiceTest {
    @Autowired
    private MWSCalculatorService mWSCalculatorService;

    @Test
    void testCalculateMWS() {
        assertEquals("7.56", this.mWSCalculatorService.calculateMWS(BigDecimal.valueOf(42L)).toString());
    }

    @Test
    @Disabled("TODO: This test is incomplete")
    void testCalculateMWS2() {
        // TODO: This test is incomplete.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at com.futureSheep.CalculatorMS_kbe.service.MWSCalculatorService.calculateMWS(MWSCalculatorService.java:14)
        //   In order to prevent calculateMWS(BigDecimal)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   calculateMWS(BigDecimal).
        //   See https://diff.blue/R013 to resolve this issue.

        this.mWSCalculatorService.calculateMWS(null);
    }
}

