package assignment;

public class pattern4 {
	public static void main(String[] args) {
		int i = 1, j = 1, k = 1, n;
		for (i = 1; i <= 5; i++) {
			for (j = 1; j <= (5 - i); j++) {
				System.out.print("  ");
			}
			for (k = 1; k <= i; k++) {
				System.out.print(k + " ");
			}
			for (n = i - 1; n >= 1; n--) {
				System.out.print(n + " ");
			}
			System.out.println();
		}
	}

}
