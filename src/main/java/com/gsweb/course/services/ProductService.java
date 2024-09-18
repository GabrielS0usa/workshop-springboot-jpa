package com.gsweb.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gsweb.course.entities.Product;
import com.gsweb.course.repositories.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository product;
	
	public List<Product> findAll() {
		return product.findAll();
	}
	
	public Product findbyId(Long id) {
		Optional<Product> obj = product.findById(id);
		return obj.get();
	}
}
