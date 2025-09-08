package java5J1;
import java.util.Scanner;
public class Even_Odd_sum {
	public static void main(String[] args) {
		int number, i, evenSum = 0, oddSum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		number = sc.nextInt();
		for (i = 1; i <= number; i++) {
			if (i % 2 == 0) {
				evenSum += i;
			} else {
				oddSum += i;
			}
		}
		System.out.println("The sum of even numbers until the given number " + number + " is: " + evenSum);
		System.out.println("The sum of odd numbers until the given number " + number + " is: " + oddSum);
		sc.close();
	}
}
