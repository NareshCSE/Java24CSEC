package javac;
import java.util.Scanner;

public class problem1 {

	public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Enter previous reading: ");
		        int previousReading = scanner.nextInt();
		        System.out.print("Enter current reading: ");
		        int currentReading = scanner.nextInt();

		        int unitsConsumed = currentReading - previousReading;
		        if (unitsConsumed < 0) {
		            System.out.println("Error: Current reading must be >= previous reading.");
		            return;
		        }

		        int bill = 0;
		        if (unitsConsumed <= 50) {
		            bill = unitsConsumed * 1;
		        } else if (unitsConsumed <= 100) {
		            bill = 50 * 1 + (unitsConsumed - 50) * 2;
		        } else if (unitsConsumed <= 200) {
		            bill = 50 * 1 + 50 * 2 + (unitsConsumed - 100) * 3;
		        } else if (unitsConsumed <= 400) {
		            bill = 50 * 1 + 50 * 2 + 100 * 3 + (unitsConsumed - 200) * 4;
		        } else {
		            bill = 50 * 1 + 50 * 2 + 100 * 3 + 200 * 4 + (unitsConsumed - 400) * 5;
		        }

		        System.out.println("Units consumed: " + unitsConsumed);
		        System.out.println("Total bill: Rs. " + bill);

		        scanner.close();
		    }
		}

