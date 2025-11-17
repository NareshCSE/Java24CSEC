
import java.io.*;
import java.util.*;

public class phoneno {
    public static void main(String[] args) {
        // Hash tables for both directions
        Hashtable<String, String> nameToPhone = new Hashtable<>();
        Hashtable<String, String> phoneToName = new Hashtable<>();

        // File input
        String fileName = "phonebook.txt"; // Replace with your file name/path
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split("\\t");
                if (parts.length == 2) {
                    String name = parts[0];
                    String phone = parts[1];
                    nameToPhone.put(name, phone);
                    phoneToName.put(phone, name);
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
            return;
        }

        // User query
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name or phone number to search:");
        String input = sc.nextLine();

        // Search by name
        if (nameToPhone.containsKey(input)) {
            System.out.println("Phone number: " + nameToPhone.get(input));
        }
        // Search by phone number
        else if (phoneToName.containsKey(input)) {
            System.out.println("Name: " + phoneToName.get(input));
        }
        else {
            System.out.println("Entry not found.");
        }
    }
}
