package sathvika_25wh5a0518;
import java.util.Scanner;

public class PrimeFibonacci {

    // Check if number is prime
    static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    // Check if number is in Fibonacci series
    static boolean isFibonacci(int num) {
        if (num == 0 || num == 1)
            return true;
        int a = 0, b = 1;
        while (b < num) {
            int c = a + b;
            a = b;
            b = c;
        }
        return b == num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.println("Numbers up to " + n + " that are prime and in Fibonacci series:");
        for (int i = 0; i <= n; i++) {
            if (isPrime(i) && isFibonacci(i)) {
                System.out.print(i + " ");
            }
        }
        sc.close();
    }
}
