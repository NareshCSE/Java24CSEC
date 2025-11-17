package com.studyopedia;

import java.io.*;
import java.util.*;

public class PhoneFiles {

    public static void main(String[] args) {
        // Hash tables for fast lookup
        Hashtable<String, String> nameToPhone = new Hashtable<>();
        Hashtable<String, String> phoneToName = new Hashtable<>();
        
        // Read data from file
        try (BufferedReader br = new BufferedReader(new FileReader("contacts.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                // Each line is expected to be "name\tphone"
                String[] parts = line.split("\t");
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

        // Take input from user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a name or phone number to look up:");
        String input = sc.nextLine();

        // Lookup
        if (nameToPhone.containsKey(input)) {
            System.out.println("Phone number for " + input + " is: " + nameToPhone.get(input));
        } else if (phoneToName.containsKey(input)) {
            System.out.println("Name for phone number " + input + " is: " + phoneToName.get(input));
        } else {
            System.out.println("No record found for: " + input);
        }

        sc.close();
    }
}
