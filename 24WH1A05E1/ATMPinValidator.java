import java.util.Scanner;
class PinMisMatchException extends Exception {
    public PinMisMatchException(String message) {
        super(message);
    }
}
public class ATMPinValidator {
    private static final int CORRECT_PIN = 1234;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Account Holder Name: ");
        String name = scanner.nextLine();
        int attempts = 0;
        boolean accessGranted = false;
        while (attempts < 3) {
            System.out.print("Enter PIN: ");
            int enteredPin = scanner.nextInt();

            if (enteredPin == CORRECT_PIN) {
                System.out.println("Access Granted. Welcome, " + name + "!");
                accessGranted = true;
                break;
            } else {
                attempts++;
                try {
                    throw new PinMisMatchException("Incorrect PIN. Attempt " + attempts + " of 3.");
                } catch (PinMisMatchException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
        if (!accessGranted) {
            try {
                throw new PinMisMatchException("Sorry..Your Account Has been Locked");
            } catch (PinMisMatchException e) {
                System.out.println(e.getMessage());
            }
        }
        scanner.close();
    }
}