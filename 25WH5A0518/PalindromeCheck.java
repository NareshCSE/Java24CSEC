package sathvika_25wh5a0518;

import java.util.Scanner;
public class PalindromeCheck {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter a string: ");
String str = sc.nextLine();
// Remove spaces and convert to lowercase for uniform checking
String original = str.replaceAll("\\s+", "").toLowerCase();
String reversed = "";
// Reverse the string
for (int i = original.length()- 1; i >= 0; i--) {
reversed += original.charAt(i);
}
// Check palindrome
if (original.equals(reversed)) {
System.out.println(str + " is a palindrome.");
} else {
System.out.println(str + " is not a palindrome.");
}
sc.close();
}
}