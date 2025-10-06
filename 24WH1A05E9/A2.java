package e9;
import java.util.Scanner;

public class A2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Scanner sc = new Scanner(System.in);
				
				System.out.print("Enter the first number: ");
				int a = sc.nextInt();
				
				System.out.print("Enter the second number: ");
				int b = sc.nextInt();
				
				System.out.print("Enter the Character (+, -, *, /): ");
				char operator = sc.next().charAt(0);
				
				int result;
				
				switch(operator) {
				case '+':
					result = a+b;
					System.out.println("Result: " + result);
					break;
					
				case '-':
					result = a-b;
					System.out.println("Result: " + result);
					break;
					
				case '*':
					result = a*b;
					System.out.println("Result: " + result);
					break;
				
				case '/':
					result=a/b;
					if(b!=0) {
						System.out.println("Result: " + result);
					}
					else {
						System.out.println("Cannot divide by Zero!");
					}
					break;
					
				default:
					System.out.println("Invalid expression\n");
					break;
				}
				sc.close();

	}

}
