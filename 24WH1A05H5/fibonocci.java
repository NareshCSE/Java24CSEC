package assignment;
import java.util.Scanner;
public class fibonocci {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n: ");
		int n = sc.nextInt();
		System.out.println("Prime nums between 1 and "+ n +"inFibonacci:");
		int a = 0, b = 1;
		while (a <= n) {
			boolean isPrime = true;
			if (a <= 1)
				isPrime = false;
			else {
				for (int i = 2; i <= a / 2; i++) {
					if (a % i == 0) {
						isPrime = false;
						break;
					}
				}
			}
			if (isPrime)
				System.out.print(a + " ");
			int c = a + b;
			a = b;
			b = c;
		}
		sc.close();
	}
}


