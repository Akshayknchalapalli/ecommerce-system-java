package com.akshay.ecommerce.ecommerce_system;

import org.springframework.stereotype.Component;

@Component
public class UserAccount {
    private String username;
    private ShoppingCart cart;
    private ProductService productService;
    private CheckoutService checkoutService;
    
	public UserAccount(String username, ShoppingCart cart, ProductService productService,
			CheckoutService checkoutService) {
		super();
		this.username = username;
		this.cart = cart;
		this.productService = productService;
		this.checkoutService = checkoutService;
	}
	
	public void addToCart(Product product, int quantity) {
	    // Check if the product is already in the cart
	    for (CartItem item : cart.getItems()) {
	        if (item.getProduct().getProductId() == product.getProductId()) {
	            // Update the quantity if the product is already in the cart
	            item.setQuantity(item.getQuantity() + quantity);
	            return;
	        }
	    }
	    // If the product is not in the cart, create a new CartItem
	    CartItem newItem = new CartItem(product, quantity);
	    cart.addItem(newItem);
	}
	
	public void removeFromCart(Product product) {
		// Remove the product from the cart
		CartItem itemToRemove = null;
		
		for(CartItem item : cart.getItems()) {
			if(item.getProduct().getProductId() == product.getProductId()) {
				itemToRemove = item;
				break;
			}
		}
		
		if(itemToRemove != null) {
			cart.removeItem(itemToRemove);
		}
	}

    // and initiating the checkout process

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public ShoppingCart getCart() {
		return cart;
	}

	public void setCart(ShoppingCart cart) {
		this.cart = cart;
	}

	public ProductService getProductService() {
		return productService;
	}

	public void setProductService(ProductService productService) {
		this.productService = productService;
	}

	public CheckoutService getCheckoutService() {
		return checkoutService;
	}

	public void setCheckoutService(CheckoutService checkoutService) {
		this.checkoutService = checkoutService;
	}
	
	public void checkout() {
        // Perform the checkout process here
        double totalPrice = checkoutService.calculateTotalPrice(cart);
        
        //Simulate payment processing 
        boolean paymentSuccessful = processPayment(totalPrice);
        
        if(paymentSuccessful) {
        	//Update inventory
        	updateinventory(cart);
        }
        // In a real-world scenario, you would perform payment processing and inventory updates here
        System.out.println("Checkout completed. Total Price: $" + totalPrice);
        cart.clearCart(); // Clear the cart after checkout
    }

	private void updateinventory(ShoppingCart cart) {
		// implement the actual inventory
		System.out.println("Updating inventory");
		
	}
	

	private boolean processPayment(double totalPrice) {
		// implement the actual payment processing 
		System.out.println("Processing payment of $" + totalPrice);
		return true;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
    
}
