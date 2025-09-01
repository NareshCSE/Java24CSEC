package Java;

import java.util.Scanner;

public class pattern2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int size = sc.nextInt();

        for (int i = 1; i <= size; i++) {

            // Print spaces first to shift stars to the right
            for (int j = 1; j <= size - i; j++) {
                System.out.print("  "); // Two spaces for proper alignment
            }

            // Print stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

     System.out.println(); // Move to the next row
        }

        sc.close();
    }
}
