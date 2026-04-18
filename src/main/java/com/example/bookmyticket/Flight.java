package com.example.bookmyticket;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Flight {

    @GetMapping("/flight")
    public String getData(){

        return "Welcome to BookMyPlan, Enjoy flights booking at 10% off";
    }

}
