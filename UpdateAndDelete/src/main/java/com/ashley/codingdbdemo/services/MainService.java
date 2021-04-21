package com.ashley.codingdbdemo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.ashley.codingdbdemo.models.User;
import com.ashley.codingdbdemo.repositories.UserRepository;




@Service
public class MainService {
	private final UserRepository userRepo;
	
	public MainService(UserRepository userRepo) {
		this.userRepo = userRepo;
	}
	
	
	// here we create our crud operations
	
	// retrieve all
	public List<User> allUsers(){
		return userRepo.findAll();
	}

	//create a user
	public User createUser(User user) {
		return userRepo.save(user);
	}
	
	//update user
	public List<User> updateUser(id) {
		person = User.objec:
			username=
			
			userRepo.save(person);
	}
	
	// grab a user by id
	
	public User findUser(Long id) {
		return userRepo.findById(id).orElse(null);
	}
//        Optional<User> optionalUser = userRepo.findById(id);
//        if(optionalUser.isPresent()) {
//            return optionalUser.get();
//        } else {
//            return null;
//	}
//	}
	// userObj.updateUser
}
