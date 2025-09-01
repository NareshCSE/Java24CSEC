package javaassign;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int sume=0;
		int sumo=0;
		System.out.println("eneter size:");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("enter element:");
		for(int i=0;i<n;i++) {
	      arr[i]=sc.nextInt();
		   }
		for(int i=0;i<n;i++) {
	       if(i%2==0) {
			  sume+=arr[i];
			   }
		   else {
			 sumo+=arr[i];
				   
			   }
		   }
		System.out.println("sum of even index:"+sume); 
		System.out.println("sum of even index:"+sumo);   
	   }
	
		

	}




