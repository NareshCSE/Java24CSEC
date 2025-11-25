package labexperiments;

import java.util.Scanner;

public class StringPalindrome {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the string:");
	        String str = sc.next();
	        String temp = str;
	        System.out.println("Original String: " + temp);
	        
	        
	        String reversed = new StringBuilder(str).reverse().toString();
	        System.out.println("Reversed String: " + reversed);
	        
	        if(temp.equals(reversed)) {
	            System.out.println("The string is a palindrome.");
	        } else {
	            System.out.println("The string is not a palindrome.");
	        }

	        sc.close();
	    }
	}