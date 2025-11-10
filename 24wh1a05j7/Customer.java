package ecommerce;
public class Customer {

    public void orderProducts(int[] ids, Seller seller) {

        double total = 0;
        boolean foundAny = false;

        // Loop through each product ID ordered
        for (int id : ids) {

            boolean found = false;

            for (Product p : seller.getProduct()) {
                if (p.id == id) {
                    found = true;
                    foundAny = true;

                    System.out.println("Product Ordered:");
                    System.out.println("ID: " + p.id);
                    System.out.println("Name: " + p.name);
                    System.out.println("Price: " + p.price);

                    total += p.price;  // ✅ adds price of each item
                }
            }

            if (!found) {
                System.out.println("Product with ID " + id + " not found!");
            }
        }

        if (foundAny) {
            System.out.println("\nTOTAL BILL: " + total);
        }
    }
}

