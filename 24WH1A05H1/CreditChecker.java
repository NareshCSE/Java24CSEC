package java_assignment;

class CreditsNotSufficientException extends Exception
{
 public CreditsNotSufficientException(String message)
 {
     super(message);
 }
}
public class CreditChecker
{
 public static void registerForCourse(int credits) throws CreditsNotSufficientException
 {
     if (credits<50)
     {
         throw new CreditsNotSufficientException("Insufficient credits to register for course. Required: 50, Found: "+credits);
     }
     else 
     {
         System.out.println("Course registration successful!");
     }
 }
 public static void accessLibrary(int credits) throws CreditsNotSufficientException
 {
     if (credits<50)
     {
         throw new CreditsNotSufficientException("Insufficient credits to access the library. Required: 50, Found: "+credits);
     } 
     else 
     {
         System.out.println("Library access granted!");
     }
 }    

 public static void main(String[] args)
 {
     int[] creditValues={30,60};
     for (int credits:creditValues)
     {
         try
         {
             System.out.println("\nChecking for credits: "+credits);
             registerForCourse(credits);
             accessLibrary(credits);
         }
         catch (CreditsNotSufficientException e)
         {
             System.out.println("Exception caught: "+e.getMessage());
         } 
         finally
         
         {
             System.out.println("Credit check completed for value: "+credits);
         }
     }
 }
}