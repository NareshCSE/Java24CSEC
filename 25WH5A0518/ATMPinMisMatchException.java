package javamid2;

import java.util.Scanner;
class PinMisMatchException extends Exception {
 public PinMisMatchException(String message) {
     super(message);
 }
}
//Main Class
public class ATMPinMisMatchException {

 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     final int VALID_PIN = 1234;

     System.out.print("Enter Account Holder Name: ");
     String name = sc.nextLine();

     int attempts = 0;
     boolean accessGranted = false;

     while (attempts < 3) {
         System.out.print("Enter your PIN: ");
         int enteredPin = sc.nextInt();

         if (enteredPin == VALID_PIN) {
             System.out.println("Welcome, " + name + "! Access Granted.");
             accessGranted = true;
             break;
         } else {
             attempts++;
             System.out.println("Incorrect PIN. Attempt " + attempts + " of 3.");
         }
     }

     // If all 3 attempts fail, throw custom exception
     if (!accessGranted) {
         try {
             throw new PinMisMatchException("Sorry..Your Account Has been Locked");
         } catch (PinMisMatchException e){
             System.out.println(e.getMessage());
         }
     }

     sc.close();
 }
}
