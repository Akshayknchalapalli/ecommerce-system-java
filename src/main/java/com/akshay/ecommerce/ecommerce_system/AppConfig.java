package com.akshay.ecommerce.ecommerce_system;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.akshay.ecommerce.ecommerce_system")
public class AppConfig {

    // Define a bean for the ProductRepository implementation
    @Bean
    public ProductRepository productRepository() {
        return new InMemoryProductRepository();
    }

    // Define a bean for the ProductService implementation, injecting the ProductRepository
    @Bean
    public ProductService productService() {
        return new ProductServiceImpl(productRepository());
    }

    // Define a bean for the CheckoutService
    @Bean
    public CheckoutService checkoutService() {
        return new CheckoutService();
    }

    // Define a bean for the ShoppingCart
    @Bean
    public ShoppingCart shoppingCart() {
        return new ShoppingCart();
    }

    // Define a bean for the UserAccount, injecting ProductService, ShoppingCart, and CheckoutService
    @Bean
    public UserAccount userAccount() {
        return new UserAccount("example_user", shoppingCart(), productService(), checkoutService());
    }
}
