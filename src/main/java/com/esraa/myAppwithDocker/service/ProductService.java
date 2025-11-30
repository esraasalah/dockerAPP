package com.esraa.myAppwithDocker.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import com.esraa.myAppwithDocker.dto.classes.ProductDtoClass;
import com.esraa.myAppwithDocker.exceptions.ResourceNotFoundException;
import com.esraa.myAppwithDocker.mapper.ProductMapper;
import com.esraa.myAppwithDocker.model.Product;
import com.esraa.myAppwithDocker.repo.ProductRepo;

import jakarta.persistence.EntityNotFoundException;



@Service
@Lazy
public class ProductService {  
	
	

	private final ProductRepo  productRepo ;
	private final ModelMapper modelMapper;
	
	@Autowired 
	private ProductMapper productMapper ;
	

	     public ProductService( ProductRepo productRepo , ModelMapper modelMapper)
	{
		
		this.productRepo = productRepo ;
		this.modelMapper = modelMapper ;
		
	}
	
	
	
	
	
	
	@Cacheable("products")  
	public List<ProductDtoClass> getAllProducts()
	{
		
		// map list of entities to list of DTOs using streamapi and modelmapper
		// goog but not optimal for large projects and data sets 
		//Best Practice  — Use MapStruct (recommended)
		
		             List<Product> products =  productRepo.findAll();
		
		     return     products.stream()
		         .map(product-> modelMapper.map(product, ProductDtoClass.class))
		         .collect(Collectors.toList());
		
		         
	}
	
	
	@Cacheable("products_v2")  
	public List<ProductDtoClass> getAllProductsV2()
	{
		
		// map list of entities to list of DTOs using streamapi and modelmapper
		// goog but not optimal for large projects and data sets 
		//Best Practice  — Use MapStruct (recommended)
		
		             List<Product> products =  productRepo.findAll();
		
		     return     productMapper.toDtoList(products);
		
		         
	}
	
	
	public Product getProduct(Integer id) 
	{
		
		return  productRepo.findById(id).orElseThrow(() -> new ResourceNotFoundException("User not found with id: " + id));
		

	}
	
	     
	     
	     

}
