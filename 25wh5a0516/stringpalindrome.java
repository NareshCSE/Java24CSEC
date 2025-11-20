package assignment;
import java.util.*;
public class stringpalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		
		        Scanner scanner = new Scanner(System.in);
		        System.out.println("Enter String");
		        String original = scanner.nextLine();          
		        StringBuilder sb = new StringBuilder(original);
		        String reversed = sb.reverse().toString();
		        if (original.equals(reversed)) {
		            System.out.println("Given string is a palindrome");
		        } else {
		            System.out.println("Given string is not a palindrome");
		        }
		        
		        scanner.close(); 
		    }
}
