package Javaprograms;

import java.util.Scanner;

public class sumofint {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
	System.out.println("enter no. of integers:");
	int n = scanner.nextInt();
	
	int esum = 0;
	int osum = 0;
	
	for(int i=1;i<=n;i++) {
		System.out.println("enter integers: "+ i + " : ");
		int num = scanner.nextInt();
		
		if(num%2 == 0) {
			esum += num;
		}
		else {
			osum += num; 

		}
	}
	System.out.println("Sum of even integers:" + esum);
	System.out.println("Sum of odd integers:" + osum);
	
	scanner.close();	
	
	}
}
