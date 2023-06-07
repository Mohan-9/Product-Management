package com.product.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.product.entity.Product;
@Repository
public interface ProductRepo extends CrudRepository<Product, Integer> {

}
