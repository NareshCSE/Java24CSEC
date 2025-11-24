package navya_25wh5a0517;

import java.util.Scanner;
class Item {
int id;
String name;
double price;
Item(int id, String name, double price) {
this.id = id;
this.name = name;
this.price = price;}}
class Order {
int orderId;
Item[] items;
int itemCount;
Order(int orderId) {
this.orderId = orderId;
this.items = new Item[10]; // max 10 items per order
this.itemCount = 0;}
void addItem(Item item) {
if (itemCount < 10) {
items[itemCount++] = item;
}}}


//Interface Restaurant
interface Restaurant {
void printName();
void addItem(Item item); // Add item to menu
Item[] getMenu();
//Return menu
Order placeOrder(int[] itemIds); // Place an order
double generateBill(int orderId); // Calculate total + 6% tax
}
//KFC class implementing Restaurant
class KFC implements Restaurant {
String name = "KFC";
Item[] menu = new Item[10]; // max 10 menu items
int menuCount = 0;
Order[] orders = new Order[10]; // max 10 orders
int orderCount = 0;
int nextOrderId = 1;
@Override
public void printName() {
System.out.println("Welcome to " + name);
}
@Override
public void addItem(Item item) {
if (menuCount < 10) {
menu[menuCount++] = item;
}
}


@Override
public Item[] getMenu() {
Item[] currentMenu = new Item[menuCount];
for (int i = 0; i < menuCount; i++) {
currentMenu[i] = menu[i];}
return currentMenu;}
@Override
public Order placeOrder(int[] itemIds) {
Order order = new Order(nextOrderId++);
for (int id : itemIds) {
//Find item by id in menu
for (int i = 0; i < menuCount; i++) {
if (menu[i].id == id) {
order.addItem(menu[i]);
break;}}}
if (orderCount < 10) {
orders[orderCount++] = order;}
System.out.println("Order placed successfully! Order ID: " + order.orderId);
return order;}
@Override
public double generateBill(int orderId) {
for (int i = 0; i < orderCount; i++) {
if (orders[i].orderId == orderId) {
double total = 0;
for (int j = 0; j < orders[i].itemCount; j++) {
total += orders[i].items[j].price;}
double tax = total * 0.06; // 6% tax
return total + tax;}}


System.out.println("Order not found");
return 0;
}
}
//Main class
public class RestaurantInterface {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
KFC kfc = new KFC();
//Print restaurant name
kfc.printName();
//Add menu items
kfc.addItem(new Item(1, "Burger", 150));
kfc.addItem(new Item(2, "Fries", 80));
kfc.addItem(new Item(3, "Pepsi", 50));
//Show menu
System.out.println("Menu:");
for (Item item : kfc.getMenu()) {
System.out.println(item.id + " " + item.name + "- ₹" + item.price);
}
//Take order input
System.out.println("Enter number of items to order:");
int n = sc.nextInt();
int[] itemIds = new int[n];
System.out.println("Enter item IDs to order:");
for (int i = 0; i < n; i++) {
itemIds[i] = sc.nextInt();
}


//Place order
Order order = kfc.placeOrder(itemIds);
//Generate bill
double totalBill = kfc.generateBill(order.orderId);
System.out.println("Total bill (including 6% tax): ₹" + totalBill);
sc.close(); }}
