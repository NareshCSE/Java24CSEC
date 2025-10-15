package java_lab_exp;
import java.util.Scanner;
public class Q2SimpleCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc = new Scanner(System.in);

	        double num1, num2, result = 0;
	        int choice;

	        System.out.println("=== Simple Calculator ===");
	        System.out.println("1. Addition");
	        System.out.println("2. Subtraction");
	        System.out.println("3. Multiplication");
	        System.out.println("4. Division");
	        System.out.print("Enter your choice (1-4): ");
	        choice = sc.nextInt();

	        System.out.print("Enter first number: ");
	        num1 = sc.nextDouble();

	        System.out.print("Enter second number: ");
	        num2 = sc.nextDouble();

	        switch (choice) {
	            case 1:
	                result = num1 + num2;
	                System.out.println("Result = " + result);
	                break;

	            case 2:
	                result = num1 - num2;
	                System.out.println("Result = " + result);
	                break;

	            case 3:
	                result = num1 * num2;
	                System.out.println("Result = " + result);
	                break;

	            case 4:
	                result = num1 / num2;
	                System.out.println("Result = " + result);
	                break;

	            default:
	                System.out.println("Invalid choice!");
	        }

	        sc.close();
	    }
	

	}



       