package com.futureSheep.CalculatorMS_kbe.service;

import org.springframework.stereotype.Service;

@Service("MWSCalculator")
public class MWSCalculatorServiceImpl implements MWSCalculatorService {

    @Override
    public double calculateMWS(double price) {
        return price * 0.18;
    }

}
