import java.util.ArrayList;
import java.util.HashMap;

// ---------------- Restaurant Interface ----------------
interface Restaurant {

    void printRestaurantName();

    void addItem(Item item);

    Item[] getMenu();

    Order placeOrder(int[] itemIds);

    double generateBill(int orderId);
}

// ---------------- Item Class ----------------
class Item {
    private int itemId;
    private String name;
    private double price;

    public Item(int itemId, String name, double price) {
        this.itemId = itemId;
        this.name = name;
        this.price = price;
    }

    public int getItemId() { return itemId; }
    public String getName() { return name; }
    public double getPrice() { return price; }

    @Override
    public String toString() {
        return name + " (Rs. " + price + ")";
    }
}

// ---------------- Order Class ----------------
class Order {
    private int orderId;
    private Item[] items;

    public Order(int orderId, Item[] items) {
        this.orderId = orderId;
        this.items = items;
    }

    public int getOrderId() { return orderId; }
    public Item[] getItems() { return items; }
}

// ---------------- KFC Class Implementing Restaurant ----------------
class KFC implements Restaurant {

    private ArrayList<Item> menu = new ArrayList<>();
    private HashMap<Integer, Order> orders = new HashMap<>();
    private int orderCounter = 1;

    @Override
    public void printRestaurantName() {
        System.out.println("Welcome to KFC Restaurant!");
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
    public Order placeOrder(int[] itemIds) {
        ArrayList<Item> orderedItems = new ArrayList<>();

        for (int id : itemIds) {
            for (Item item : menu) {
                if (item.getItemId() == id) {
                    orderedItems.add(item);
                }
            }
        }

        Order order = new Order(orderCounter, orderedItems.toArray(new Item[0]));
        orders.put(orderCounter, order);

        System.out.println("Order placed! Order ID: " + orderCounter);

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

        double tax = total * 0.06;
        return total + tax;
    }
}

// ---------------- Main Class ----------------
public class InterfaceRestaurant {

    public static void main(String[] args) {

        KFC kfc = new KFC();
        kfc.printRestaurantName();

        // Add menu items
        kfc.addItem(new Item(1, "Zinger Burger", 150.0));
        kfc.addItem(new Item(2, "Chicken Popcorn", 120.0));
        kfc.addItem(new Item(3, "French Fries", 80.0));

        // Show menu
        System.out.println("\n--- MENU ---");
        for (Item item : kfc.getMenu()) {
            System.out.println(item.getItemId() + ". " + item.getName() + " - Rs. " + item.getPrice());
        }

        // Place order (Example: items 1 & 3)
        System.out.println("\nPlacing order for items for 1,3...");
        Order order = kfc.placeOrder(new int[]{1,3});

        // Generate Bill
        double totalBill = kfc.generateBill(order.getOrderId());
        System.out.println("Total Bill (with 6% tax): Rs. " + totalBill);
    }
}
