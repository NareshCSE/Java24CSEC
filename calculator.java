package cycle1;
import java.util.*;
public class calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner read = new Scanner(System.in);
        int num1,num2,res;
        char op;
        num1 = read.nextInt();
        num2=read.nextInt();
        op= read.next().charAt(0);
        switch(op) {
        case '+' :
        	      res = num1+num2;
        	      System.out.println("sum is " + res);
        	      break;
        case '-':
        	      res = num1-num2;
        	      System.out.println("sub is "+ res);
        	      break;
        case '*':
        	      res = num1*num2;
        	      System.out.println("mul is "+ res);
        	      break;
        case '/':
        	      res = num1/num2;
        	      System.out.println("div is " + res);
        	      break;
        default :
        	      System.out.println("invalid");
        
        }
	}

}
