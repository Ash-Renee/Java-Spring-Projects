package com.ashley.counter.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class LabRat {
	
	@GetMapping("/")
	public String home(HttpSession session){ //session is the variable name
		//is this your first time here or not
		if(session.getAttribute("counter") == null) {
			session.setAttribute("counter", 0);
		}
		else {
			//increment this bish
			Integer sessionCounter = (Integer) session.getAttribute("counter");
			sessionCounter++;
			session.setAttribute("counter", sessionCounter);
		}
		return "index.jsp"; //did a getter and a setter
	}
		
	@GetMapping("/counter")
	public String counter(Model model, HttpSession session) {
		Integer counter = (Integer) session.getAttribute("counter");
		model.addAttribute("visits", counter);
		return "counter.jsp";
	}

	@GetMapping("/reset")
	public String reset(HttpSession session) {
		session.invalidate();
		return "redirect:/counter";
	}
	
	
}
