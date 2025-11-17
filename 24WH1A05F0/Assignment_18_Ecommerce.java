package shriya_24WH1A05F0;
import java.util.*;
class Product {
   private int id;
   private String name;
   private int price;
   public Product(int id, String name, int price) {
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
   public int getPrice() {
       return price;
   }
   @Override
   public boolean equals(Object obj) {
       if (this == obj)
       	return true;
       if (!(obj instanceof Product))
       	return false;
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
class Seller {
   private HashSet<Product> productSet = new HashSet<>();
   public void addProduct(Product product) {
       productSet.add(product);
   }
   public HashSet<Product> getProducts() {
       return productSet;
   }
}
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
public class Assignment_18_Ecommerce {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       Seller seller = new Seller();
       seller.addProduct(new Product(201, "Smartphone", 25999));
       seller.addProduct(new Product(202, "Laptop", 64999));
       seller.addProduct(new Product(203, " Earbuds", 2999));
       seller.addProduct(new Product(204, "watch", 4999));
       seller.addProduct(new Product(205, "Tablet", 18999));
       seller.addProduct(new Product(206, "Wireless Mouse", 799));
       System.out.println("Available Products:");
       for (Product p : seller.getProducts()) {
           System.out.println(p);
       }
       System.out.print("\nEnter number of products to order: ");
       int count = sc.nextInt();
       int[] orderedProductIds = new int[count];
       for (int i = 0; i < count; i++) {
           System.out.print("Enter Product ID to order: ");
           orderedProductIds[i] = sc.nextInt();
       }
       Customer customer = new Customer();
       customer.orderProducts(seller.getProducts(), orderedProductIds);
       sc.close();
   }
}
