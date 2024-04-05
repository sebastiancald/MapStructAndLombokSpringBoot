package com.jhoncalderon.mapstructlombok;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jhoncalderon.mapstructlombok.entity.Product;

@Repository
public interface IProductRepository extends JpaRepository<Product, Long> {

}
