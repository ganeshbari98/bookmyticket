package com.example.bookmyticket;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hotels {

    @GetMapping("/Hotels")
    public String getData(){

        return "Welcome to BookMyPlan, Enjoy Hotels booking at 10% off";
    }

}
