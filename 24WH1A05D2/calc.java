package Java;

import java.util.Scanner;

public class calc {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\nChoose an operation:");
            System.out.println("1. ADD");
            System.out.println("2. SUBTRACT");
            System.out.println("3. MULTIPLY");
            System.out.println("4. DIVIDE");
            System.out.println("5. EXIT");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            if (choice == 5) {
                System.out.println("Exiting program...");
                break;
            }

            // Get inputs only if the choice is between 1 and 4
            if (choice >= 1 && choice <= 4) {
                System.out.print("Enter A: ");
                int a = sc.nextInt();
                System.out.print("Enter B: ");
                int b = sc.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("Sum: " + (a + b));
                        break;
                    case 2:
                        System.out.println("Subtract: " + (a - b));
                        break;
                    case 3:
                        System.out.println("Multiply: " + (a * b));
                        break;
                    case 4:
                        if (b != 0) {
                            System.out.println("Division: " + (a / b));
                        } else {
                            System.out.println("Error: Division by zero is not allowed.");
                        }
                        break;
                }
            } else {
                System.out.println("Invalid choice. Please enter a number between 1 and 5.");
            }
        }

        sc.close();
    }
}
