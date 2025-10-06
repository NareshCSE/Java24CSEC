package src;

import java.util.Scanner;

public class CommonElementsOfTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array1 = new int[5];
		int[] array2 = new int[6];
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the elements of array1: ");
		for (int i = 0; i < array1.length; i++) {
			
				array1[i] = sc.nextInt();
			
		}
		System.out.println("Enter the elements of array2: ");
		for (int i = 0; i < array2.length; i++) {
			
				array2[i] = sc.nextInt();
			
		}
		System.out.println("The common elements of the two arrays are: ");
		int count = 0;
		for (int i = 0; i < array1.length; i++) {
			for (int j = i + 1; j < array2.length; j++) {
				if (array1[i] == array2[j]) {
					System.out.println(array1[i]);
					count ++; break;
				}
			}
		}
		if (count == 0) {
			System.out.println("There are no common elements in the given two arrays..");
		}
		
		sc.close();

	}

}
