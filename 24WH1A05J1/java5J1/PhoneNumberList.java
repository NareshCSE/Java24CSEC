package src;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;


public class Phone_numList {
    public static void main(String[] args) {
       
        HashMap<String, String> nameToPhone = new HashMap<>();
        HashMap<String, String> phoneToName = new HashMap<>();

        try {
            
            File file = new File("Phone_numbers.txt");
            Scanner fileScanner = new Scanner(file);

            
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine().trim();
                String[] parts = line.split("\t"); 
                if (parts.length == 2) {
                    String name = parts[0].trim();
                    String phone = parts[1].trim();
                    nameToPhone.put(name, phone);
                    phoneToName.put(phone, name);
                }
            }
            fileScanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
            return;
        }

        
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Enter a name or phone number:");
        String input = inputScanner.nextLine();

        
        if (nameToPhone.containsKey(input)) {
            System.out.println("Phone number: " + nameToPhone.get(input));
        } else if (phoneToName.containsKey(input)) {
            System.out.println("Name: " + phoneToName.get(input));
        } else {
            System.out.println("No match found.");
        }

        inputScanner.close();
    }
}
