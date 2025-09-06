package myClass;
import java.util.*;

public class Pattern_4d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n value: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            // print leading spaces
            for (int s = 1; s <= n - i; s++) {
                System.out.print("  ");
            }

            // print left side numbers (1 to i)
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            // print right side numbers (i-1 down to 1)
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j + " ");
            }

            System.out.println();
        }

        sc.close();
    }
}
