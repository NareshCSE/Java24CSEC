package vaishnavi;

public class Order1 {
    private int orderId;
    private Item1[] items;

    public Order1(int orderId, Item1[] items) {
        this.orderId = orderId;
        this.items = items;
    }

    public int getOrderId() { return orderId; }
    public Item1[] getItems() { return items; }
}
