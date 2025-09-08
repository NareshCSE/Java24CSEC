package file.javac;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the num1:");
		int num1=sc.nextInt();
		System.out.println("Enter the num2:");
		int num2=sc.nextInt();
        System.out.println("Enter your choice:");
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1:
			System.out.println("ADD");
			System.out.println(num1+num2);
			break;
		case 2:
			System.out.println("SUB");
			System.out.println(num1-num2);
			break;
		case 3:
			System.out.println("MUL");
			System.out.println(num1*num2);
			break;
		case 4:
			System.out.println("DIV");
			System.out.println(num1/num2);
			break;
		case 5:
			System.out.println("MOD");
			System.out.println(num1%num2);
			break;
		case 6:
			System.out.println("SQU");
			System.out.println(num1*num1);
			System.out.println(num2*num2);
			break;
		default:
			System.out.println("invalid choice");
		}
		
		

	}

}
