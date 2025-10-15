package java_lab_exp;
import java.util.Scanner;
public class Q3EvenOddSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int n, num;
        int evenSum = 0, oddSum = 0;

        System.out.print("Enter how many numbers you want to enter: ");
        n = sc.nextInt();

        // Loop to read numbers
        for (int i = 1; i <= n; i++) {
            System.out.print("Enter number " + i + ": ");
            num = sc.nextInt();

            if (num % 2 == 0) {
                evenSum = evenSum + num;   // add to even sum
            } else {
                oddSum = oddSum + num;     // add to odd sum
            }
        }

        // Display results
        System.out.println("\nSum of even numbers = " + evenSum);
        System.out.println("Sum of odd numbers = " + oddSum);

        sc.close();
    }

        	
	}


