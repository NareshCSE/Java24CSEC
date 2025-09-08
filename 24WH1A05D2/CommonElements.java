package Questions;
import java.util.Scanner;

public class CommonElements {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the No of Elements in 1st Array: ");
        int n1 = scanner.nextInt();
        
        String[] array1 = new String[n1];
        System.out.println("Enter elements for the 1st Array:");
        for (int i = 0; i < n1; i++) {
            
            array1[i] = scanner.next();
        }

        System.out.print("Enter the No of Elements in 2nd Array: ");
        int n2 = scanner.nextInt();
        
        String[] array2 = new String[n2];
        System.out.println("Enter  elements for the 2nd Array:");
        for (int i = 0; i < n2; i++) {
           
            array2[i] = scanner.next();  
        }

        System.out.println("Common elements are:");
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                if (array1[i].equals(array2[j])) {
                    System.out.println(array1[i]);
                    break;
                }
            }
        }

        scanner.close();
    }
}
