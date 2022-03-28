package com.futureSheep.CalculatorMS_kbe.service;

import lombok.extern.apachecommons.CommonsLog;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@CommonsLog
@Service("MWSCalculator")
public class MWSCalculatorService {

    public BigDecimal calculateMWS(BigDecimal price) {
        log.info("[CalculatorService] calculate MWS with price: " + price);
        return price.multiply(BigDecimal.valueOf(0.18));
    }

}
