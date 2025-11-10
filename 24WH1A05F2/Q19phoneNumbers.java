package javaExp;

import java.io.*;
import java.util.*;
import java.util.Scanner;

class Q19phoneNumbers {
    public static void main(String[] args) {
        Hashtable phoneBook = new Hashtable();
        try {
            BufferedReader br = new BufferedReader(new FileReader("phoneNumbers.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split("\t");
                if (parts.length == 2) {
                    String name = parts[0];
                    String phone = parts[1];
                    phoneBook.put(name, phone);
                    phoneBook.put(phone, name);
                }
            }
            br.close();
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
            return;
        }
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a name or phone number to search: ");
        String input = sc.nextLine();
        if (phoneBook.containsKey(input)) {
            System.out.println("Corresponding value: " + phoneBook.get(input));
        } else {
            System.out.println("No record found for: " + input);
        }
        sc.close();
    }
}
