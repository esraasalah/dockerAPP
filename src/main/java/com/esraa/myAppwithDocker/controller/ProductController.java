package com.esraa.myAppwithDocker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.esraa.myAppwithDocker.dto.classes.ProductDtoClass;
import com.esraa.myAppwithDocker.model.Product;
import com.esraa.myAppwithDocker.service.ProductService;




@RestController
@RequestMapping("/")

public class ProductController {
	
	     
	
	final ProductService productService ;
	
	@Autowired
	public ProductController(ProductService productService) {
		
		this.productService = productService ;
		
		
	}
	
	
	
	          
	@GetMapping("/products")
	public List<ProductDtoClass> getProducts()
	{
		
		return productService.getAllProducts();
		
		
	}
	
	
	
	
	@GetMapping("/v2/products")
	public List<ProductDtoClass> getProductsV2()
	{
		
		return productService.getAllProductsV2();
		
		
	}
	
	
	
	

}
