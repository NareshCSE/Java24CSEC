 class CreditsNotSuffiecientException extends Exception {
    public CreditsNotSuffiecientException(String message) {
        super(message);
    }
}
 class CreditsChecker {

	    // First method
	    public void registerCourse(int credits) throws CreditsNotSuffiecientException {
	        if (credits < 50) {
	            throw new CreditsNotSuffiecientException("Insufficient Credits to register the course!");
	        }
	        System.out.println("Course registered successfully with " + credits + " credits.");
	    }

	    // Second method
	    public void applyForExam(int credits) throws CreditsNotSuffiecientException {
	        if (credits < 50) {
	            throw new CreditsNotSuffiecientException("Insufficient Credits to apply for exam!");
	        }
	        System.out.println("Exam application successful with " + credits + " credits.");
	    }

	    // Third method
	    public void validateCredits(int credits) throws CreditsNotSuffiecientException {
	        if (credits < 50) {
	            throw new CreditsNotSuffiecientException("Credits must be at least 50!");
	        }
	        System.out.println("Credits validated: " + credits);
	    }
	}

 class CreditsNotSufficient{
        public static void main(String[] args) {
            CreditsChecker checker = new CreditsChecker();
            try {
                checker.registerCourse(40);
            } catch (CreditsNotSuffiecientException e) {
                System.out.println("Register Error: " + e.getMessage());
            }

            try {
                checker.applyForExam(60);
            } catch (CreditsNotSuffiecientException e) {
                System.out.println("Exam Error: " + e.getMessage());
            }

            try {
                checker.validateCredits(30);
            } catch (CreditsNotSuffiecientException e) {
                System.out.println("Validation Error: " + e.getMessage());
            }

            System.out.println("Program completed.");
        }
    }

