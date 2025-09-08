package Assignment;
import java.util.Scanner;
public class ElectricityBill {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);

    System.out.print("Enter old meter reading: ");
    int oldReading = scanner.nextInt();
    System.out.print("Enter current meter reading: ");
    int currentReading = scanner.nextInt();
    int unitsConsumed = currentReading - oldReading;
    double billAmount = 0;
    if (unitsConsumed < 0) {
        System.out.println("Error: Current reading cannot be less than old reading.");
        return; 
    }
    if (unitsConsumed <= 50) {
        billAmount = unitsConsumed * 1;
    } else if (unitsConsumed <= 100) {
        billAmount = (50 * 1) + ((unitsConsumed - 50) * 2);
    } else if (unitsConsumed <= 200) {
        billAmount = (50 * 1) + (50 * 2) + ((unitsConsumed - 100) * 3);
    } else if (unitsConsumed <= 400) {
        billAmount = (50 * 1) + (50 * 2) + (100 * 3) + ((unitsConsumed - 200) * 4);
    } else { // unitsConsumed > 400
        billAmount = (50 * 1) + (50 * 2) + (100 * 3) + (200 * 4) + ((unitsConsumed - 400) * 5);
    }
    System.out.println("Units consumed: " + unitsConsumed);
    System.out.println("Electricity Bill Amount: Rs." + billAmount);
    scanner.close();
}
}