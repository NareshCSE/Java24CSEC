package javaprograms;

import java.util.Scanner;

public class ArrayDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size of array
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Input elements
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        boolean found = false;
        System.out.println("Duplicate values in the array:");

        // Check duplicates
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                    found = true;
                    break; // avoid printing same duplicate multiple times
                }
            }
        }

        if (!found) {
            System.out.println("No duplicates found.");
        }

        sc.close();
    }
}
