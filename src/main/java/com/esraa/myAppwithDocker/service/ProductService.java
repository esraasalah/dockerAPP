package com.esraa.myAppwithDocker.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.esraa.myAppwithDocker.model.Product;
import com.esraa.myAppwithDocker.repo.ProductRepo;



@Service
public class ProductService {  
	
	

	final ProductRepo  productRepo ;
	
	
	@Autowired
	     public ProductService( ProductRepo productRepo)
	{
		
		this.productRepo = productRepo ;
		
	}
	
	
	
	
	@Cacheable("products")  
	public List<Product> getAllProducts()
	{
		
		return productRepo.findAll();
		
	}
	
	
	
	
	     
	     
	     

}
