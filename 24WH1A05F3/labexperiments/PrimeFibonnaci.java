package labexperiments;

import java.util.Scanner;
public class PrimeFibonnaci {
    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range (n): ");
        int n = sc.nextInt();

        int a = 0, b = 1;
        System.out.println("Prime numbers in Fibonacci series from 1 to " + n + ":");
        
        while (a <= n) {
            if (a >= 1 && isPrime(a)) {
                System.out.print(a + " ");
            }
            int next = a + b;
            a = b;
            b = next;
        }

        sc.close();
    }
}

