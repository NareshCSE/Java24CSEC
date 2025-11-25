package labexperiments;

import java.util.Scanner;
public class StringCommonElements {
 public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in); 
	 System.out.println("Enter elements of first array (separated by space):");
	 String[] arr1 = sc.nextLine().split(" ");
	 System.out.println("Enter elements of second array (separated by space):");
	 String[] arr2 = sc.nextLine().split(" ");
      int count = 0;
     System.out.println("Common elements are:");
     for (int i = 0; i < arr1.length; i++) {
         for (int j = 0; j < arr2.length; j++) {
             if (arr1[i].equals(arr2[j])) {
                 System.out.println(arr1[i]);
                 count++;
                 break;  }
         }
     }

     if (count == 0) {
         System.out.println("No common elements found.");
     } 
   }
}
