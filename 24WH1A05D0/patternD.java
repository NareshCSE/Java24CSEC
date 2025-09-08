package javaprograms;

public class patternD {
    public static void main(String[] args) {
        int n = 5; // number of rows

        for (int i = 1; i <= n; i++) {
            // Print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            // Increasing numbers
            for (int k = 1; k <= i; k++) {
                System.out.print(k + " ");
            }

            // Decreasing numbers
            for (int k = i - 1; k >= 1; k--) {
                System.out.print(k + " ");
            }

            System.out.println();
        }
    }
}
