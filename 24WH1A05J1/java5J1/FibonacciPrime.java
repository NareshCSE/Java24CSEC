package java5J1;
import java.util.Scanner;
public class FibonacciPrime {
    
	public static boolean isPrime(int num) {
		if (num <= 1) return false;
		for (int i = 2; i < Math.sqrt(num); i++) {
			if (num % i == 0) return false;
		}
		return true;
	}
	
	public static int fibonacci(int num) {
		if (num <= 1) return num;
		else return fibonacci(num - 1) + fibonacci(num - 2);
	    
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of num:");
		int num = sc.nextInt();
		System.out.println("The Fibonacci Prime Series :");
	    for (int i = 0; i < num; i++) {
	        int fib = fibonacci(i);
	        if (isPrime(fib)) {
	            System.out.print(fib + " ");
	        }
	    }
	    sc.close();
	}

}
