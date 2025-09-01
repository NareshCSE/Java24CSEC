package week3;
import java.util.Scanner;

public class evenorodd {

	public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);

		        System.out.print("Enter how many numbers you want to input: ");
		        int count = sc.nextInt();

		        int evenSum = 0;
		        int oddSum = 0;

		        for (int i = 1; i <= count; i++) 
		        {
		            System.out.print("Enter number " + i + ": ");
		            int num = sc.nextInt();

		            if (num % 2 == 0) 
		            {
		                evenSum += num;
		            } else 
		            {
		                oddSum += num;
		            }
		        }

		        System.out.println("\nSum of even numbers: " + evenSum);
		        System.out.println("Sum of odd numbers : " + oddSum);

		        sc.close();
		    }

	}


