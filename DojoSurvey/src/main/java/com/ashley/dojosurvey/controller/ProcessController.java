package com.ashley.dojosurvey.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ProcessController {

	
	@RequestMapping(value="/process", method=RequestMethod.POST)
	public String result(@RequestParam(value="name") String name, @RequestParam(value="dojo") String dojo, @RequestParam(value="language") String language, @RequestParam(value="comment") String comment, HttpSession session) {
		session.setAttribute("name", name);
		session.setAttribute("dojo", dojo);
		session.setAttribute("language", language);
		session.setAttribute("comment", comment);
		if(language.equals("Java")) {
			return "redirect:/javaresult";
		}	else {
		return "redirect:/mainresult";
		}
	}
	
	@RequestMapping("/mainresult")
	public String mainresult() {
		return "mainresult.jsp";
	}
	
	@RequestMapping("/javaresult")
	public String javaresult() {
		return "javaresult.jsp";
	}
	
}
