package shriya_24wh1a05f0;
import java.util.Scanner;
class PinMisMatchException extends Exception {
    public PinMisMatchException(String message) {
        super(message); 
    }
}
public class Assignment16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Account Holder Name: ");
        String name = sc.nextLine();
        System.out.println("Set your 4-digit PIN number: ");
        int correct_pin = sc.nextInt();
        System.out.println("Now verify your PIN to access your account.");
        int attempts = 0;
        boolean access_granted = false;
        while (attempts < 3) {
            System.out.print("Enter your PIN: ");
            int tried_PIN = sc.nextInt();
            if (tried_PIN == correct_pin) {
                System.out.println("Access Granted");
                access_granted = true;
                break;
            } else {
                attempts++;
                if (attempts < 3) {
                    System.out.println(" Incorrect PIN. Try again (" + (3 - attempts) + " attempts left).");
                }
            }
        }
        if (!access_granted) {
            try {
                throw new PinMisMatchException("Your Account Has been Locked");
            } catch (PinMisMatchException e) {
                System.out.println(e.getMessage());
            }
        }
        sc.close();
    }
}
