package com.educandoweb.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.course.entities.Category;
import com.educandoweb.course.repositories.CategoryRepositories;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepositories categoryRepositories;
	
	public List<Category> findAll(){
		return categoryRepositories.findAll();
	}
	
	public Category findById(Long id) {
		Optional<Category> obj = categoryRepositories.findById(id);
		
		return obj.get();
	}
}
