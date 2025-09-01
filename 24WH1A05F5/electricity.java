package javaassign;

import java.util.Scanner;

public class electricity {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
    	System.out.println("Enter old units: ");
    	int a=sc.nextInt();
    	System.out.println("Enter current units: ");
    	int b=sc.nextInt();
    	int c= b-a;
    	int d;
    	if(c<=50) {
    		d=(50*1);
    	}
    	else if(c<=100) {
    		d=(50*1)+(c-50)*2;
    	}
    	else if(c<=200) {
    		d=(50*1)+(50*2)+(c-100)*3;
    	}
    	else if(c<=300) {
    		d=(50*1)+(50*2)+(50*3)+(c-150)*4;
    	}
    	else {
    		d=(50*1)+(50*2)+(100*3)+(100*4)+(c-300)*5;
    	}
    	System.out.println(d);
    		
    	}
    


	}


