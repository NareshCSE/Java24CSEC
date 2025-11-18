package javapratice;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;
public class ASS_19_24WH1A05D1 {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       Map<String, String> table = new Hashtable<>();
       try (FileWriter fw = new FileWriter("myfile.txt")) {
           String[] entries = {
               "TEJ \t 9884836996",
               "SAI \t 8375769396",
               "LILY \t 9875805883",
               "POOJA  \t 9285764949",
               "RAVI   \t 8749867948"
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
