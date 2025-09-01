package javaprograms;


	import java.util.Scanner; // Import the Scanner class to read user input

	/**
	 * A simple command-line calculator using a switch...case statement.
	 */
	public class SimpleCalculator {
	    public static void main(String[] args) {
	        // Declare variables
	        char operator;
	        double number1, number2, result;

	        // Create an object of the Scanner class to get input from the user
	        Scanner input = new Scanner(System.in);

	        // Prompt the user to choose an operator and enter two numbers
	        System.out.println("Choose an operator: +, -, *, or /");
	        operator = input.next().charAt(0); // Read the operator

	        System.out.println("Enter first number:");
	        number1 = input.nextDouble(); // Read the first number

	        System.out.println("Enter second number:");
	        number2 = input.nextDouble(); // Read the second number

	        // Use a switch statement to perform the selected operation
	        switch (operator) {
	            case '+':
	                result = number1 + number2;
	                System.out.println(number1 + " + " + number2 + " = " + result);
	                break; // Exit after calculation

	            case '-':
	                result = number1 - number2;
	                System.out.println(number1 + " - " + number2 + " = " + result);
	                break;

	            case '*':
	                result = number1 * number2;
	                System.out.println(number1 + " * " + number2 + " = " + result);
	                break;

	            case '/':
	                if (number2 != 0) { // Check for division by zero
	                    result = number1 / number2;
	                    System.out.println(number1 + " / " + number2 + " = " + result);
	                } else {
	                    System.out.println("Error! Division by zero is not allowed.");
	                }
	                break;

	            default: // Handle invalid operator
	                System.out.println("Invalid operator!");
	                break;
	        }

	        input.close(); // Close the scanner
	    }
	}


