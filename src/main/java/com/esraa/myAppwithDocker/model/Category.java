package com.esraa.myAppwithDocker.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="categories")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Category  implements Serializable{
	
	
	@Id
	Integer id ;
	
	String name ;
	
	String description ;
	
	@JsonIgnore
	@OneToMany(mappedBy="category")
	//@JoinColumn(name="id")
	List<Product> products = new ArrayList<Product>();
	
	
	

}
