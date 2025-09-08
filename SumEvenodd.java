package javaprograms;

import java.util.Scanner;

public class SumEvenodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of integers
        System.out.print("Enter how many integers you want to input: ");
        int n = sc.nextInt();

        int evenSum = 0;
        int oddSum = 0;

        // Loop through n numbers
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();

            if (num % 2 == 0) {
                evenSum += num;
            } else {
                oddSum += num;
            }
        }

        // Display results
        System.out.println("Sum of even numbers = " + evenSum);
        System.out.println("Sum of odd numbers = " + oddSum);

        sc.close();
    }
}
