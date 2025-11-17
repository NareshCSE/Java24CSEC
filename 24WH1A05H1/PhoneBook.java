package java_assignment;
import java.io.*;
import java.util.*;

public class PhoneBook {
    public static void main(String[] args) throws IOException {
        HashMap<String, String> nameToPhone = new HashMap<>();
        HashMap<String, String> phoneToName = new HashMap<>();

        String fileName = "contacts.txt";
            File file = new File(fileName);
            if (!file.exists()) {
                file.createNewFile();
            }
            Scanner freader = new Scanner(file);
            while (freader.hasNextLine()) {
                String line = freader.nextLine();
                String[] parts = line.split("\t");
                if (parts.length == 2) {
                    String name = parts[0].trim();
                    String phone = parts[1].trim();
                    nameToPhone.put(name, phone);
                    phoneToName.put(phone, name);
                }
            }
            freader.close();
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a name or phone number to search: ");
            String input =sc.nextLine().trim();
            if (nameToPhone.containsKey(input)) {
                System.out.println("Phone number of " + input + " is: " + nameToPhone.get(input));
            } else if (phoneToName.containsKey(input)) {
                System.out.println("Name corresponding to phone number " + input + " is: " + phoneToName.get(input));
            } else {
                System.out.println("No record found for: " + input);
                System.out.print("Do you want to add this as a new contact? (yes/no): ");
                String choice = sc.nextLine().trim().toLowerCase();
                if (choice.equals("yes")) {
                    System.out.print("Enter name: ");
                    String newName =sc.nextLine().trim();
                    System.out.print("Enter phone number: ");
                    String newPhone =sc.nextLine().trim();
                    nameToPhone.put(newName, newPhone);
                    phoneToName.put(newPhone, newName);
                    FileWriter fwriter = new FileWriter(fileName);
                    fwriter.write(newName + "\t" + newPhone + "\n");
                    fwriter.close();
                    System.out.println("New contact saved successfully!");
                }
            }
            sc.close();
    }
}

