package problemsolving;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
		class Productbean {
		    int id;
		    String name;
		    double price;

		    Productbean(int id, String name, double price) {
		        this.id = id;
		        this.name = name;
		        this.price = price;
		    }
		}

		public class ecommerceApp {
		    public static void main(String[] args) {
		        Set<Productbean> inventory = new HashSet<>();
		        inventory.add(new Productbean(1, "Book", 599.0));
		        inventory.add(new Productbean(2, "Pencil", 39.0));
		        inventory.add(new Productbean(3, "classmate Notebook", 99.0));

		        System.out.println("Available Products:");
		        for (Productbean p : inventory) {
		            System.out.println("ID=" + p.id + ", Name=" + p.name + ", Price=" + p.price);
		        }
		        Scanner sc = new Scanner(System.in);
		        System.out.print("\nEnter product IDs to order (comma separated): ");
		        String input = sc.nextLine();
		        String[] parts = input.split(",");

		        double total = 0.0;
		        System.out.println("\nOrdered items:");
		        for (String part : parts) {
		            int id;
		            try {
		                id = Integer.parseInt(part.trim());
		            } catch (NumberFormatException e) {
		                System.out.println("Invalid ID: " + part);
		                continue;
		            }
		            boolean found = false;
		            for (Productbean p : inventory) {
		                if (p.id == id) {
		                    System.out.println("ID=" + p.id + ", Name=" + p.name + ", Price=" + p.price);
		                    total += p.price;
		                    found = true;
		                    break;
		                }
		            }
		            if (!found) {
		                System.out.println("Product with ID " + id + " not found.");
		            }
		        }

		        System.out.println("\nTotal Price = ₹" + total);
		        sc.close();
		    }
		

	}


