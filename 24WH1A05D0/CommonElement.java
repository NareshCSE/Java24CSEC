package javaprograms;

import java.util.Scanner;

public class CommonElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter size of first array: ");
        int n1 = sc.nextInt();
        String[] arr1 = new String[n1];
        System.out.println("Enter " + n1 + " string values for first array:");
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.next();
        }

        
        System.out.print("Enter size of second array: ");
        int n2 = sc.nextInt();
        String[] arr2 = new String[n2];
        System.out.println("Enter " + n2 + " string values for second array:");
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.next();
        }

        
        System.out.println("Common elements between the two arrays:");
        boolean found = false;

        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                if (arr1[i].equals(arr2[j])) {
                    System.out.println(arr1[i]);
                    found = true;
                    break; 
                }
            }
        }

        if (!found) {
            System.out.println("No common elements found.");
        }

        sc.close();
    }
}
