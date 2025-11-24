import java.util.Scanner;

public class Largest_even_no {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string:");
        String str = sc.nextLine();

        boolean[] present = new boolean[10];

        // Extract unique digits
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isDigit(ch)) {
                present[ch - '0'] = true;
            }
        }

        // Find smallest even digit to place at the end
        int smallestEven = -1;
        for (int d = 0; d <= 9; d++) {
            if (present[d] && d % 2 == 0) {
                smallestEven = d;
                break;
            }
        }

        if (smallestEven == -1) {
            System.out.println(-1);
            return;
        }

        StringBuilder sb = new StringBuilder();

        // Append digits from largest to smallest (except the final even digit)
        for (int d = 9; d >= 0; d--) {
            if (present[d] && d != smallestEven) {
                sb.append(d);
            }
        }

        // Last digit is the smallest even
        sb.append(smallestEven);

        System.out.println(sb.toString());
    }
}
