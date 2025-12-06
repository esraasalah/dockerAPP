package com.esraa.myAppwithDocker;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Lazy;

import com.esraa.myAppwithDocker.service.ProductService;

@SpringBootApplication
@EnableCaching
public class MyAppwithDockerApplication {
	
	

	public static void main(String[] args) {
		SpringApplication.run(MyAppwithDockerApplication.class, args);
		
	
	
	}
	
	
	
	
	@Lazy       // we can ues @Lazy(false) to exclude the bean from the global bean lazy initialization 
	 @Bean
	    public ModelMapper modelMapper() {
	        ModelMapper modelMapper = new ModelMapper();
	        
	        return modelMapper;
	    }
	
	
	 
	
	
	 

}
