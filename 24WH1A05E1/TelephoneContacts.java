import java.util.*;
import java.io.*;

public class TelephoneContacts {
    public static void main(String[] args) {
        HashMap<String, String> contacts = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Do you want to save contacts to a file? (yes/no)");
        String saveToFile = scanner.nextLine().trim().toLowerCase();

        FileWriter writer = null;
        if (saveToFile.equals("yes")) {
            try {
                String filename ="contacts.txt";
                writer = new FileWriter(filename);
            } catch (IOException e) {
                System.out.println("Error creating file: " + e.getMessage());
                scanner.close();
                return;
            }
        }

        System.out.println("How many contacts do you want to add?");
        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("Enter name for contact " + (i + 1) + ":");
            String name = scanner.nextLine();
            System.out.println("Enter phone number for contact " + (i + 1) + ":");
            String phone = scanner.nextLine();
            contacts.put(name, phone);

            if (writer != null) {
                try {
                    writer.write(name + ": " + phone + "\n");
                } catch (IOException e) {
                    System.out.println("Error writing to file: " + e.getMessage());
                }
            }
        }

        if (writer != null) {
            try {
                writer.close();
                System.out.println("Contacts saved to file successfully.");
            } catch (IOException e) {
                System.out.println("Error closing file: " + e.getMessage());
            }
        }

        System.out.println("Enter a name or phone number to search:");
        String input = scanner.nextLine();
        boolean found = false;

        if (contacts.containsKey(input)) {
            System.out.println("Phone number: " + contacts.get(input));
            found = true;
        } else if (contacts.containsValue(input)) {
            for (Map.Entry<String, String> entry : contacts.entrySet()) {
                if (entry.getValue().equals(input)) {
                    System.out.println("Name: " + entry.getKey());
                    found = true;
                    break;
                }
            }
        }

        if (!found) {
            System.out.println("No matching record found.");
        }

        scanner.close();
    }
}