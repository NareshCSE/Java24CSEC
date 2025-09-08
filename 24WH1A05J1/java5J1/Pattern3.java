package java5J1;
import java.util.Scanner;
public class Pattern3 {
	public static void main(String[] args) {
		int num_of_lines, i, j, k;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no.of lines:");
		num_of_lines = sc.nextInt();
		sc.close();
		for (i = 1; i <= num_of_lines; i++) {
			for (j = 1; j <= num_of_lines - i; j++) {
				System.out.print(" ");
			}
			for (k = 1; k <= 2 * i - 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (i = num_of_lines - 1; i >= 1; i--) {
			for (j = 1; j <= num_of_lines - i; j++) {
				System.out.print(" ");
			}
			for (k = 1; k <= 2 * i - 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
