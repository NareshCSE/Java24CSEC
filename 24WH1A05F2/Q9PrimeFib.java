package java_lab_exp;
public class Q9PrimeFib {
    public static void main(String[] args) {
        int n = 10;
        System.out.println("Prime numbers in Fibonacci series up to " + n + ":");
        int a = 0, b = 1;
        while (a <= n) {
            if (isPrime(a))
                System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }
    }
    static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }
}