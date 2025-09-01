package shivani;
import java.util.Scanner;

public class sumevenodd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the number of integers: ");
        int count = scanner.nextInt();

        int evenSum = 0;
        int oddSum = 0;

       
        for (int i = 1; i <= count; i++) {
            System.out.print("Enter integer " + i + ": ");
            int number = scanner.nextInt();

            if (number % 2 == 0) {
                evenSum += number;
            } else {
                oddSum += number;
            }
        }
        System.out.println("\nSum of even numbers: " + evenSum);
        System.out.println("Sum of odd numbers: " + oddSum);

        scanner.close();
    }
}


