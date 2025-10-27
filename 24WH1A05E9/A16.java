package e9;
import java.util.Scanner;
class PinMisMatchException extends Exception{
	public PinMisMatchException (String message) {
		super(message);
	}
}
public class A16 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Account Holder Name: ");
		String name = sc.nextLine();
		System.out.println("Set 4 digit PIN number: ");
		int correct_pin = sc.nextInt();
		System.out.println("Verify your pin to access your account: ");
		int attempts = 0;
		boolean access_granted = false;
		while(attempts<3) {
			System.out.println("Enter your pin: ");
			int tried_pin = sc.nextInt();
			if(tried_pin == correct_pin) {
				System.out.println("Access Granted");
				access_granted = true;
				break;
			}
			else {
				attempts++;
				if(attempts<3) {
					System.out.println("Incorrect pin. Try again! (" + (3-attempts) + " attempt(s) left!)" );
				}
			}
		}
		if(!access_granted) {
			try {
				throw new PinMisMatchException("Your account has been locked");
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
		sc.close();
	}

}
