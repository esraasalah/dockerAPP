package com.esraa.myAppwithDocker.dto.classes;

import com.esraa.myAppwithDocker.model.Category;

import lombok.Data;

@Data
public class ProductDtoClass {
	
	
    Integer id ;
	
	String name ;
	
	 Double price ;
	 
	 Category category ;

}
