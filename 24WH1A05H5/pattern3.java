package assignment;
import java.util.Scanner;
public class pattern3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the height of half diamond:");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int j = i; j < n; j++)
				System.out.print(" ");
			for (int j = 1; j <= (2 * i - 1); j++)
				System.out.print("*");
			System.out.println();
		}
		for (int i = n - 1; i >= 1; i--) {
			for (int j = n; j > i; j--)
				System.out.print(" ");
			for (int j = 1; j <= (2 * i - 1); j++)
				System.out.print("*");
			System.out.println();
		}
		sc.close();
	}
}


	


