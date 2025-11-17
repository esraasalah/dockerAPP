package com.esraa.myAppwithDocker.model;

import java.io.Serializable;

import org.hibernate.annotations.GeneratorType;
import org.hibernate.annotations.ValueGenerationType;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="products")
@Data
public class Product implements Serializable{

	@Id
	Integer id ;
	
	String name ;
	
	Double price ;
	
	
	
	
}
