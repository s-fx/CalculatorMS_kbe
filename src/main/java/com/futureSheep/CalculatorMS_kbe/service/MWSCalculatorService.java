package com.futureSheep.CalculatorMS_kbe.service;

import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service("MWSCalculator")
public class MWSCalculatorService {

    public BigDecimal calculateMWS(BigDecimal price) {
        return price.multiply(BigDecimal.valueOf(0.18));
    }

}
