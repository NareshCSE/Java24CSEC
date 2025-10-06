package com.studyopedia;
import java.util.Scanner;
public class stringpalindrome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of the string:");
        int size = sc.nextInt();
       sc.nextLine(); 

        String[] str = new String[100];

        System.out.println("Enter String:");
        for (int i = 0; i < size; i++) {
           str[i] = sc.nextLine();
        }
        
      

        boolean isPalindrome = true;
        for (int i = 0; i < size ; i++) {
            if (!(str[i]==str[size - 1 - i])) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("Is a palindrome");
        } else {
            System.out.println("Not a palindrome");
        }

        sc.close();
    }
}
