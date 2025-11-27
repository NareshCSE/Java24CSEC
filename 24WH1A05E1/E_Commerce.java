import java.util.*;

// Product Bean
class Product {
    private int id;
    private String name;
    private double price;

    // Constructor
    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    // Getters
    public int getId() { return id; }
    public String getName() { return name; }
    public double getPrice() { return price; }

    // Override equals & hashCode for HashSet uniqueness
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;
        Product p = (Product) o;
        return id == p.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Product [ID=" + id + ", Name=" + name + ", Price=" + price + "]";
    }
}

// Client Class
public class ECommerceApp {
    public static void main(String[] args) {
        // Seller adds products into HashSet
        HashSet<Product> products = new HashSet<>();
        products.add(new Product(101, "Laptop", 55000));
        products.add(new Product(102, "Smartphone", 25000));
        products.add(new Product(103, "Headphones", 2000));
        products.add(new Product(104, "Keyboard", 1500));

        // Display available products
        System.out.println("Available Products:");
        for (Product p : products) {
            System.out.println(p);
        }

        // Customer orders (simulate with IDs)
        int[] orderedIds = {101, 103};  // Customer orders Laptop + Headphones

        double totalPrice = 0;
        System.out.println("\nCustomer Ordered Products:");
        for (int id : orderedIds) {
            for (Product p : products) {
                if (p.getId() == id) {
                    System.out.println(p);
                    totalPrice += p.getPrice();
                }
            }
        }

        System.out.println("\nTotal Price = " + totalPrice);
    }
}
