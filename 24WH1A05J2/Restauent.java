package vaishnavi;
public interface Restauent {
    void printRestaurantName();
    void addItem(Item1 item);
    Item1[] getMenu();
    Order1 placeOrder(int[] itemIds);
    double generateBill(int orderId);
}
