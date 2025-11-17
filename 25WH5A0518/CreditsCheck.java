package sathvika_25wh5a0518;

import java.util.Scanner;
class CreditsNotSufficientException extends Exception {
CreditsNotSufficientException(String message) {
super(message);
}
}
public class CreditsCheck {
// Method that checks credits
static void checkCredits(int credits) throws CreditsNotSufficientException {
if (credits < 50) {
throw new CreditsNotSufficientException("Credits are less than 50! ");
} else {
System.out.println("Credits are sufficient.");
}
}
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Sathvika");
System.out.println("Enter test cases:");
int T=sc.nextInt();
while(T>0) {
System.out.println("Enter credits:");
int credits=sc.nextInt();
try {
checkCredits(credits); // calling the method that may throw exception
System.out.println("You can register for the course!");
}
catch (CreditsNotSufficientException e) {
System.out.println("Exception caught: " + e.getMessage());
}
System.out.println("program ended");
T--;
}
sc.close();
}
}






