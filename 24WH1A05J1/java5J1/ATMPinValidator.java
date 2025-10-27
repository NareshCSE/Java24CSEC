package java5J1;
import java.util.Scanner;

public class ATMPinValidator {

    static class PinMisMatchException extends Exception {
        public PinMisMatchException(String message) {
            super(message);
        }
    }

    public static void validatePin(String name, int enteredPin, int correctPin, int attempt) throws PinMisMatchException {
        if (enteredPin != correctPin) {
            if (attempt == 3) {
                throw new PinMisMatchException("Sorry..Your Account Has been Locked");
            } else {
                throw new PinMisMatchException("Incorrect PIN. Try again.");
            }
        } else {
            System.out.println("Welcome, " + name + "! Access Granted.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name;
        int correctPin = 1234;
        int attempts = 0;
        boolean accessGranted = false;

        System.out.print("Enter Account Holder Name: ");
        name = scanner.nextLine();

        while (attempts < 3 && !accessGranted) {
            System.out.print("Enter PIN: ");
            int enteredPin = scanner.nextInt();
            attempts++;

            try {
                validatePin(name, enteredPin, correctPin, attempts);
                accessGranted = true;
            } catch (PinMisMatchException e) {
                System.out.println(e.getMessage());
                if (attempts == 3) {
                    System.out.println("Too many failed attempts.");
                }
            }
        }

        scanner.close();
    }
}
