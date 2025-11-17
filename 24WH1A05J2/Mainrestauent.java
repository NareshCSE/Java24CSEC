package vaishnavi;
import java.util.Scanner;
public class Mainrestauent {
    public static void main(String[] args) {
        KFC1 kfc = new KFC1();
        Scanner scanner = new Scanner(System.in);
        kfc.printRestaurantName();        
        kfc.addItem(new Item1(1, "Zinger Burger", 150));
        kfc.addItem(new Item1(2, "Chicken Popcorn", 120));
        kfc.addItem(new Item1(3, "Pepsi", 50));
        kfc.addItem(new Item1(4, "French Fries", 80));        
        System.out.println("\nMenu:");
        for (Item1 item : kfc.getMenu()) {
            System.out.println(item.getId() + ": " + item.getName() + " - ₹" + item.getPrice());
        }       
        System.out.println("\nEnter the item IDs you want to order (comma-separated):");
        String input = scanner.nextLine();
        String[] parts = input.split(",");
        int[] itemIds = new int[parts.length];
        for (int i = 0; i < parts.length; i++) {
            itemIds[i] = Integer.parseInt(parts[i].trim());
        }
        Order1 order = kfc.placeOrder(itemIds);
        System.out.println("Order ID: " + order.getOrderId());
        double bill = kfc.generateBill(order.getOrderId());
        System.out.printf("Total Bill (with 6%% tax): ₹%.2f\n", bill);
        scanner.close();
    }
}
