package labprograms;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number");
		int num1=sc.nextInt();
		System.out.println("Enter Second number");
		int num2=sc.nextInt();
		System.out.println("1.Additon\n2.Subraction\n3.Multiplication\n4.Division\n5.Modulo");
		System.out.println("Enter the choice: ");
		int n=sc.nextInt();
		switch(n) {
		case 1 :
			System.out.println(num1+num2);
			break;
			
		case 2 :
			System.out.println(num1-num2);
			break;
			
		case 3:
			System.out.println(num1*num2);
			break;
			
		case 4:
			System.out.println(num1/num2);
		    break;
		    
		case 5 :
			System.out.println(num1%num2);
			break;
			
		default:
			System.out.println("INVALUD INPUT!!!");
			break;
		}
			
	}

}
