package lab_assignments;
import java.util.Scanner;

public class Assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Java SE code that reads a set of integers, and then prints the sum of the even and odd integers separately  (use for loop)
		Scanner scanner = new Scanner(System.in);



		System.out.print("Enter the number of integers: ");

		int count = scanner.nextInt();



		int evenSum = 0;

		int oddSum = 0;



		for (int i = 1; i <= count; i++) {

		System.out.print("Enter number " + i + ": ");

		int num = scanner.nextInt();



		if (num % 2 == 0) {

		evenSum += num;

		} else {

		oddSum += num;

		}2

		}



		System.out.println("Sum of even numbers: " + evenSum);

		System.out.println("Sum of odd numbers: " + oddSum);



		scanner.close();




	}

}
