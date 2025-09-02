package src;

import java.util.Scanner;

public class evenorodd {

	public static void main(String[] args) {
		int i;
		Scanner num = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = num.nextInt();
		int even = 0;
		int odd = 0;
		for (i=0;i<=n;i++) {
			if(i%2==0) {
				even+=i;
			}
			else {
			odd+=i;
		}
		}
		System.out.println("Sum of even numbers:"+ even);
		System.out.println("Sum of odd numbers:"+ odd);
	}

}
