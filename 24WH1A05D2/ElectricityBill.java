package Java;

import java.util.Scanner;

public class ElectricityBill {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input old and current reading
        System.out.print("Enter the Old Reading: ");
        int oldReading = sc.nextInt();
        
        System.out.print("Enter the Current Reading: ");
        int currentReading = sc.nextInt();

        // Calculate units consumed
        int units = currentReading - oldReading;

        if (units < 0) {
            System.out.println("Invalid readings.");
            return;
        }

        double bill = 0;

        // Calculate the bill 
        if (units <= 50) {
            bill = units * 1;
        } else if (units <= 100) {
            bill = (50 * 1) + ((units - 50) * 2);
        } else if (units <= 200) {
            bill = (50 * 1) + (50 * 2) + ((units - 100) * 3);
        } else if (units <= 400) {
            bill = (50 * 1) + (50 * 2) + (100 * 3) + ((units - 200) * 4);
        } else {
            bill = (50 * 1) + (50 * 2) + (100 * 3) + (200 * 4) + ((units - 400) * 5);
        }

        // Display the result
        System.out.println("Units Consumed: " + units);
        System.out.println("Total Bill: Rs." + bill);

        sc.close();
    }
}


