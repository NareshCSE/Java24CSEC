package Java;
import java.util.Scanner;
public class Pattern_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter number of rows: ");
        for (int i = 0; i < n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print("  "); 
            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
 }
}
