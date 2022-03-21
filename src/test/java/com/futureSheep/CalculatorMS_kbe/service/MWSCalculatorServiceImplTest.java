package com.futureSheep.CalculatorMS_kbe.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ContextConfiguration(classes = {MWSCalculatorServiceImpl.class})
@ExtendWith(SpringExtension.class)
class MWSCalculatorServiceImplTest {
    @Autowired
    private MWSCalculatorServiceImpl mWSCalculatorServiceImpl;

    @Test
    void testCalculateMWS() {
        assertEquals(1.7999999999999998d,
                this.mWSCalculatorServiceImpl.calculateMWS(10.0d));
    }
}

