package vaishnavi;
import java.util.HashSet;

public class Seller {
    private HashSet<Product> products = new HashSet<>();

    public void addProduct(Product p) {
        products.add(p);
    }

    public HashSet<Product> getProducts() {
        return products;
    }
}
