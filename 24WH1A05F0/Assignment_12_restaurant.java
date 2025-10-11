package lab_assignments;

interface Restaurant {
    void printName();
    void addItem(Item i);
    Item[] getMenu();
    void placeOrder(Order o);
    double generateBill(int orderId);
}
class Item {
    int id; 
    String name; 
    double price;
    Item(int id, String name, double price){ 
        this.id = id; 
        this.name = name; 
        this.price = price; 
    }
}
class Order {
    int orderId; 
    Item[] items;
    Order(int orderId, Item[] items){ 
        this.orderId = orderId; 
        this.items = items; 
    }
}

class KFC implements Restaurant {
    Item[] menu = new Item[5]; 
    int count = 0; 
    Order order;
  public void printName(){ 
        System.out.println("KFC"); 
    }
    public void addItem(Item i){ 
        menu[count++] = i; 
    }
    public Item[] getMenu(){ 
        return menu; 
    }
    public void placeOrder(Order o){ 
        order = o; 
    }
    public double generateBill(int id){
        double sum = 0; 
        for(Item i : order.items) 
            sum += i.price;
        return sum + sum * 0.06;
    }
}

public class Assignment_12_restaurant {
    public static void main(String[] args){
        KFC k = new KFC();
        k.printName();
        k.addItem(new Item(1, "Burger", 100));
        k.addItem(new Item(2, "Fries", 50));
        Item[] it = { new Item(1, "Burger", 100) };
        k.placeOrder(new Order(101, it));
        System.out.println("Bill: " + k.generateBill(101));

    }

}

