package com.ashley.displaydate.controllers;

//import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Date;
//import java.time.LocalTime;
//import java.time.format.DateTimeFormatter;
//import java.fucking.kitchenSink all of those were extranious

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //this is what returns jsp, also known as a decorator
//****only one per controller******
//@RestController
//@RequestMapping
public class MainController {



	@RequestMapping("/")
	public String home() {
		return "index.jsp";
	}
	
	@RequestMapping("/date")
	public String date(Model model) {
		model.addAttribute("date", new Date());
		SimpleDateFormat formatter = new SimpleDateFormat("EEEE, 'the' d 'of' MMMM, yyyy");
		String date = formatter.format(new Date());
		System.out.println(date);
		return "date.jsp";
	}
	

	@RequestMapping("/time")
	public String time(Model model) {
		SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");
		String date = formatter.format(new Date());
		System.out.println(date);
		model.addAttribute("time", date);
		return "time.jsp";

}
	
	
	
}


