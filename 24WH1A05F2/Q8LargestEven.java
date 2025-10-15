package java_lab_exp;
import java.util.Scanner;
public class Q8LargestEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.next();
        String digits = ""; 
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= '0' && ch <= '9' && digits.indexOf(ch) == -1) {
                digits += ch;
            }
        }
        if (digits.length() == 0) {
            System.out.println("-1");
            sc.close();
            return;
        }
        String largest = ""; 
        char evenDigit = ' '; 
        for (int i = 0; i < digits.length(); i++) {
            if ((digits.charAt(i) - '0') % 2 == 0) {
                if (evenDigit == ' ' || digits.charAt(i) > evenDigit) {
                    evenDigit = digits.charAt(i);
                }
            }
        }

       if (evenDigit == ' ') {
            System.out.println("-1");
            sc.close();
            return;
        }

        for (int d = 9; d >= 0; d--) {
            char c = (char)(d + '0');
            for (int i = 0; i < digits.length(); i++) {
                if (digits.charAt(i) == c && c != evenDigit) {
                    largest += c;
                }
            }
        }

        largest += evenDigit;

        System.out.println("Largest even number: " + largest);
        sc.close();
	}

}
