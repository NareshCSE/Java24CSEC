package e9;
import java.util.Scanner;

public class A8 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String str = sc.nextLine();
	        sc.close();

	        int[] digits = new int[10];  
	        int count = 0;

	        for (int i = 0; i < str.length(); i++) {
	            char ch = str.charAt(i);
	            if (ch >= '0' && ch <= '9') {
	                int d = ch - '0';
	                if (digits[d] == 0) {  
	                    digits[d] = 1;
	                    count++;
	                }
	            }
	        }

	        if (count == 0) {
	            System.out.println(-1);
	            return;
	        }

	        int evenDigit = -1;
	        System.out.print("Largest even number: ");
	        for (int i = 9; i >= 0; i--) {
	            if (digits[i] == 1) {
	                if (i % 2 == 0 && evenDigit == -1) {
	                    evenDigit = i; 
	                } else {
	                    System.out.print(i);
	                }
	            }
	        }

	        if (evenDigit != -1)
	            System.out.println(evenDigit);
	        else
	            System.out.println("\n-1");

	}

}