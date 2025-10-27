package vaishnavi;
class CreditsNotSufficientException extends Exception {
 public CreditsNotSufficientException(int credits) {
     super("Credits not sufficient: " + credits + ". You need at least 50 credits.");
 }
}

class StudentActions {

 public void enroll(int credits) throws CreditsNotSufficientException {
     if (credits < 50) {
         throw new CreditsNotSufficientException(credits);
     }
     System.out.println(" Enrolled in course!");
 }

 public void watchVideo(int credits) throws CreditsNotSufficientException {
     if (credits < 50) {
         throw new CreditsNotSufficientException(credits);
     }
     System.out.println(" Watched premium video!");
 }

 public void downloadNotes(int credits) throws CreditsNotSufficientException {
     if (credits < 50) {
         throw new CreditsNotSufficientException(credits);
     }
     System.out.println(" Downloaded notes!");
 }
}
public class exception {
 public static void main(String[] args) {
     StudentActions student = new StudentActions();

     int[] creditValues = {30, 60, 45};

     for (int credits : creditValues) {
         System.out.println("\nChecking with " + credits + " credits:");
         try {
             student.enroll(credits);
             student.watchVideo(credits);
             student.downloadNotes(credits);
         } catch (CreditsNotSufficientException e) {
             System.out.println(" Error: " + e.getMessage());
         }
     }
 }
}