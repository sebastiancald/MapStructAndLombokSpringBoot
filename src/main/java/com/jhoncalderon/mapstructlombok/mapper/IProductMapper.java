package com.jhoncalderon.mapstructlombok.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;

import com.jhoncalderon.mapstructlombok.dto.GetProduct;
import com.jhoncalderon.mapstructlombok.entity.Product;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface IProductMapper {
	
	@Mapping(source = "id", target = "id")
	GetProduct toGetDto(Product product);

}
