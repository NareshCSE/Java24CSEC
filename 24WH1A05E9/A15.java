package e9;
import java.util.Scanner;

class creditsNotSufficientException extends Exception{
	public creditsNotSufficientException (String message) {
		super(message);
	}
}
public class A15 {
	public static void checkCredits(int credits) throws creditsNotSufficientException{
		if(credits<50) {
			throw new creditsNotSufficientException("Credits not sufficient! Minimum 50 are required.");
		}
		else {
			System.out.println("Credits are sufficient.");
		}
	}
	
	public static void validateStudent(int credits) throws creditsNotSufficientException{
		System.out.println("Validating Student Details");
		checkCredits(credits);
	}
	
	public static void processStudent(int credits) throws creditsNotSufficientException{
		System.out.println("Processing Student");
		validateStudent(credits);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int studentCredits = 65;
			processStudent(studentCredits);
		}
		catch(creditsNotSufficientException e) {
			System.out.println("Exception: " + e.getMessage());
		}
		finally {
			System.out.println("Process completed without exceptions!");
		}
	}

}
