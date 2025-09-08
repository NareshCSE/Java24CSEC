package labprogramss;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		double a =sc.nextDouble();
		System.out.println("Enter second number");
		double b =sc.nextDouble();
		System.out.println("Enter choice:+,-,*,/");
		char x=sc.next().charAt(0);
		switch(x) {
		
		case '+':
			System.out.println(a+b);
			break;
		case '-':
			System.out.println(a-b);
			break;
		case '*':
			System.out.println(a*b);
			break;
		case '/':
			System.out.println(a/b);
			break;
		}
		
		
		


	}

}
