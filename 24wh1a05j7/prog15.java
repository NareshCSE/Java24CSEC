// Create and Raise the exception CreditsNotSuffiecientException if 
//credits are less than 50 with different caller methods. and handle them.. 


class CreditsNotSufficientException extends Exception{
	CreditsNotSufficientException(int credits){
		super("Credits not sufficient, should be atleast 50, scored : " + credits);
	}
}
public class prog15 {

	static void checkCredits(int credits) throws CreditsNotSufficientException {
		if (credits < 50) throw new CreditsNotSufficientException(credits);
		System.out.println("Credits are sufficient");
	}
	
	static void caller(String subject, int credits) {
		System.out.println("--" + subject + "-- ");
		try {
			checkCredits(credits);
			System.out.println(subject +" Successful");
		}
		catch (CreditsNotSufficientException e) {
			System.out.println(subject + " failed: " + e.getMessage());
		}
	}
	
	public static void main(String []args) {
		caller("Physics", 80);
		caller("Chem",40);
		caller("DBMS", 20);
	}

}


