import java.util.HashSet;
import java.util.Scanner;

// Product Bean Class
class Product {
    private int id;
    private String name;
    private double price;

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public double getPrice() { return price; }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Product)) return false;
        Product p = (Product) obj;
        return this.id == p.id;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(id);
    }

    @Override
    public String toString() {
        return "Product ID: " + id + ", Name: " + name + ", Price: ₹" + price;
    }
}

// Seller Class
class Seller {
    private HashSet<Product> productSet = new HashSet<>();

    public void addProduct(Product product) {
        productSet.add(product);
    }

    public HashSet<Product> getProducts() {
        return productSet;
    }
}

// Customer Class
class Customer {
    public void orderProducts(HashSet<Product> availableProducts, int[] orderedIds) {
        double totalPrice = 0;
        System.out.println("\nOrdered Products:");

        for (int id : orderedIds) {
            boolean found = false;
            for (Product p : availableProducts) {
                if (p.getId() == id) {
                    System.out.println(p);
                    totalPrice += p.getPrice();
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println("Product ID " + id + " not found.");
            }
        }

        System.out.println("Total Price: ₹" + totalPrice);
    }
}

// Main Client Class
public class E_Commerce_Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Seller seller = new Seller();

        // Adding products
        seller.addProduct(new Product(101, "Laptop", 55000));
        seller.addProduct(new Product(102, "Smartphone", 25000));
        seller.addProduct(new Product(103, "Headphones", 1500));
        seller.addProduct(new Product(104, "Smartwatch", 5000));

        System.out.println("Available Products:");
        for (Product p : seller.getProducts()) {
            System.out.println(p);
        }

        // Customer orders
        System.out.print("\nEnter number of products to order: ");
        int count = scanner.nextInt();
        int[] orderedProductIds = new int[count];

        for (int i = 0; i < count; i++) {
            System.out.print("Enter Product ID to order: ");
            orderedProductIds[i] = scanner.nextInt();
        }

        Customer customer = new Customer();
        customer.orderProducts(seller.getProducts(), orderedProductIds);

        scanner.close();
    }
}