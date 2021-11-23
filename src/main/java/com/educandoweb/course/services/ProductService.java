package com.educandoweb.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.course.entities.Product;
import com.educandoweb.course.repositories.ProductRepositories;

@Service
public class ProductService {

	@Autowired
	private ProductRepositories productRepositories;
	
	public List<Product> findAll(){
		return productRepositories.findAll();
	}
	
	public Product findById(Long id) {
		Optional<Product> obj = productRepositories.findById(id);
		
		return obj.get();
	}
}
