package javaAssignment;

import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {
		//Assignment 2:   JavaSE application to make a Simple Calculator using switch...case
		//​​should be able to add, subtract, multiply and divide two numbers. Scan the two numbers and operator using Scanner class.

	
		        Scanner sc = new Scanner(System.in);

		        // Input numbers
		        System.out.print("Enter first number: ");
		        double num1 = sc.nextDouble();
		        System.out.print("Enter second number: ");
		        double num2 = sc.nextDouble();

		        // Input operator
		        System.out.print("Enter operator (+, -, *, /): ");
		        char operator = sc.next().charAt(0);

		        double result = 0;

		        switch (operator) {
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
		                if (num2 != 0)
		                    result = num1 / num2;
		                else
		                    System.out.println("Error: Division by zero is not allowed.");
		                break;
		            default:
		                System.out.println("Invalid operator!");
		                return;
		        }

		        System.out.println("Result: " + result);
		        sc.close();
		    }
		}

	
