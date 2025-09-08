package javalabprograms5n1;
import java.util.Scanner;
public class calculator {
	public static void main(String[] args) {
	int a=10,b=5;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the operator:");
	char op=sc.next().charAt(0);
	switch(op){
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
	case '%':
		  System.out.println(a%b);
		  break;
	default:
		System.out.println("INVALID INPUT");
		break;
	}
  }

}
