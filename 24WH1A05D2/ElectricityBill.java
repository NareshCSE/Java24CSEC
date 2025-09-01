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
        int unitsConsumed = currentReading - oldReading;

        if (unitsConsumed < 0) {
            System.out.println("Invalid readings.");
            return;
        }

        double billAmount = 0;

        // Calculate the bill 
        if (unitsConsumed <= 50) {
            billAmount = unitsConsumed * 1;
        } else if (unitsConsumed <= 100) {
            billAmount = (50 * 1) + ((unitsConsumed - 50) * 2);
        } else if (unitsConsumed <= 200) {
            billAmount = (50 * 1) + (50 * 2) + ((unitsConsumed - 100) * 3);
        } else if (unitsConsumed <= 400) {
            billAmount = (50 * 1) + (50 * 2) + (100 * 3) + ((unitsConsumed - 200) * 4);
        } else {
            billAmount = (50 * 1) + (50 * 2) + (100 * 3) + (200 * 4) + ((unitsConsumed - 400) * 5);
        }

        // Display the result
        System.out.println("Units Consumed: " + unitsConsumed);
        System.out.println("Total Bill: Rs." + billAmount);

        sc.close();
    }
}

