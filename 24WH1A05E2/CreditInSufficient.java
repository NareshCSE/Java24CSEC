 import java.util.Scanner;
class CreditInSuffiecientException extends Exception {
    public CreditInSuffiecientException(String message) {
        super(message);
    }
}
 class CreditsChecker {

	    // First method
	    public void registerCourse(int credits) throws CreditInSuffiecientException {
	        if (credits < 50) {
	            throw new CreditInSuffiecientException("Insufficient Credits to register the course!");
	        }
	        System.out.println("Course registered successfully with " + credits + " credits.");
	    }

	    // Second method
	    public void applyForExam(int credits) throws CreditInSuffiecientException {
	        if (credits < 50) {
	            throw new CreditInSuffiecientException("Insufficient Credits to apply for exam!");
	        }
	        System.out.println("Exam application successful with " + credits + " credits.");
	    }

	    // Third method
	    public void validateCredits(int credits) throws CreditInSuffiecientException {
	        if (credits < 50) {
	            throw new CreditInSuffiecientException("Credits must be at least 30!");
	        }
	        System.out.println("Credits validated: " + credits);
	    }
	}

 class CreditsNotSufficient{
        public static void main(String[] args) {
       Scanner sc =new Scanner(System.in);
       System.out.println("enter credits:");
       int usercredits=sc.nextInt();
            CreditsChecker checker = new CreditsChecker();
            try {
                checker.registerCourse(usercredits);
            } catch (CreditInSuffiecientException e) {
                System.out.println("Register Error: " + e.getMessage());
            }

            try {
                checker.applyForExam(usercredits);
            } catch (CreditInSuffiecientException e) {
                System.out.println("Exam Error: " + e.getMessage());
            }

            try {
                checker.validateCredits(usercredits);
            } catch (CreditInSuffiecientException e) {
                System.out.println("Validation Error: " + e.getMessage());
            }

            System.out.println("Process completed.");
        }
    }
