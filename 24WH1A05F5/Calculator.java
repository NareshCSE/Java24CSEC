package javaassign;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter first number");
	int num1=sc.nextInt();
	System.out.println("Enter Second number");
	int num2=sc.nextInt();
	System.out.println("Enter the operator: ");
	char op=sc.next().charAt(0);
	switch(op) {
	case '+' :
		System.out.println(num1+num2);
		break;
		
	case '-' :
		System.out.println(num1-num2);
		break;
		
	case '*':
		System.out.println(num1*num2);
		break;
		
	case '/':
		System.out.println(num1/num2);
	    break;
	    
	case '%' :
		System.out.println(num1%num2);
		break;
		
	default:
		System.out.println("INVALUD INPUT!!!");
		break;
		
	}

	}

}
