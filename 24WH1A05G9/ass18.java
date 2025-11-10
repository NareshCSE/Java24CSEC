package Java_lab;
import java.util.Objects;
import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;

	public class ass18 {
	    // The shared inventory storage
	    private static Set<Product> inventory = new HashSet<>();

	    public static void main(String[] args) {
	        // --- Seller Actions: Add Products ---
	        System.out.println("--- Seller: Adding Products to Inventory ---");
	        addProduct(new Product(101, "Laptop", 999.99));
	        addProduct(new Product(102, "Mouse", 19.99));
	        addProduct(new Product(103, "Keyboard", 45.50));
	        addProduct(new Product(102, "Mouse Pad", 5.00)); // This won't be added (duplicate ID 102)

	        // --- Customer Actions: Place and Process Order ---
	        System.out.println("\n--- Customer: Placing Order ---");
	        // Customer's order: Map<ProductID, Quantity>
	        Map<Integer, Integer> customerOrder = new HashMap<>();
	        customerOrder.put(101, 1); // 1 Laptop
	        customerOrder.put(103, 2); // 2 Keyboards
	        customerOrder.put(999, 1); // Invalid Product ID to test comparison
	        
	        processCustomerOrder(customerOrder);
	    }

	    // Helper method for Seller to add products
	    public static void addProduct(Product p) {
	        if (inventory.add(p)) {
	            System.out.println("Added: " + p.getName());
	        } else {
	            System.out.println("Error: Product with ID " + p.getId() + " already exists.");
	        }
	    }

	    public static Set<Product> getInventory() {
			return inventory;
		}

		public static void setInventory(Set<Product> inventory) {
			ass18.inventory = inventory;
		}

		// Helper method for Customer to process order
	    public static void processCustomerOrder(Map<Integer, Integer> order) {
	        double totalCost = 0.0;
	        boolean orderValid = true;
	        
	        System.out.println("--- Order Details ---");

	        // Iterate over the customer's ordered items
	        for (Map.Entry<Integer, Integer> entry : order.entrySet()) {
	            int orderedId = entry.getKey();
	            int quantity = entry.getValue();
	            Product foundProduct = null;

	            // Compare ordered ID with data stored in the HashSet (inventory)
	            for (Product p : inventory) {
	                if (p.getId() == orderedId) {
	                    foundProduct = p;
	                    break; // Found the product in inventory
	                }
	            }

	            if (foundProduct != null) {
	                double itemPrice = foundProduct.getPrice() * quantity;
	                totalCost += itemPrice;
	                System.out.printf("Item: %s, Quantity: %d, Subtotal: $%.2f\n", foundProduct.getName(), quantity, itemPrice);
	            } else {
	                System.out.println("Error: Product ID " + orderedId + " not found in inventory.");
	                orderValid = false;
	            }
	        }

	        if (orderValid) {
	            System.out.printf("--- Total Price: $%.2f ---\n", totalCost);
	        } else {
	            System.out.println("Order failed due to invalid products.");
	        }
	    }
	}

