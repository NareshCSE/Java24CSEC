package Javaprograms;

import java.util.Scanner;

public class ElectricityBillGenerator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter old meter reading: ");
        int oldReading = scanner.nextInt();

        System.out.print("Enter current meter reading: ");
        int currentReading = scanner.nextInt();

        int units = currentReading - oldReading;

        if (units < 0) {
            System.out.println("Invalid readings! Current reading must be greater than or equal to old reading.");
        } else {
            int bill = 0;

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

            System.out.println("Units Consumed: " + units);
            System.out.println("Total Bill Amount: Rs." + bill);
        }

        scanner.close();
    }
}

