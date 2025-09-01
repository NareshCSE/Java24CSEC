package Javaprograms;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("enter first number");
		double num1 = scanner.nextDouble();
		
		System.out.println("enter second number");
		double num2 = scanner.nextDouble();
		
		System.out.println("enter the operator(+,-,*,/):");
		char operator = scanner.next().charAt(0);
		
		double result = 0;
		
		switch(operator) {
		case '+':
			result = num1 + num2;
			break;
		case '-':
			result = num1 - num2;
			break;
		case '*':
			result = num1 * num2;
			break;
		case '/':
			if (num2 != 0) {  
                result = num1 / num2;
            } else {
                System.out.println("Error: Division by zero is not allowed.");
                return;  
            }
            break;
        default:
            System.out.println("Error: Invalid operator. Please use +, -, *, or /.");
            return;  
    }

    System.out.println("The result is: " + result);
	
	scanner.close();
	}
}	
