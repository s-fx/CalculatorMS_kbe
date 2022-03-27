package com.futureSheep.CalculatorMS_kbe.controller;

import com.futureSheep.CalculatorMS_kbe.service.MWSCalculatorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
@RequestMapping("/api/v1")
public class CalculatorController {

    MWSCalculatorService calculatorService = new MWSCalculatorService();

    @GetMapping("/calculator/{price}")
    public BigDecimal getMWS(@PathVariable BigDecimal price) {
        System.out.println("Price received: " + price);
        return calculatorService.calculateMWS(price);
    }

}
