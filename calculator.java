package calci;
import java.util.Scanner;
public class calculator {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter first number:");
		double a=sc.nextDouble();
		System.out.println("enter second number:");
		double b=sc.nextDouble();
		System.out.println("enter operator(+,-,*,/):");
		char op=sc.next().charAt(0);
		
		switch(op) {
		case '+': System.out.println("result:"+(a+b));
		break;
		case '-': System.out.println("result:"+(a-b));
        break;
		case '*': System.out.println("result:"+(a*b));
		break;
		case '/': System.out.println("result:"+(a/b));
		break;
		default:System.out.println("invalid");
		
	}
         sc.close();
	
	
	}

}
