package java_class;

import java.io.*;
import java.util.*;

public class PhoneBook {
    private HashMap<String, String> nameToPhone = new HashMap<>();
    private HashMap<String, String> phoneToName = new HashMap<>();

    public void loadData(String filename) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split("\t");
                if (parts.length == 2) {
                    String name = parts[0].trim();
                    String phone = parts[1].trim();
                    nameToPhone.put(name, phone);
                    phoneToName.put(phone, name);
                }
            }
            System.out.println("Data loaded successfully.");
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }

    public void search(String input) {
        if (nameToPhone.containsKey(input)) {
            System.out.println("Phone number for " + input + ": " + nameToPhone.get(input));
        } else if (phoneToName.containsKey(input)) {
            System.out.println("Name for phone number " + input + ": " + phoneToName.get(input));
        } else {
            System.out.println("No match found for: " + input);
        }
    }

    public static void main(String[] args) {
        PhoneBook pb = new PhoneBook();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter path to data file: ");
        String filePath = scanner.nextLine();
        pb.loadData(filePath);

        while (true) {
            System.out.print("\nEnter name or phone number to search (or type 'exit' to quit): ");
            String query = scanner.nextLine().trim();
            if (query.equalsIgnoreCase("exit")) break;
            pb.search(query);
        }

        scanner.close();
    }
}