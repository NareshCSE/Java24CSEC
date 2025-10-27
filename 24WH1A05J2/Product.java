package vaishnavi;
public class Product {
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
    public double getPrice() { return price;} 
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Product)) return false;
        Product p = (Product) obj;
        return this.id == p.id;
    }
    @Override
    public int hashCode() {
        return id;
    }
    public void display() {
        System.out.println("Product ID: " + id + ", Name: " + name + ", Price: ₹" + price);
    }
}

