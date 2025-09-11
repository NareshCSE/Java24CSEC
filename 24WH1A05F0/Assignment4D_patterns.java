package lab_assignments;

public class Assignment4d {

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
