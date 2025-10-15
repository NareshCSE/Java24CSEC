package java_lab_exp;
class Item {
    String name;
    double price;

    Item(String name, double price) {
        this.name = name;
        this.price = price;
    }
}
interface Restaurant {
    void printName();                       // print restaurant name
    double generateBill(Item item);         // generate bill for 1 item with 6% tax
}
class KFC implements Restaurant {
    String name = "KFC";

    public void printName() {
        System.out.println("Restaurant: " + name);
    }

    public double generateBill(Item item) {
        double total = item.price + item.price * 0.06; // add 6% tax
        return total;
    }
}

public class Q12RestaurantInterface {
    public static void main(String[] args) {
        KFC kfc = new KFC();
        kfc.printName();
        Item burger = new Item("Burger", 150);

       double bill = kfc.generateBill(burger);

        System.out.println("Item: " + burger.name);
        System.out.println("Price with 6% tax: Rs." + bill);
    }
}