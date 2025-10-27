package javalabexp;
import java.util.Scanner;
class PinMisMatchedException extends Exception {
	PinMisMatchedException(String message){
	super(message);
}
}
public class ATM {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String accHolderName;
		int correctPIN = 1234;
		int enteredPIN;
		System.out.println("Enter account holder name : ");
		accHolderName = sc.nextLine();
		int attempts =0;
		while(attempts<3) {
			System.out.println("Enter PIN: ");
			enteredPIN = sc.nextInt();
			if(enteredPIN == correctPIN) {
				System.out.println("Welcome " + accHolderName + " access Granted!");
        sc.close();
			return;
			}
			else {
				attempts++;
				System.out.println("Incorrect PIN, " + attempts + " out of 3");
			}
			}
		try {
			throw new PinMisMatchedException("Sorry..your account has been bolcked");
		}
		catch(PinMisMatchedException e){
			System.out.println(e.getMessage());	
		}
	sc.close();
	}
}
