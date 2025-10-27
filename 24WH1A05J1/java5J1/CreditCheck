package java5J1;
public class CreditCheck {

    static class CreditsNotSufficientException extends Exception {
        public CreditsNotSufficientException(String message) {
            super(message);
        }
    }

    static void registerCourse(int credits) throws CreditsNotSufficientException {
        if (credits < 50) {
            throw new CreditsNotSufficientException("Not enough credits to register for the course.");
        }
        System.out.println("Course registered successfully!");
    }

    static void applyScholarship(int credits) throws CreditsNotSufficientException {
        if (credits < 50) {
            throw new CreditsNotSufficientException("Not enough credits to apply for scholarship.");
        }
        System.out.println("Scholarship application submitted!");
    }

    static void checkGraduationEligibility(int credits) throws CreditsNotSufficientException {
        if (credits < 50) {
            throw new CreditsNotSufficientException("Not enough credits to graduate.");
        }
        System.out.println("Eligible for graduation!");
    }

    public static void main(String[] args) {
        int[] testCredits = {30, 60, 45};

        for (int credits : testCredits) {
            System.out.println("\nChecking for credits: " + credits);

            try {
                registerCourse(credits);
            } catch (CreditsNotSufficientException e) {
                System.out.println("Register Error: " + e.getMessage());
            }

            try {
                applyScholarship(credits);
            } catch (CreditsNotSufficientException e) {
                System.out.println("Scholarship Error: " + e.getMessage());
            }

            try {
                checkGraduationEligibility(credits);
            } catch (CreditsNotSufficientException e) {
                System.out.println("Graduation Error: " + e.getMessage());
            }
        }
    }
}
