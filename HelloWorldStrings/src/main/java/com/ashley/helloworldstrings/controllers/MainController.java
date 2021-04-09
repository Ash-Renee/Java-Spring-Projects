package com.ashley.helloworldstrings.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class MainController {

	//LISTEN FOR URLS AND SEND BACK RESPONSES
	@RequestMapping("") //urls.py
	public String index() { //views.py methods
		return "Hewwo World UwU";
	}
	
	@RequestMapping("/random")
	public String random() {
		return "Oh no you messed up!  Go back before it's too late!";
	}
	
}
