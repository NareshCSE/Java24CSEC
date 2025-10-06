package com.studyopedia;
import java.util.Scanner;
public class arrayduplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter no. of elements");
		int n= sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter array elements:");
		int i;
		for( i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("The duplicate elements are:");
		for( i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.println(arr[i]);
				}
			}
		}

	}
		

}


