package com.studyopedia;
import java.util.Scanner;

public class stringcommonelements {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("No. of elements in array1:");
        int size1 = sc.nextInt();
        sc.nextLine(); 

        String[] arr1 = new String[size1];
        System.out.println("Elements of array1:");
        for (int i = 0; i < size1; i++) {
            arr1[i] = sc.nextLine();
        }

        System.out.println("No. of elements in array2:");
        int size2 = sc.nextInt();
        sc.nextLine(); 

        String[] arr2 = new String[size2];
        System.out.println("Elements of array2:");
        for (int i = 0; i < size2; i++) {
            arr2[i] = sc.nextLine();
        }

        System.out.println("Common elements between two arrays are:");
        

        for (int i = 0; i < size1; i++) {
            boolean alreadythere = false;

            for (int j = 0; j < i; j++) {
                if (arr1[i]==arr1[j]) {
                    alreadythere = true;
                    break;
                }
            }
            if (alreadythere) continue;

            for (int k = 0; k < size2; k++) {
                if (arr1[i]==arr2[k]) {
                    System.out.println(arr1[i]);
                    break;
                }
                
            }
        }
        sc.close();
     }
 }

        
        
        
   
//         count = 0;
//        for ( i = 0; i < size1; i++) {
//            // Skip duplicates in arr1
//  
//            for (j = 0; j < i; j++) {
//                if (arr1[i].equals(arr1[j])) break;
//            }
//            if (j < i) continue;
//
//            // Check for match in arr2
//            for ( k = 0; k < size2; k++) {
//                if (arr1[i].equals(arr2[k])) {
//                    System.out.println(arr1[i]);
//                    count++;
//                    break;
//                }
//            }
//        }
//
//        if (count == 0) {
//            System.out.println("No common elements found.");
//        }

 