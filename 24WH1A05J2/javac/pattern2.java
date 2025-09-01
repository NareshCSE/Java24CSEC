package javac;

import java.util.Scanner;

public class pattern2 {
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
			for (k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
	}
}

