package java5J1;

import java.util.*;

public class ECommerceApp {

    
    static class Product {
        int id;
        String name;
        double price;

        Product(int id, String name, double price) {
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
            if (obj == null || getClass() != obj.getClass()) return false;
            Product product = (Product) obj;
            return id == product.id;
        }

        @Override
        public int hashCode() {
            return Objects.hash(id);
        }
    }

    
    static class Seller {
        Set<Product> productSet = new HashSet<>();

        public void addProduct(Product product) {
            productSet.add(product);
        }

        public Set<Product> getProducts() {
            return productSet;
        }
    }

    
    static class Customer {
        public void orderProducts(List<Integer> productIds, Set<Product> availableProducts) {
            double total = 0;
            System.out.println("\nOrdered Product Details:");
            for (int id : productIds) {
                for (Product p : availableProducts) {
                    if (p.getId() == id) {
                        System.out.println("ID: " + p.getId() + ", Name: " + p.getName() + ", Price: " + p.getPrice());
                        total += p.getPrice();
                    }
                }
            }
            System.out.println("Total Price: " + total);
        }
    }

  
    public static void main(String[] args) {
        Seller seller = new Seller();

        seller.addProduct(new Product(1, "Laptop", 55000));
        seller.addProduct(new Product(2, "Smartphone", 25000));
        seller.addProduct(new Product(3, "Headphones", 3000));
        seller.addProduct(new Product(4, "Keyboard", 1500));

        Customer customer = new Customer();

        List<Integer> orderedProductIds = Arrays.asList(1, 3, 4);
        customer.orderProducts(orderedProductIds, seller.getProducts());
    }
}
