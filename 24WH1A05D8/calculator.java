package Java_lab_exp;
import java.util.Scanner;
public class calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("enter operation to perform: ");
		char choice;
		choice=input.next().charAt(0);
		int number1,number2;
		System.out.println("enter number1:");
		number1=input.nextInt();
		System.out.println("enter number2:");
		number2=input.nextInt();
		switch(choice) {
		case '+':System.out.println("Addition"+(number1+number2));break;
		case '-':System.out.println("Subtraction"+(number1-number2));break;
		case '*':System.out.println("Multiplication"+(number1*number2));break;
		case '/':System.out.println("Division"+(number1/number2));break;
		default:System.out.println("Invalid input");break;
		}
	}

}
