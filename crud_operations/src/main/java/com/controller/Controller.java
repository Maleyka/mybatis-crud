package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import com.services.CalculatorService;

@RestController
public class Controller {
    @Autowired
    CalculatorService s;
}
