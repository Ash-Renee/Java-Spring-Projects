package com.ashley.codingdbdemo.controller;

import java.util.List;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ashley.codingdbdemo.models.User;
import com.ashley.codingdbdemo.services.MainService;

@RestController
public class MainController {
	private final MainService mainServ;
	
	public MainController(MainService mainServ) {
		this.mainServ = mainServ;
	}
	

	//RETIRIEVE ALL USERS
	@GetMapping("/users")
	public List<User> getAllUsers() {
		return mainServ.allUsers();
		}
	
	
	//Retrieve a user by id
	@GetMapping("/users/{id}")
	public User findUser(
			@PathVariable("id") Long user_id
			) {
		return mainServ.findUser(user_id);
	}
	
	
	//CREATE A USER
	@PostMapping("/users/new")
	public User createUser(
			@RequestParam("name") String name,
			@RequestParam("email") String email,
			@RequestParam("password") String password
			) {
		User newUser = new User(name, email, password);
		User newObj = mainServ.createUser(newUser);
		return newObj;

	}
	
	//edit a user
	user newObj = mainServ.

	

	
	
	
	
	
	
//	@RequestMapping("")
//	public String index() {
//		return "index.jsp";
//	}

}