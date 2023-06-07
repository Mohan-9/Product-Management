package com.product.service;

import java.util.List;

import com.product.entity.Product;

public interface ProductService {
	public Product saveProduct(Product product);
	public Product updateProduct(Integer cid);
	public void deleteProduct(Integer cid);
	public List<Product> getAll();
	

}
