package javaprograms;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // convert to lowercase to ignore case
        str = str.toLowerCase();

        String reversed = "";
        // reverse using loop
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed = reversed + str.charAt(i);
        }

        // check palindrome
        if (str.equals(reversed)) {
            System.out.println("The string \"" + str + "\" is a Palindrome.");
        } else {
            System.out.println("The string \"" + str + "\" is NOT a Palindrome.");
        }
    }
}
