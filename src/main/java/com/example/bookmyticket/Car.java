package com.example.bookmyticket;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Car {

    @GetMapping("/Car")
    public String getData(){

        return "Welcome to BookMyPlan, Enjoy Car booking at 10% off";
    }

}