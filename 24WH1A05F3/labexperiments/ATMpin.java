package labexperiments;
import java.util.Scanner;

class PinMisMatchException extends Exception {
    public PinMisMatchException(String message) {
        super(message);
    }
}

public class ATMpin {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Account Holder Name: ");
        String name = sc.nextLine();
        int actualPin = 1234;  
        int attempts = 0;
        boolean success = false;      

        while (attempts < 3) {
          System.out.print("Enter your ATM PIN: ");
            int enteredPin = sc.nextInt();
            if (enteredPin == actualPin) {
                System.out.println("Welcome, " + name + "! PIN Verified Successfully.");
                success = true;
                break;
            }
            else {
                attempts++;
                if (attempts < 3) {
                    System.out.println("Incorrect PIN! Try again. Attempts left: " + (3 - attempts));
                }
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
}

