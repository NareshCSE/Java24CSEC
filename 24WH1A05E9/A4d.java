package e9;

public class A4d {
	
	//         1
	//       1 2 1 
	//     1 2 3 2 1
	//   1 2 3 4 3 2 1
	// 1 2 3 4 5 4 3 2 1

    public static void main(String[] args) {
        int rows = 5;

        for (int i = 1; i <= rows; i++) {
            // Print leading spaces
            for (int space = 1; space <= rows - i; space++) {
                System.out.print(" ");
            }

            // Print increasing numbers
            for (int num = 1; num <= i; num++) {
                System.out.print(num);
            }

            // Print decreasing numbers
            for (int num = i - 1; num >= 1; num--) {
                System.out.print(num);
            }

            // Move to next line
            System.out.println();
        }
    }
}