import java.util.Scanner;

public class Calculator {
    static void add(int a, int b) {
        int sum = a + b;
        System.out.println(sum);
    }

    static void subtract(int a, int b) {
        int diff;
        if (a > b) {
            diff = a - b;
        } else {
            diff = b - a;
        }
        System.out.println(diff);
    }

    static void divide(int a, int b) {
        if (b != 0) {
            int div = a / b;
            System.out.println(div);
        } else {
            System.out.println("Error: Division by zero not allowed");
        }
    }

    static void multiply(int a, int b) {
        int prod = a * b;
        System.out.println(prod);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option, num1, num2;
        System.out.println("Enter first number:");
        num1 = sc.nextInt();
        System.out.println("Enter second number:");
        num2 = sc.nextInt();

        while (true) { 
            System.out.println("SELECT FROM MENU:\n1. Add\n2. Subtract\n3. Multiply\n4. Division\n5. Exit");
            System.out.println("Enter option:");
            option = sc.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Sum of two numbers:");
                    add(num1, num2);
                    break;
                case 2:
                    System.out.println("Subtraction of two numbers:");
                    subtract(num1, num2);
                    break;
                case 3:
                    System.out.println("Product of two numbers:");
                    multiply(num1, num2);
                    break;
                case 4:
                    System.out.println("Division of two numbers:");
                    divide(num1, num2);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    sc.close();
                    return; 
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
