package java_assignment;
import java.util.Scanner;
public class even_odd_sum {

public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Enter the number of integers you want to enter: ");
		        int count = scanner.nextInt();

		        int sumEven = 0;
		        int sumOdd = 0;

		        System.out.println("Enter " + count + " integers:");

		        for (int i = 0; i < count; i++) {
		            System.out.print("Enter integer " + (i + 1) + ": ");
		            int num = scanner.nextInt();

		            if (num % 2 == 0) {
		                sumEven += num;
		            } else {
		                sumOdd += num;
		            }
		        }

		        System.out.println("Sum of even integers: " + sumEven);
		        System.out.println("Sum of odd integers: " + sumOdd);

		        scanner.close();
		    }
		}
	
