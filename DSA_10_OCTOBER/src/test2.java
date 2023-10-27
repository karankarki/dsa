

import java.util.ArrayList;
import java.util.List;

class Product {
    private String productName;
    private double productPrice;
    private int productQuantity;

    // Parameterized constructor
    public Product(String productName, double productPrice, int productQuantity) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.productQuantity = productQuantity;
    }

    // Constructor with name and price (quantity is set to 0)
    public Product(String productName, double productPrice) {
        this(productName, productPrice, 0);
    }

    // Method to calculate total price
    public double getTotalPrice() {
        return productPrice * productQuantity;
    }

    // Getters and setters for product attributes (optional)
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public int getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(int productQuantity) {
        this.productQuantity = productQuantity;
    }
}



class ShoppingCart {
    private List<Product> products;

    public ShoppingCart() {
        products = new ArrayList<>();
    }

    // Method to add a product to the cart
    public void addProduct(Product product) {
        products.add(product);
    }

    // Method to calculate the total cost of all products in the cart
    public double calculateTotal() {
        double total = 0;
        for (Product product : products) {
            total += product.getTotalPrice();
        }
        return total;
    }

    // Method to display the cart's contents (optional)
    public void displayCart() {
        for (Product product : products) {
            System.out.println("Product: " + product.getProductName());
            System.out.println("Price: " + product.getProductPrice());
            System.out.println("Quantity: " + product.getProductQuantity());
            System.out.println("Total Price: " + product.getTotalPrice());
            System.out.println();
        }
    }
}




public class test2 {






    public static void main(String[] args) {

        Product product1 = new Product("Product 1", 10.99, 3);
        Product product2 = new Product("Product 2", 5.49);
        Product product3 = new Product("Product 3", 7.99, 2);

        // Create a shopping cart
        ShoppingCart cart = new ShoppingCart();

        // Add products to the cart
        cart.addProduct(product1);
        cart.addProduct(product2);
        cart.addProduct(product3);

        // Display the contents of the cart
        System.out.println("Cart Contents:");
        cart.displayCart();

        // Calculate and display the total cost
        double totalCost = cart.calculateTotal();
        System.out.println("Total Cost: $" + totalCost);



        System.out.println("abc".compareTo("cba"));

    }
}
