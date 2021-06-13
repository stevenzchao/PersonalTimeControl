package com.example.demo.pageable.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.demo.pageable.model.Product;
import com.example.demo.pageable.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository productRepository;
	
	
	public Product findById(Integer id) {
		Optional<Product> op = productRepository.findById(id);
		
		if(op.isPresent()) {
			return op.get();
		}else {
			return null;
		}
	}
	
	public List<Product> findAll(){
		return productRepository.findAll();
	}
	
	public Page<Product> findAllByList(Pageable pageable){
		return productRepository.findAll(pageable);
	}
	
}
