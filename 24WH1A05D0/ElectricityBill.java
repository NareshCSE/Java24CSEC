package javaprograms;

import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input old and current readings
        System.out.print("Enter old reading: ");
        int oldReading = sc.nextInt();

        System.out.print("Enter current reading: ");
        int currentReading = sc.nextInt();

        // Units consumed
        int units = currentReading - oldReading;
        int bill = 0;

        if (units <= 50) {
            bill = units * 1;
        } 
        else if (units <= 100) {
            bill = (50 * 1) + (units - 50) * 2;
        } 
        else if (units <= 200) {
            bill = (50 * 1) + (50 * 2) + (units - 100) * 3;
        } 
        else if (units <= 400) {
            bill = (50 * 1) + (50 * 2) + (100 * 3) + (units - 200) * 4;
        } 
        else { // >400
            bill = (50 * 1) + (50 * 2) + (100 * 3) + (200 * 4) + (units - 400) * 5;
        }

        // Display bill
        System.out.println("Total units consumed: " + units);
        System.out.println("Electricity Bill: Rs." + bill);

        sc.close();
    }
}
