package ass1;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		int option;
		do{
	    Scanner inputScanner = new Scanner(System.in);
	    System.out.print("Enter the first number: ");
	    int number1 = inputScanner.nextInt();
	    System.out.print("Enter the second number: ");
	    int number2 = inputScanner.nextInt();
	   System.out.println("choose an option\n1.ADDITION\n2.SUBTRACTION\n3.MULTIPLICATION\n4.DIVISION\n5.MODULUS\n");
	   option= inputScanner.nextInt();
	   switch (option) {
	   case 1:System.out.println( number1+number2); break;
	   case 2:System.out.println( number1-number2);break;
	   case 3:System.out.println( number1*number2);break;
	   case 4:System.out.println( number1/number2);break;
	   case 5:System.out.println( number1%number2);break;
	   }}
		while(option!=6);
		
	   

	}

}
