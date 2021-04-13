package com.ashley.hellohuman.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HumanController {
	@RequestMapping("/")
	public String index(@RequestParam(value="first_name", required=false) String first_name, @RequestParam(value="last_name", required=false) String last_name) {
		if(first_name == null) {
			return "<h1>Welcome to the jungle Human</h1>";
		}
		else if(last_name == null) {
			return "Welcome to the jungle, " + first_name;
		}
		else {
			return "Welcome to the jungle, " + first_name + " " + last_name;
		}


	}
}
