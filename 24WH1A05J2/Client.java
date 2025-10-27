package vaishnavi;
public class Client {
    public static void main(String[] args) {
        
        Seller seller = new Seller();
        seller.addProduct(new Product(101, "Laptop", 55000));
        seller.addProduct(new Product(102, "Smartphone", 25000));
        seller.addProduct(new Product(103, "Headphones", 1500));

        
        Customer customer = new Customer();
        int[] orderedIds = {101, 103};
        customer.orderProducts(seller.getProducts(), orderedIds);
    }
}
