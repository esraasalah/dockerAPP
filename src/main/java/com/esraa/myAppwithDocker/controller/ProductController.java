package com.esraa.myAppwithDocker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.esraa.myAppwithDocker.dto.classes.ProductDtoClass;
import com.esraa.myAppwithDocker.model.Product;
import com.esraa.myAppwithDocker.model.ResponseModel;
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
	public ResponseModel getProductsV2()
	{
		
		return new ResponseModel("200", productService.getAllProductsV2(), null);
		
		
	}
	
	
	@GetMapping("product/{id}")
	public ResponseModel getProduct(@PathVariable Integer id )
	{
		
	     return new ResponseModel("200", productService.getProduct(id), null);
		
	}
	
	

}
