package sathvika_25wh5a0518;

import java.util.*;
public class PatternB {
    public static void main(String[] args) {
    	int i,j,n,k; 
    	  Scanner s=new Scanner(System.in);
    	  System.out.println("25WH5A0518");
    	  System.out.print("Enter rows:"); 
    	  n=s.nextInt(); 
    	  for(i=1;i<=n;i++) 
    	  { 
    	   for(j=i;j<n;j++) 
    	   { 
    	    System.out.print(" "); 
    	   } 
    	   for(k=1;k<=i;k++) 
    	   { 
    	    System.out.print("*"); 
    	   } 
    	   System.out.println( ); 
    	  } 
	}
}