package com.example.bookmyticket;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class BookmyticketApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookmyticketApplication.class, Arrays.toString(args));
	}

}
