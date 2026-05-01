package com.example.bookmyticket;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class plane {

    @GetMapping("/Plane")
    public String getData(){

        return "Welcome to BookMyPlan, Enjoy your holidays booking at 100% off";
    }

}