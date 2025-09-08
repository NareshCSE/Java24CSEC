package java5J1;
import java.util.Scanner;
public class Pattern1 {
	public static void main(String[] args) {
		int num_of_lines, i, j;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no.of lines:");
		num_of_lines = sc.nextInt();
		sc.close();
		for (i = 1; i <= num_of_lines; i ++) {
			for (j = 1; j <= i; j ++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
