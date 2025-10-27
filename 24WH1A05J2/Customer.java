package vaishnavi;
import java.util.HashSet;

public class Customer {
    public void orderProducts(HashSet<Product> sellerProducts, int[] orderedIds) {
        double total = 0;
        System.out.println("\n Ordered Product Details:");

        for (int id : orderedIds) {
            for (Product p : sellerProducts) {
                if (p.getId() == id) {
                    p.display();
                    total += p.getPrice();
                }
            }
        }

        System.out.println("Total Price: ₹" + total);
    }
}
