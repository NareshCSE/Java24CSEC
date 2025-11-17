package java_25wh5a0520;
import java.util.*;
public class Calculator {

	public static void main(String[] args) {
		int num1, num2, res;
		char ch;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number1: ");
		num1 = sc.nextInt();
		System.out.println("Enter number2: ");
		num2 = sc.nextInt();
		System.out.println("Enter operator: ");
		ch = sc.next().charAt(0);
		switch(ch) {
			case '+':
				res = num1 + num2;
				System.out.println("result= " + res);
				break;
			case '-':
				res = num1 - num2;
				System.out.println("result= " + res);
				break;
			case '*':
				res = num1 * num2;
				System.out.println("result= " + res);
				break;
			case '/':
				res = num1/num2;
				System.out.println("result= " + res);
				break;
			case '%':
                                                      res = num1 % num2;
				System.out.println("result= " + res);
				break;
			default:
				System.out.println("Invalid Operator");

		}


	}

}
