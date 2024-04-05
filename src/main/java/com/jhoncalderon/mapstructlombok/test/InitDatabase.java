package com.jhoncalderon.mapstructlombok.test;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.jhoncalderon.mapstructlombok.IProductRepository;
import com.jhoncalderon.mapstructlombok.entity.Product;

@Configuration
public class InitDatabase {

	private final IProductRepository productRepository;

	public InitDatabase(IProductRepository productRepository) {
		this.productRepository = productRepository;
	}

	@Bean
	public CommandLineRunner testProductMapper() {
		return args -> {
			List<Product> products = productRepository.findAll();
			System.out.println("PRODUCTS");
			products.forEach(System.out::println);
		};
	}

}
