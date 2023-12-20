package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class PolyglotLabEdBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(PolyglotLabEdBackendApplication.class, args);
	}

	@GetMapping("/")
	public String Hello(){
		return  "blow" ;
	}
}
