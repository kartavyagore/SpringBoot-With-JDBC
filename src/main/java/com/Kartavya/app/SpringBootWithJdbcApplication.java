package com.Kartavya.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootWithJdbcApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWithJdbcApplication.class, args);
		System.out.println("Hello World");
	}

}
