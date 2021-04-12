package com.ashley.springdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/coding")
public class CodingController {
	@RequestMapping("")
	public String coding() {
		return "Hewwo Coding Dojo";
	}
	@RequestMapping("/python")
	public String python() {
		return "I miss python!";
	}
	
	@RequestMapping("/java")
	public String java() {
		return "Java is pain";
	}
	
	
	
	
	
	
}
