package sathvika_25wh5a0518;
import java.util.*;
public class PatternD {
  public static void main(String[] args) {
	   int i,j,k,l,n; 
	   Scanner s=new Scanner(System.in); 
	   System.out.println("25WH5A0518\n");
	   System.out.print("Enter rows:"); 
	   n=s.nextInt(); 
	   for(i=1;i<=n;i++) 
	   { 
	    for(j=i;j<=n;j++) 
	     System.out.print("  "); 
	    for(k=i;k>=1;k--) 
	     System.out.print(k+ " "); 
	    for(l=2;l<=i;l++) 
	     System.out.print(l+ " "); 
	    System.out.println(); 
	   } 
	  } 
	  
	 } 	
