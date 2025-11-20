package com.esraa.myAppwithDocker;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableCaching
public class MyAppwithDockerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyAppwithDockerApplication.class, args);
	}
	
	
	 @Bean
	    public ModelMapper modelMapper() {
	        ModelMapper modelMapper = new ModelMapper();
	        
	        return modelMapper;
	    }
	 
	 
	 

}
