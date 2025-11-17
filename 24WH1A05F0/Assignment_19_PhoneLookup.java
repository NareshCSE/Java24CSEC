package shriya_24WH1A05F0;

import java.io.FileWriter;

import java.io.IOException;

import java.util.Hashtable;

import java.util.Map;

import java.util.Scanner;

public class Assignment_19_PhoneLookup {

   public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);

       Map<String, String> table = new Hashtable<>();

       try (FileWriter fw = new FileWriter("myfile.txt")) {

           String[] entries = {

               "Shrena \t 9884836996",

               "Shriya \t 8375769396",

               "Krishna Lahari"
               + " \t 9875805883",

               "Mark  \t 9285764949",

               "Bob   \t 8749867948"

           };

           for (String entry : entries) {

               fw.write(entry + "\n"); // write each entry to file

               String[] fields = entry.split("\t");

               if (fields.length == 2) {

                   String name = fields[0].trim();

                   String phone = fields[1].trim();

                   table.put(name, phone);

               }

           }

       } catch (IOException e) {

           e.printStackTrace();

       }

       System.out.println("Hashtable contents:");

       for (Map.Entry<String, String> entry : table.entrySet()) {

           System.out.println(entry.getKey() + " = " + entry.getValue());

       }

       System.out.println("\nEnter a name to search:");

       String nameInput = sc.next();

       if (table.containsKey(nameInput)) {

           System.out.println("Data found: " + nameInput + " = " + table.get(nameInput));

       } else {

           System.out.println("Not found.");

       }

       sc.close();

   }

}
