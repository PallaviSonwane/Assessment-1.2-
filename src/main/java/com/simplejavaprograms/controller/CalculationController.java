package com.simplejavaprograms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.simplejavaprograms.service.CalculationServiceImp;

@RestController
@RequestMapping("/calculate")
public class CalculationController {
    
    @Autowired
    private CalculationServiceImp service;
    
    @PostMapping("/square")
    public void calculateSquare(@RequestParam("no") int no){
       service.performAllCalculations(no);
    }
}
