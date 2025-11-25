import java.io.*;
import java.util.HashMap;
import java.util.Scanner;

public class TelephoneContacts {

    public static void main(String[] args) {

        HashMap<String, String> nameToPhone = new HashMap<>();
        HashMap<String, String> phoneToName = new HashMap<>();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the file name (e.g., data.txt): ");
        String fileName = scanner.nextLine();

        // Load File
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;

            while ((line = br.readLine()) != null) {

                // Skip blank/empty lines
                if (line.trim().isEmpty()) continue;

                // Split on ANY whitespace (tab or spaces)
                String[] parts = line.trim().split("\\s+");

                // only accept valid lines
                if (parts.length != 2) {
                    System.out.println("Skipping invalid line: " + line);
                    continue;
                }

                String name = parts[0].trim();
                String phone = parts[1].trim();

                nameToPhone.put(name, phone);
                phoneToName.put(phone, name);
            }

            System.out.println("Data loaded successfully.\n");

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
            return;
        }

        // Lookup loop
        while (true) {
            System.out.print("Enter a name or phone number (or type 'exit'): ");
            String input = scanner.nextLine().trim();

            if (input.equalsIgnoreCase("exit"))
                break;

            if (nameToPhone.containsKey(input)) {
                System.out.println("Phone number: " + nameToPhone.get(input));
            } else if (phoneToName.containsKey(input)) {
                System.out.println("Name: " + phoneToName.get(input));
            } else {
                System.out.println("No match found.");
            }
        }

        scanner.close();
    }
}
