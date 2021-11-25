package com.educandoweb.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.course.entities.User;
import com.educandoweb.course.repositories.UserRepositories;

@Service
public class UserService {

	@Autowired
	private UserRepositories userRepositories;
	
	public List<User> findAll(){
		return userRepositories.findAll();
	}
	
	public User findById(Long id) {
		Optional<User> obj = userRepositories.findById(id);
		
		return obj.get();
	}
	
	public User insert(User obj) {
		return userRepositories.save(obj);
	}
}
