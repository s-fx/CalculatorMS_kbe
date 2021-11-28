package com.futureSheep.CalculatorMS_kbe.controller;

import com.futureSheep.CalculatorMS_kbe.service.MWSCalculatorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class CalculatorController {

    @GetMapping("/calculator/{price}")
    public double getMWS(@PathVariable double price) {
        return MWSCalculatorService.calculateMWS(price);
    }

}
