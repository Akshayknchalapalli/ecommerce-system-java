package com.akshay.ecommerce.ecommerce_system;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.akshay.ecommerce.ecommerce_system")
public class App {

    @Bean
    public ShoppingCart shoppingCart() {
        return new ShoppingCart();
    }

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        // Retrieve UserAccount bean from the Spring context
        UserAccount user = context.getBean(UserAccount.class);

        // Access and print the username
        String username = user.getUsername();
        System.out.println("Username: " + username);

        // Add products to the cart
        Product productA = user.getProductService().getProductById("1");
        Product productB = user.getProductService().getProductById("2");

        user.addToCart(productA, 2);
        user.addToCart(productB, 1);

        // Access and print the items in the user's shopping cart
        System.out.println("User's Shopping Cart:");
        for (CartItem item : user.getCart().getItems()) {
            System.out.println("Product: " + item.getProduct().getProductName());
            System.out.println("Price: $" + item.getProduct().getPrice());
            System.out.println("Quantity: " + item.getQuantity());
            System.out.println("Total Price: $" + item.getTotalPrice());
            System.out.println();
        }

        // Calculate and print the total price
        double totalPrice = user.getCheckoutService().calculateTotalPrice(user.getCart());
        System.out.println("Total Price: $" + totalPrice);

        // Simulate the checkout process
        user.checkout();
    }
}
