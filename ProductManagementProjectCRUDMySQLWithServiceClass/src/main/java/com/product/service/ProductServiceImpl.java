package com.product.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.entity.Product;
import com.product.repo.ProductRepo;


@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	private ProductRepo prodRepo;

	@Override
	public Product saveProduct(Product product) {
		int total =0;
		double discount =0.0;
		double gst=0.0;
		double totalbill=0.0;
		
		total = (int) (product.getPrice()*product.getQuantity());
		if(total<2500)
			discount = total*10/100;
		else if(total>=2500 && total<50000)
			discount = total*15/100;
		else
			discount = total*30/100;
		
		if(total<10000)
			gst = total*5/100;
		else
			gst=total*15/100;
		
		totalbill = total-discount+gst;
		product.setTotal(total);
		product.setDiscount(discount);
		product.setServicecharges(gst);
		product.setTotalbill(totalbill);
		prodRepo.save(product);
		
		return product;
	}

	@Override
	public Product updateProduct(Integer cid) {
		Product prod =prodRepo.findById(cid).get();
		return prod;
	}

	@Override
	public void deleteProduct(Integer cid) {
		prodRepo.deleteById(cid);

	}

	@Override
	public List<Product> getAll() {
		List<Product> prod =(List<Product>) prodRepo.findAll();
		return prod;
		

	}

}
