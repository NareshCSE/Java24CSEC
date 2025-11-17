package shriya_24WH1A05F0;

class CreditsNotSufficientException extends Exception {
    public CreditsNotSufficientException(String message) {
        super(message);
    }
}

class CreditsChecker {

    public void registerCourse(int credits) throws CreditsNotSufficientException {
        if (credits < 50) {
            throw new CreditsNotSufficientException("Insufficient Credits to register the course!");
        }
        System.out.println("Course registered successfully with " + credits + " credits.");
    }

    public void applyForExam(int credits) throws CreditsNotSufficientException {
        if (credits < 50) {
            throw new CreditsNotSufficientException("Insufficient Credits to apply for exam!");
        }
        System.out.println("Exam application successful with " + credits + " credits.");
    }

    public void validateCredits(int credits) throws CreditsNotSufficientException {
        if (credits < 50) {
            throw new CreditsNotSufficientException("Credits must be at least 50!");
        }
        System.out.println("Credits validated: " + credits);
    }
}

public class Assignment_15_CreditsnotSufficient {
    public static void main(String[] args) {

        CreditsChecker checker = new CreditsChecker();

        try {
            checker.registerCourse(10);
        } catch (CreditsNotSufficientException e) {
            System.out.println("Register Error: " + e.getMessage());
        }

        try {
            checker.applyForExam(2	0);
        } catch (CreditsNotSufficientException e) {
            System.out.println("Exam Error: " + e.getMessage());
        }

        try {
            checker.validateCredits(30);
        } catch (CreditsNotSufficientException e) {
            System.out.println("Validation Error: " + e.getMessage());
        }

        System.out.println("Program completed.");
    }
}
