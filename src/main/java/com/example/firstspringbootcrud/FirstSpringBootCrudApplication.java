package com.example.firstspringbootcrud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class FirstSpringBootCrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstSpringBootCrudApplication.class, args);
	}

	@GetMapping
	public String hellow(){
		return "hellow world";
	}
}
