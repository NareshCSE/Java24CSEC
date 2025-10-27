package vaishnavi;
import java.util.Scanner;
class PinMisMatchException extends Exception {
 public PinMisMatchException(String message) {
     super(message);
 }
}
public class ATM {

 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     String accountHolder;
     int correctPin = 1234; 
     int attempts = 0;
     boolean accessGranted = false;
     System.out.print("Enter Account Holder Name: ");
     accountHolder = scanner.nextLine();
     while (attempts < 3) {
         System.out.print("Enter PIN: ");
         int enteredPin = scanner.nextInt();

         if (enteredPin == correctPin) {
             System.out.println(" Welcome, " + accountHolder + "! Access Granted.");
             accessGranted = true;
             break;
         } else {
             attempts++;
             try {
                 throw new PinMisMatchException(" Incorrect PIN. Attempt " + attempts + " of 3.");
             } catch (PinMisMatchException e) {
                 System.out.println(e.getMessage());
             }
         }
     }
     if (!accessGranted) {
         try {
             throw new PinMisMatchException(" Sorry..Your Account Has been Locked");
         } catch (PinMisMatchException e) {
             System.out.println(e.getMessage());
         }
     }

     scanner.close();
 }
}
