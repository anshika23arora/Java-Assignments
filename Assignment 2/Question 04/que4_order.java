package assignment2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Product {
    private String productName;
    private double price;
    private int quantity;

    // Default constructor
    public Product() {
        this.productName = "";
        this.price = 0;
        this.quantity = 0;
    }

    // Parameterized constructor
    public Product(String productName, double price, int quantity) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    // Getters
    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    // Setters
    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // Total price of product
    public double getTotal() {
        return price * quantity;
    }

    @Override
    public String toString() {
        return productName + " x" + quantity + " = " + getTotal();
    }
}


class Order {
    private String orderId;
    private List<Product> products;

    // Default constructor
    public Order() {
        this.orderId = "";
        this.products = new ArrayList<>();
    }

    // Parameterized constructor
    public Order(String orderId) {
        this.orderId = orderId;
        this.products = new ArrayList<>();
    }

    // Getters
    public String getOrderId() {
        return orderId;
    }

    public List<Product> getProducts() {
        return products;
    }

    // Setters
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    // Add product to order
    public void addProduct(Product product) {
        products.add(product);
    }

    // Calculate total order amount
    public double calculateTotal() {
        double total = 0;

        for (Product product : products) {
            total += product.getTotal();
        }

        return total;
    }

    @Override
    public String toString() {
        String result = "Order ID: " + orderId + "\n";
        result += "Products:\n";

        for (Product product : products) {
            result += product.getProductName()
                    + " x" + product.getQuantity()
                    + " = " + product.getTotal() + "\n";
        }

        result += "Total: " + calculateTotal();

        return result;
    }
}


public class que4_order {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Order ID:");
        String orderId = sc.nextLine();

        System.out.println("Enter number of products:");
        int n = Integer.parseInt(sc.nextLine());

        Order order = new Order(orderId);

        for (int i = 0; i < n; i++) {

            System.out.println("Enter product details (productName,price,quantity):");

            String[] data = sc.nextLine().split(",");

            String productName = data[0].trim();
            double price = Double.parseDouble(data[1].trim());
            int quantity = Integer.parseInt(data[2].trim());

            Product product = new Product(productName, price, quantity);

            order.addProduct(product);
        }

        System.out.println();
        System.out.println(order);

        sc.close();
    }
}