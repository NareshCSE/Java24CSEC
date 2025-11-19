package assignment;

public class pattern2 {
	public static void main(String[] args) {
		int i, j, k, n = 5;
		for (i = 1; i <= n; i++) {
			for (j = n - i; j > 0; j--) {
				System.out.print("  ");
			}
			for (k = 1; k <= i; k++) {
				System.out.print(" *");
			}
			System.out.println();
		}
	}
}



