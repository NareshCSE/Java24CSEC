package java5J1;
import java.util.Scanner;
public class Pattern4 {
	public static void main(String[] args) {
		int num_of_lines, i, j, k, l;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no.of lines:");
		num_of_lines = sc.nextInt();
		sc.close();
		for (i = 1; i <= num_of_lines; i++) {
			for (j = 1; j <= num_of_lines - i; j++) {
				System.out.print(" ");
			}
			for (k = 1; k <=i; k++) {
				System.out.print(k);
			}
			for (l = i - 1; l >= 1; l --) {
				System.out.print(l);
			}
			
			System.out.println();
		}
	}
}
