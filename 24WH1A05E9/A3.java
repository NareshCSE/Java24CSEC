package e9;
import java.util.Scanner;

public class A3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the no. of integers: ");
		
		int count = sc.nextInt();
		int evenSum = 0;
		int oddSum=0;
		
		for(int i=0; i<=count; i++) {
			System.out.print("Enter number " + i + ": ");
			int num=sc.nextInt();
			
			if(num%2==0) {
				evenSum+=num;
			}
			else {
				oddSum+=num;
			}
			System.out.println("Sum of even numbers: " + evenSum);
			System.out.println("Sum of odd numbers: " + oddSum);
		}
		sc.close();

		}

}