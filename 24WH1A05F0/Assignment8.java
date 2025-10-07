package lab_assignments;

import java.util.Scanner;

public class Assignment8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        sc.close();

        int[] digits = new int[10];
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isDigit(ch)) {
                digits[ch - '0'] = 1;
            }
        }

        int evenDigit = -1;
        for (int i = 0; i <= 9; i++) {
            if (digits[i] == 1 && i % 2 == 0) {
                evenDigit = i;
            }
        }

        if (evenDigit == -1) {
            System.out.println(-1);
            return;
        }

        System.out.print("Largest even number: ");
        for (int i = 9; i >= 0; i--) {
            if (digits[i] == 1 && i != evenDigit) {
                System.out.print(i);
            }
        }
        System.out.println(evenDigit);
    }
}
