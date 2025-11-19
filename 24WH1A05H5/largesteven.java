package assignment;
import java.util.Scanner;
public class largesteven {
	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String input = sc.nextLine();
		int largestEven = -1;
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (ch >= '0' && ch <= '9') {
				int digit = ch - '0';
				if (digit % 2 == 0 && digit > largestEven)
					largestEven = digit;
			}
		}
		System.out.println("Largest even digit: " + largestEven);
		sc.close();
	}
}


