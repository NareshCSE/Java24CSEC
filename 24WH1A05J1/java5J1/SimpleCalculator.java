package java5J1;
import java.util.Scanner;
public class SimpleCalculator {
	public static void main (String[] args) {
	    int choice, num1, num2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st number:");
		num1 = sc.nextInt();
		System.out.println("Enter 2nd number:");
		num2 = sc.nextInt();		
		while(true) {
		    System.out.println("1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Exit");
			System.out.println("Enter your choice (1-5):");
			choice = sc.nextInt();
			switch(choice) {
			case 1: System.out.println("Addition of the given numbers " + num1 + " and " + num2 + " is: " + (num1 + num2)); break;
			case 2: System.out.println("Subtraction of the given numbers " + num1 + " and " + num2 + " is: " + (num1 - num2)); break;
			case 3: System.out.println("Multiplication of the given numbers " + num1 + " and " + num2 + " is: " + num1 *  num2); break;
			case 4: if (num2 != 0) {
				System.out.println("Division of the given numbers " + num1 + " and " + num2 + " is: " + ((double)num1 / num2)); 
			} else {
				System.out.println("Division is not possible..");
			}break;
			case 5: System.out.println("Exiting.."); sc.close(); System.exit(0);
			default: System.out.println("Invali choice..");
			}
		}
	}
}
