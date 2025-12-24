package sathvika_25wh5a0518;
import java.util.*;
public class ElectricityBill { 
	 public static void main(String[] args) { 
	  int current, present, old; 
	  float bill; 
	  Scanner sc = new Scanner(System.in); 
	  System.out.println("25WH5A0518"
	  		+ ""); 
	  System.out.print("Enter present Readings:"); 
	  present=sc.nextInt(); 
	  System.out.print("Enter old Readings:"); 
	  old=sc.nextInt(); 
	  current= present-old; 
	  if(current<=50) 
	   bill=current*50; 
	  else if(current<=100) 
	   bill=(current-50)*2+(50*1); 
	  else if(current<=200) 
	   bill=(current-100)*3+(50*2)+(50*1); 
	  else if(current<=400) 
	   bill=(current-200)*4+(100*3)+(50*2)+(50*1); 
	  else 
	   bill=(current-400)*5+(200*4)+(100*3)+(50*2)+(50*1); 
	  System.out.println("----Electricity Billing----"); 
	  System.out.println ("Old Reading:"+old); 
	  System.out.println ("Present"+ present); 
	  System.out.println ("Current:" +current); 
	  System.out.println("Bill:" +bill); 
	 } 
	} 