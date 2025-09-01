public class Pattern_D {
    public static void main(String[] args) {
        int n = 5; // number of rows
        for (int i = 1; i <= n; i++) {
            // left side numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            // spaces in the middle
            for (int j = i; j < n; j++) {
                System.out.print("    ");
            }
            // right side numbers (reverse)
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}

	        
		

	


