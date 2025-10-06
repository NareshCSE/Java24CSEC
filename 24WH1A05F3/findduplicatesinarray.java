package com.studyopedia;
import java.util.Scanner;
public class findduplicatesinarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter no. of elements:");
		int n =sc.nextInt();
		int arr[]=new int[n];
		
		System.out.println("Enter array elements:");
		int i;
		for(i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Duplicate elements in array are:");
		boolean flag=false;
		for (i = 0; i < n; i++) {
		    int j;
		    for (j = 0; j < i; j++) {
		    	if (arr[i] == arr[j]) {
		    		break;
		    	}
		   }
		    if (j != i) {
		    	continue;
		    }
		    for (j = i + 1; j < n; j++) {
		    	if (arr[i] == arr[j]) { 
		        System.out.println(arr[i]); 
		        flag=true;
		        break; 
		        
		    	}
		   }
		}
		if(!flag) {
			System.out.println("No duplicate elements found!!");
		}
		sc.close();
    }

	}


