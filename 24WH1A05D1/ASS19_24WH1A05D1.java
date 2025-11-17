package Ass;

import java.io.*;
import java.util.*;

public class ASS19_24WH1A05D1 {
    public static void main(String[] args) {
        
        Hashtable<String, String> nameToPhone = new Hashtable<>();
        Hashtable<String, String> phoneToName = new Hashtable<>();

        Scanner input = new Scanner(System.in);

        try {
            BufferedReader reader = new BufferedReader(new FileReader("phoneData.txt"));
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
            reader.close();
        } 
        catch (IOException e) {
            System.out.println("Error reading file.");
            return;
        }

        // --- User lookup ---
        System.out.print("Enter a name or phone number: ");
        String query = input.nextLine().trim();

        if (nameToPhone.containsKey(query)) {
            System.out.println("Phone Number: " + nameToPhone.get(query));
        } 
        else if (phoneToName.containsKey(query)) {
            System.out.println("Name: " + phoneToName.get(query));
        } 
        else {
            System.out.println("No match found.");
        }

        input.close();
    }
}
