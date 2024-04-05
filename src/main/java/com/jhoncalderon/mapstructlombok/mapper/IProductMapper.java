package com.jhoncalderon.mapstructlombok.mapper;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.mapstruct.Mappings;

import com.jhoncalderon.mapstructlombok.dto.GetProduct;
import com.jhoncalderon.mapstructlombok.entity.Product;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface IProductMapper {
	
	@Mappings({
		@Mapping(source = "id", target = "id"),
		@Mapping(source = "name", target = "name"),
		@Mapping(source = "atCreate", target = "creationDate", 
		dateFormat = "yyyy-MM-dd HH-mm-ss")
	})
	GetProduct toGetDto(Product product);
	
	@InheritInverseConfiguration
	Product toEntity(GetProduct getProduct);

}
