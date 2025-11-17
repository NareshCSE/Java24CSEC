package sathvika_25wh5a0518;

import java.util.*;
public class PatternC {
    public static void main(String[] args) {
    	int i,j,n,k; 
    	  Scanner sc =new Scanner(System.in); 
    	  System.out.println("25WH5A0518\n");
    	  System.out.print("Enter rows:"); 
    	  n=sc.nextInt(); 
    	  for(i=1;i<=n;i++) 
    	  { 
    	   for(j=i;j<=n-1;j++) 
    	    System.out.print(" "); 
    	   for(k=1;k<=(2*i-1);k++) 
    	    System.out.print("*"); 
    	   System.out.println(); 
    	  } 
    	  for(i=n-1;i>=1;i--) 
    	  { 
    	   for(j=n;j>i;j--) 
    	    System.out.print(" "); 
    	   for(k=1;k<=(2*i-1);k++) 
    	    System.out.print("*"); 
    	   System.out.println(); 
    	  } 
    	 } 
    	 
	}