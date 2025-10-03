
class Item {
    String name;
    double price;
    Item(String name, double price) {
        this.name = name;
        this.price = price;
    }
}
class Order {
    int orderId;
    Item[] items;
    Order(int orderId, Item[] items) {
        this.orderId = orderId;
        this.items = items;
    }
}

interface Restaurant {
    void printRestaurantName();
    void addItem(Item item);
    Item[] getMenu();
    Order placeOrder(int[] itemIndexes);
    double generateBill(int orderId);
}

class KFC implements Restaurant {
    private String name = "KFC";
    private Item[] menu = new Item[10];
    private int count = 0;
    private Order[] orders = new Order[10];
    private int orderCount = 0;

    public void printRestaurantName() {
        System.out.println("Welcome to " + name);
    }

    public void addItem(Item item) {
        if(count < menu.length) {
            menu[count++] = item;
        }
    }

    public Item[] getMenu() {
        return menu;
    }

    public Order placeOrder(int[] itemIndexes) {
        Item[] orderItems = new Item[itemIndexes.length];
        for (int i = 0; i < itemIndexes.length; i++) {
            orderItems[i] = menu[itemIndexes[i]];
        }
        Order order = new Order(orderCount, orderItems);
        orders[orderCount] = order;
        orderCount++;
        return order;
    }

    public double generateBill(int orderId) {
        double total = 0;
        for(Item item : orders[orderId].items) {
            total += item.price;
        }
        return total * 1.06;
    }
}

public class InterfaceRestaurant {
    public static void main(String[] args) {
        KFC kfc = new KFC();
        kfc.printRestaurantName();
        kfc.addItem(new Item("Burger", 100));
        kfc.addItem(new Item("Fries", 50));
        kfc.addItem(new Item("Pepsi", 30));
        Order order = kfc.placeOrder(new int[]{0,1});
        double bill = kfc.generateBill(order.orderId);
        System.out.println("Bill with tax: " + bill);
    }
}
