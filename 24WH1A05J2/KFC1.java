package vaishnavi;
import java.util.ArrayList;
import java.util.HashMap;

public class KFC1 implements Restauent {
    private ArrayList<Item1> menu = new ArrayList<>();
    private HashMap<Integer, Order1> orders = new HashMap<>();
    private int orderCounter = 1;

    @Override
    public void printRestaurantName() {
        System.out.println("Welcome to KFC!");
    }

    @Override
    public void addItem(Item1 item) {
        menu.add(item);
    }

    @Override
    public Item1[] getMenu() {
        return menu.toArray(new Item1[0]);
    }

    @Override
    public Order1 placeOrder(int[] itemIds) {
        ArrayList<Item1> orderedItems = new ArrayList<>();
        for (int id : itemIds) {
            for (Item1 item : menu) {
                if (item.getId() == id) {
                    orderedItems.add(item);
                    break;
                }
            }
        }
        Order1 order = new Order1(orderCounter, orderedItems.toArray(new Item1[0]));
        orders.put(orderCounter, order);
        return orders.get(orderCounter++);
    }

    @Override
    public double generateBill(int orderId) {
        Order1 order = orders.get(orderId);
        if (order == null) return 0;

        double total = 0;
        for (Item1 item : order.getItems()) {
            total += item.getPrice();
        }
        return total * 1.06; // 6% tax
    }
}

