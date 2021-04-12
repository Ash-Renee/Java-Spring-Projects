package com.ashley.springdemo.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController

public class DojoController {
	@RequestMapping("/{dojo}")
	
	public String dojo(@PathVariable("dojo") String dojo) {
		
		String output = "";
		
		if (dojo.equals("burbank-dojo")) {
			output = "Burbank Dojo is located in the bad place";
		}
		else if (dojo.equals("San-Jose")) {
			output = "SJ is the old dojo HQ";
		}
		else {
			output = dojo + " is awesome";
		}
		return output;
		
	}
	
	

}
