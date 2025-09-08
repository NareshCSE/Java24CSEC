import java.util.Scanner;

		public class Palindrome {
		    public static void main(String[] args) {
		        Scanner s=new Scanner(System.in);
		        System.out.println("enter a string:");
		       String original=s.next();
		        String reversed = "";

		        for (int i = original.length() - 1; i >= 0; i--) {
		            reversed = reversed + original.charAt(i);
		        }

		        if (original.equals(reversed)) {
		            System.out.println(original + " is a palindrome.");
		        } else {
		            System.out.println(original + " is not a palindrome.");
		        }
		    }
		}

	

