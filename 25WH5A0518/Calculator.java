package sathvika_25wh5a0518;

import java.util.*; 
public class Calculator {
public static void main(String[] args) { 
 int a,b,result; 
		  char op; 
		  Scanner sc = new Scanner(System.in);
		  System.out.println("25WH5A0518\n");
		 System.out.print("Enter 1st value:"); 
		  a=sc.nextInt(); 
		  System.out.print("enter 2nd value:");  
		  b=sc.nextInt(); 
		  System.out.print("Enter Operator (+,-,*,/):"); 
		  op=sc.next().charAt(0); 
		  switch(op){ 
		  case'+': { 
		   result=a+b; 
		   System.out.println("Addition:"+result); 
		   break; 
		  } 
		  case'-': { 
		   result=a-b; 
		   System.out.println("Subtrtaction:"+result); 
		   break; 
		  } 
		  case'*': { 
		   result=a*b; 
		   System.out.println("Multiplication:"+result); 
		   break; 
		  } 
		  case'/': { 
		   result=a/b; 
		   System.out.println("Division:"+result); 
		   break; 
		  } 
		  default: 
		   System.out.println("Error"); 
		 } 
		 } 
}
