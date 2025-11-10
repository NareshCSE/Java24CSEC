package javaExp;
class Q14CreditsNotSuff extends Exception {
    public Q14CreditsNotSuff(String message) {
        super(message);
    }
}
class StudentCredits {
    public void checkCredits(int credits) throws Q14CreditsNotSuff {
        if (credits < 50) {
            throw new Q14CreditsNotSuff("Credits not sufficient! Must have at least 50 credits.");
        } else {
            System.out.println("Credits are sufficient: " + credits);
        }
    }
public void callerMethod1(int credits) throws Q14CreditsNotSuff {
        System.out.println("Checking credits in callerMethod1...");
        checkCredits(credits);
    }
public void callerMethod2(int credits) throws Q14CreditsNotSuff {
        System.out.println("Checking credits in callerMethod2...");
        checkCredits(credits);
    }
}
class CreditCheckDemo {
    public static void main(String[] args) {
        StudentCredits student = new StudentCredits();
        try {
            // First call - will pass
            student.callerMethod1(80);
            // Second call - will fail
            student.callerMethod2(30);

        } catch (Q14CreditsNotSuff e) {
            System.out.println("Exception Caught: " + e.getMessage());
        } finally {
            System.out.println("Credit check completed.");
        }
    }
}

           


