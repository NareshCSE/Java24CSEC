package labexperiments;

import java.util.*;

class Item {
 private int id;
 private String name;
 private double price;
 public Item(int id, String name, double price) {
     this.id = id;
     this.name = name;
     this.price = price;
 }
 public int getId() { return id; }
 public String getName() { return name; }
 public double getPrice() { return price; }

 @Override
 public String toString() {
     return name + " ($" + price + ")";
 }
}


class Order {
 private int orderId;
 private List<Item> items;
 public Order(int orderId, List<Item> items) {
     this.orderId = orderId;
     this.items = items;
 }
 public int getOrderId() { return orderId; }
 public List<Item> getItems() { return items; }
}

interface Restaurant {
 void printName(); 
 void addItem(Item item); 
 Item[] getMenu(); 
 Order placeOrder(List<Integer> itemIds); 
 double generateBill(int orderId);
}


class KFC implements Restaurant {
 private String name = "KFC";
 private List<Item> menu = new ArrayList<>();
 private Map<Integer, Order> orders = new HashMap<>();
 private int orderCounter = 1;

 @Override
 public void printName() {
     System.out.println("Restaurant Name: " + name);
 }

 @Override
 public void addItem(Item item) {
     menu.add(item);
 }

 @Override
 public Item[] getMenu() {
     return menu.toArray(new Item[0]);
 }

 @Override
 public Order placeOrder(List<Integer> itemIds) {
     List<Item> orderItems = new ArrayList<>();
     for (int id : itemIds) {
         for (Item item : menu) {
             if (item.getId() == id) {
                 orderItems.add(item);
             }
         }
     }
     Order order = new Order(orderCounter, orderItems);
     orders.put(orderCounter, order);
     orderCounter++;
     return order;
 }

 @Override
 public double generateBill(int orderId) {
     Order order = orders.get(orderId);
     if (order == null) {
         System.out.println("Invalid Order ID");
         return 0;
     }
     double total = 0;
     for (Item item : order.getItems()) {
         total += item.getPrice();
     }
     total += total * 0.06; 
     return total;
 }
}


public class RestaurantInterface {
 public static void main(String[] args) {
     KFC kfc = new KFC();
     kfc.printName();


     kfc.addItem(new Item(1, "Burger", 150));
     kfc.addItem(new Item(2, "Fries", 100));
     kfc.addItem(new Item(3, "Coke", 50));


     System.out.println("Menu:");
     for (Item item : kfc.getMenu()) {
         System.out.println(item);
     }

     List<Integer> orderItems = Arrays.asList(1,2,3); 
     Order order = kfc.placeOrder(orderItems);
     System.out.println("\nOrder ID: " + order.getOrderId());
     System.out.println("Ordered Items: " + order.getItems());

     double bill = kfc.generateBill(order.getOrderId());
     System.out.println("Total Bill (including 6% tax): $" + bill);
 }
}
 
