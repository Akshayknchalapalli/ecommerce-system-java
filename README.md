# E-Commerce System

This is a simple e-commerce system implemented in Java using the Spring Framework. It includes basic functionalities for managing products, shopping cart, and a simple checkout process. This README provides an overview of the project's structure, how to run it, and important details.

## Table of Contents

- [Features](#features)
- [Prerequisites](#prerequisites)
- [Project Structure](#project-structure)
- [Getting Started](#getting-started)
- [Usage](#usage)
- [Contributing](#contributing)
- [License](#license)

## Features

- Product management (adding, removing, fetching product details)
- Shopping cart functionality (add to cart, remove from cart)
- Checkout process (calculate total price, simulate payment processing)
- Spring-based dependency injection and configuration
- In-memory product repository for demonstration purposes
- Command-line interaction for demonstration

## Prerequisites

Before you begin, ensure you have met the following requirements:

- Java Development Kit (JDK) installed (JDK 8 or higher)
- Maven installed
- Git (optional, for cloning the repository)

## Project Structure

The project structure is organized as follows:

- `src/main/java/com/akshay/ecommerce/ecommerce_system`: Java source code
  - `App.java`: Entry point for the e-commerce system, leveraging Spring Framework's dependency injection and configuration to manage user accounts, shopping carts, and the checkout process.
  - `AppConfig.java`: configuration file for the Spring application, defining beans for key components such as product management, shopping cart, and checkout services, as well as injecting dependencies between them.
  - `UserAccount.java`: User account class, managing the shopping cart and checkout process
  - `ShoppingCart.java`: Shopping cart class
  - `CartItem.java`: Cart item class
  - `Product.java`: Product class
  - `ProductService.java`: Interface for managing products
  - `ProductRepository.java`: Interface for product data access
  - `InMemoryProductRepository.java`: In-memory implementation of the product repository
  - `ProductServiceImpl.java`: Implementation of the product service
  - `CheckoutService.java`: Service for calculating total prices and simulating payment processing
- `pom.xml`: Maven project configuration file
- `.project/`: Virtual environment directory

## Getting Started

To get a local copy up and running, follow these steps:

1. Clone the repository (if you haven't already):

         git clone https://github.com/Akshayknchalapalli/ecommerce-system-java.git
2. Create a virtual environment (recommended) to isolate project dependencies:

        python -m venv .project  # On Windows
        
        python3 -m venv .project  # On macOS and Linux
        
- Activate the virtual environment:

        .project\Scripts\activate # On Windows
        
        source .project/bin/activate # On macOS and Linux
   
3. Navigate to the project directory:

        cd ecommerce-system
   
4. Build the project using Maven:

        mvn clean install      
## Usage
1. Once the project is built successfully, you can run it using the following command:

        java -jar target/ecommerce-system-1.0-SNAPSHOT.jar
      

2. The application will simulate an e-commerce system, allowing you to manage products, add them to the shopping cart, remove them, calculate total prices, and simulate a checkout process.

3. Follow the on-screen prompts to interact with the application.

## Contributing
Contributions are welcome! If you'd like to contribute to this project, please follow these guidelines:

1. Fork the project and create a new branch.
2. Implement your changes or new features.
3. Test your changes thoroughly.
4. Create a pull request with a clear description of your changes.

## License
This project is licensed under the MIT License. See the LICENSE file for details.




