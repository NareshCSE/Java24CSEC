package javaAssignment;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		
		//JavaSE application to check whether the given String is Palindrome or not (use String only).
		
			    Scanner scanner = new Scanner(System.in);
		        System.out.print("Enter a string: ");
		        String originalString = scanner.nextLine();
		        String cleanedString = originalString.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
		        if (isPalindrome(cleanedString)) {
		            System.out.println("'" + originalString + "' is a palindrome.");
		        } else {
		            System.out.println("'" + originalString + "' is not a palindrome.");
		        }
		        scanner.close();
		    }
		    public static boolean isPalindrome(String str) {
		        if (str == null || str.length() <= 1) {
		            return true;
		        }
		        int left = 0;
		        int right = str.length() - 1;
		        while (left < right) {
		            if (str.charAt(left) != str.charAt(right)) {
		                return false;
		            }
		            left++;
		            right--;
		        }
		        return true;
			}
	}

