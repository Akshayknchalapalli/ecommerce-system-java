package com.akshay.ecommerce.ecommerce_system;

import org.springframework.stereotype.Service;

@Service
public class CheckoutService {
	public double calculateTotalPrice(ShoppingCart cart) {
		double totalPrice = 0.0;
		for(CartItem item : cart.getItems()) {
			totalPrice += item.getTotalPrice();
		}
		return totalPrice;
	}
	
	// Add payment processing and inventory update logic as needed
}
