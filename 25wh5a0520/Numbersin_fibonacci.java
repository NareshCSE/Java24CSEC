package java_25wh5a0520;
import java.util.*;
public class Numbersin_fibonacci {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter n value: ");
        int n = sc.nextInt();

        System.out.println("Prime numbers between 1 and " + n + " that are also in Fibonacci series:");
        for (int i = 2; i <= n; i++) {
            if (isPrime(i) && isFibonacci(i)) {
                System.out.print(i + " ");
            }
        }
        sc.close();
    }

    static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    static boolean isFibonacci(int num) {
        int a = 0, b = 1, c;
        while (b < num) {
            c = a + b;
            a = b;
            b = c;
        }
        return (b == num || num == 0);
    	}
}