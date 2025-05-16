package com.H2DBApp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.H2DBApp.entity.Product;
import com.H2DBApp.repository.ProductRepo;

@Service
public class ProductSvc {
    @Autowired
	private ProductRepo produtRepo;

    public void saveProduct() {
    	Product p =new Product();
    	p.setProductName("Computer");
    	p.setProductPrice(100.00);
    	
    	produtRepo.save(p);
    	
    	System.out.println("Product got saved");
    	
    	
    }
}
