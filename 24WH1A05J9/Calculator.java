package myClass;
import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter first number: ");
		int first_num=scan.nextInt();
		System.out.print("Enter second number: ");
		int second_num=scan.nextInt();
		System.out.print("Enter opreation ( '+','-','*','/'):");
		char operator = scan.next().charAt(0);
		switch(operator) {
		case '+': System.out.println(first_num+second_num);break;
		case '-': System.out.println(first_num-second_num);break;
		case '*': System.out.println(first_num*second_num);break;
		case'/': System.out.println(first_num/second_num);break;
		default: System.out.println("Invalid choice");break;
		}
		scan.close();
	}
}

