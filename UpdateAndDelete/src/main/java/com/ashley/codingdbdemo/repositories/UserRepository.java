package com.ashley.codingdbdemo.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ashley.codingdbdemo.models.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long>{
	//we define queries that retrieve info for us
	List<User> findAll();
	
	
	
}
