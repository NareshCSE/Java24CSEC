package vaishnavi;
import java.io.*;
import java.util.HashMap;
import java.util.Scanner;
public class Contactname {
    public static void main(String[] args) {
        String fileName = "contacts.txt";       
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write("Alice\t9876543210\n");
            writer.write("Bob\t9123456789\n");
            writer.write("Charlie\t9988776655\n");
            System.out.println("Contacts written to file.\n");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
            return;
        }        
        HashMap<String, String> nameToPhone = new HashMap<>();
        HashMap<String, String> phoneToName = new HashMap<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split("\t");
                if (parts.length == 2) {
                    String name = parts[0];
                    String phone = parts[1];
                    nameToPhone.put(name, phone);
                    phoneToName.put(phone, name);
                }
            }
            System.out.println("Contacts loaded from file.\n");
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
            return;
        }
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a name or phone number to search: ");
        String input = scanner.nextLine();
        if (nameToPhone.containsKey(input)) {
            System.out.println("Phone number: " + nameToPhone.get(input));
        } else if (phoneToName.containsKey(input)) {
            System.out.println("Name: " + phoneToName.get(input));
        } else {
            System.out.println("No match found.");
        }
        scanner.close();
    }
}