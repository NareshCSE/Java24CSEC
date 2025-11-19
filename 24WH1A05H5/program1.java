package assignment;
import java.util.Scanner;

public class program1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter old readings");
		int oldreadings = sc.nextInt();
		System.out.println("enter new readings");
		int newreadings = sc.nextInt();
		int units = newreadings - oldreadings;
		if (units < 50) {
			int bill = 0;
			bill = units * 1;
			System.out.println("the current bill is" + (bill));
		} else if (units > 50 && units < 100) {
			int bill1 = 0;
			int rem1 = units % 50;
			bill1 = (50 * 1) + (rem1 * 2);
			System.out.println("the current bill is" + (bill1));
		} else if (units > 100 && units < 200) {
			int bill2 = 0;
			int rem = units % 100;
			bill2 = (50 * 1) + (50 * 2) + (rem * 3);
			System.out.println("the current bill is" + (bill2));
		} else if (units > 200 && units < 400) {
			int bill3 = 0;
			int rem2 = units % 200;
			bill3 = (50 * 1) + (50 * 2) + (100 * 3) + (rem2 * 4);
			System.out.println("the current bill is" + (bill3));
		} else {
			int bill4 = 0;
			int rem3 = units % 400;
			bill4 = (50 * 1) + (50 * 2) + (100 * 3) + (200 * 4) + (rem3 * 5);
			System.out.println("the current bill is" + (bill4));
		}
		sc.close();
	}
}





