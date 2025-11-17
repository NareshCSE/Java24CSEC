package sathvika_25wh5a0518;
import java.util.*;
class Product {
private int id;
private String name;
private double price;

public Product(int id, String name, double price) {
   this.id = id;
   this.name = name;
   this.price = price;
}
public int getId() {
   return id;
}
public String getName() {
   return name;
}
public double getPrice() {
   return price;
}
@Override
public boolean equals(Object obj) {
   if (this == obj) return true;
   if (obj == null || getClass() != obj.getClass()) return false;
   Product product = (Product) obj;
   return id == product.id;
}
@Override
public int hashCode() {
    return Objects.hash(id);
}
@Override
public String toString() {
    return "ID: " + id + ", Name: " + name + ", Price: ₹" + price;
}
}
class Seller {
private HashSet<Product> products = new HashSet<>();

public void addProduct(Product p) {
    products.add(p);
}
public HashSet<Product> getProducts() {
    return products;
}
}
class Customer {
private List<Product> orderedProducts = new ArrayList<>();
public void orderProduct(int productId, HashSet<Product> availableProducts) {
    for (Product p : availableProducts) {
        if (p.getId() == productId) {
            orderedProducts.add(p);
            System.out.println("Added to cart: " + p.getName());
            return;
        }
    }
    System.out.println("❌ Product with ID " + productId + " not found.");
}
public void showOrderSummary() {
    double total = 0;
    System.out.println("\n🛒 Order Summary:");
    for (Product p : orderedProducts) {
        System.out.println(p);
        total += p.getPrice();
    }
    System.out.println("Total Price: ₹" + total);
}
}
public class EcommerceApp {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Seller seller = new Seller();
    System.out.println("=== Seller: Add Products ===");
    System.out.print("Enter number of products to add: ");
    int n = sc.nextInt();
    sc.nextLine();
    for (int i = 0; i < n; i++) {
        System.out.println("\nEnter Product " + (i + 1) + " details:");
        System.out.print("ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Price: ");
        double price = sc.nextDouble();
        sc.nextLine();
        seller.addProduct(new Product(id, name, price));
    }
    System.out.println("\n✅ Products Added by Seller:");
    for (Product p : seller.getProducts()) {
        System.out.println(p);
    }
    Customer customer = new Customer();
    System.out.println("\n=== Customer: Order Products ===");
    char ch;
    do {
        System.out.print("Enter Product ID to order: ");
        int pid = sc.nextInt();
        customer.orderProduct(pid, seller.getProducts());
        System.out.print("Order another product? (y/n): ");
        ch = sc.next().charAt(0);
    } while (ch == 'y' || ch == 'Y');

    customer.showOrderSummary();
    sc.close();
}
}
	


