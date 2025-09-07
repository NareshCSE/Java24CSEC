import java.util.Scanner;

public class pattern4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n:");
		int n = sc.nextInt();
		sc.close();
		for(int i = 1; i <= n; i++) {
			for(int k = n - i; k > 0; k --) {
				System.out.print(" ");
			}
			for(int j = 1; j <= i ; j++) {
				System.out.print(j);
			}
			for(int j = i - 1; j > 0 ; j--) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
