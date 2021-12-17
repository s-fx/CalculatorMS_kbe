package com.futureSheep.CalculatorMS_kbe.controller;

import com.futureSheep.CalculatorMS_kbe.service.MWSCalculatorService;
import com.futureSheep.CalculatorMS_kbe.service.MWSCalculatorServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class CalculatorController {

    MWSCalculatorService calculatorService = new MWSCalculatorServiceImpl();

    @GetMapping("/calculator/{price}")
    public double getMWS(@PathVariable double price) {
        System.out.println("Price received: " + price);
        return calculatorService.calculateMWS(price);
    }

}
