package labexperiments;


class CreditsNotSufficientException extends Exception {
 public CreditsNotSufficientException(String message) {
     super(message);
 }
}

class Student {
 private String name;
 private int credits;

 public Student(String name, int credits) {
     this.name = name;
     this.credits = credits;
 }

 
 public void checkExamEligibility() throws CreditsNotSufficientException {
     if (credits < 50) {
         throw new CreditsNotSufficientException(name + " does not have enough credits to take the exam!");
     } else {
         System.out.println(name + " is eligible for the exam.");
     }
 }

 public void checkScholarshipEligibility() throws CreditsNotSufficientException {
     if (credits < 40) {
         throw new CreditsNotSufficientException(name + " does not have enough credits for a scholarship!");
     } else {
         System.out.println(name + " is eligible for a scholarship.");
     }
 }
}


public class CreditException {
 public static void main(String[] args) {
   
     Student s1 = new Student("har", 45);
     Student s2 = new Student("var", 35);

     try {
         s1.checkExamEligibility();
     } catch (CreditsNotSufficientException e) {
         System.out.println("Exception caught: " + e.getMessage());
     }

     try {
         s1.checkScholarshipEligibility();
     } catch (CreditsNotSufficientException e) {
         System.out.println("Exception caught: " + e.getMessage());
     }

     try {
         s2.checkExamEligibility();
         s2.checkScholarshipEligibility();
     } catch (CreditsNotSufficientException e) {
         System.out.println("Exception caught: " + e.getMessage());
     }

     System.out.println("Program ended normally.");
 }
}














