package javaExp;
import java.util.Scanner;

class PinMisMatchException extends Exception {
    public PinMisMatchException(String message) {
        super(message);
    }
}
class Q16ATMpin {
    private static final int CORRECT_PIN = 1234; //example PIN
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Account Holder Name: ");
        String name = sc.nextLine();
        int attempts = 0;
        boolean success = false;
        while (attempts < 3) {
            System.out.print("Enter your 4-digit PIN: ");
            int enteredPin = sc.nextInt();
            try {
                validatePin(enteredPin);
                System.out.println("Welcome, " + name + "! Access Granted.");
                success = true;
                break;
            } catch (PinMisMatchException e) {
                System.out.println("Attempt " + (attempts + 1) + ": " + e.getMessage());
                attempts++;
            }
        }
        if (!success) {
            try {
                throw new PinMisMatchException("Sorry..Your Account Has been Locked");
            } catch (PinMisMatchException e) {
                System.out.println(e.getMessage());
            }
        }

        sc.close();
    }
    //method to validate PIN
    public static void validatePin(int enteredPin) throws PinMisMatchException {
        if (enteredPin != CORRECT_PIN) {
            throw new PinMisMatchException("Incorrect PIN! Please try again.");
        }
    }
}
