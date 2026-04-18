package com.example.bookmyticket;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Trains {

    @GetMapping("/Trains")
    public String getData(){

        return "Welcome to BookMyPlan, Enjoy Trains booking at 10% off";
    }

}