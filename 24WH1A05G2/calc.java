package week3;
import java.util.Scanner; 

public class calc {

	public static void main(String[] args) {
		int result =0;
		Scanner sc = new Scanner(System.in);
		
        System.out.print("Enter no 1: ");
        int num1 = sc.nextInt();
        
        System.out.print("Enter no 2: ");
        int num2 = sc.nextInt();
        
        System.out.println("Choose operation: +, -, *, /");
        char operator = sc.next().charAt(0);

        switch(operator)
        { 
        case '+' :
        	result = num1 + num2;
            System.out.println("Result: " + result);
            break;
        case '-':
            result = num1 - num2;
            System.out.println("Result: " + result);
            break;
        case '*':
            result = num1 * num2;
            System.out.println("Result: " + result);
            break;
        case '/':
            if (num2 != 0) 
            {
                result = num1 / num2;
                System.out.println("Result: " + result);
            } 
            else 
            {
                System.out.println("Error: Division by zero!");
            }
            break;
         default:
        	 System.out.println("Invalid operator");
        }
        sc.close();

	}

}
