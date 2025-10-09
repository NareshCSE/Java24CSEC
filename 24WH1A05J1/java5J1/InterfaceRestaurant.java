interface Restaurant {
    void printName();
    void addItem(String item);
    String[] getMenu();
    void placeOrder(int orderId);
    double generateBill(int orderId);
}

class KFC implements Restaurant {
    String name = "KFC";
    String[] menu = new String[10];
    int menuCount = 0;
    public void printName() { System.out.println("Restaurant: " + name); }
    public void addItem(String item) { menu[menuCount++] = item; }
    public String[] getMenu() { return menu; }
    public void placeOrder(int orderId) { System.out.println("Order " + orderId + " placed"); }
    public double generateBill(int orderId) { 
        double total = menuCount * 100; 
        total += total * 0.06; 
        return total; 
    }
}

public class RestaurantDemo {
    public static void main(String[] args) {
        KFC kfc = new KFC();
        kfc.printName();
        kfc.addItem("Burger");
        kfc.addItem("Fries");
        kfc.placeOrder(101);
        System.out.println("Total Bill: " + kfc.generateBill(101));
    }
}
