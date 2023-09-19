package com.akshay.ecommerce.ecommerce_system;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public class InMemoryProductRepository implements ProductRepository {
	private final Map<String , Product> products = new HashMap<String, Product>();
	
	public InMemoryProductRepository() {
		// Initialize some sample products
		
		products.put("1", new Product(1 , "Smart Phone" , 19.99));
		products.put("2", new Product(2 , "Laptop" , 29.99));
	}
	
	public Product getProductById(String productId) {
		return products.get(productId);
	}
}
