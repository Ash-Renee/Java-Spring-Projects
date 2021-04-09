package com.ashley.kitteh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class KittehApplication {

	public static void main(String[] args) {
		SpringApplication.run(KittehApplication.class, args);
	}
	
	@GetMapping("/")
	public String hello() {
		return "Hewwo Kitteh";
	}
	
	
	@GetMapping("/Kitteh")
	public String[] CatNames() {
		return new String[] {"Kitty White", "Salem", "The Bastard", "Athena", "Chairman Meow"};
	}
	
}
