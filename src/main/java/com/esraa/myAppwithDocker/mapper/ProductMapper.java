package com.esraa.myAppwithDocker.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.esraa.myAppwithDocker.dto.classes.ProductDtoClass;
import com.esraa.myAppwithDocker.model.Product;

@Mapper(componentModel = "spring")
public interface ProductMapper {
	
	Product toEntity(ProductDtoClass dto);
	
	
	ProductDtoClass toDto(Product product);
	
	
	List<Product> toEntityList(List<ProductDtoClass> dtos);
	
	List<ProductDtoClass> toDtoList (List<Product> products);
}
