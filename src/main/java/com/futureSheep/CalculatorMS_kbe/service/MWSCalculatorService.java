package com.futureSheep.CalculatorMS_kbe.service;

import org.springframework.stereotype.Service;

@Service("MWSCalculator")
public class MWSCalculatorService {

    public static double calculateMWS(double price) {
        return price * 0.18;
    }

}
