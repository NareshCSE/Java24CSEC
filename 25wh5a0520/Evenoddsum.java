package java_25wh5a0520;
import java.util.*;
public class Evenoddsum {

	public static void main(String[] args) { 
			  int n,esum=0,osum=0,i,ele; 
			  Scanner sc =new Scanner(System.in);
			  System.out.print("Enter number:"); 
			  n=sc.nextInt(); 
			  System.out.println("Enter "+ n +" numbers:"); 
			  for(i=0;i<n;i++) { 
			   ele=sc.nextInt(); 
			   if(ele%2==0) 
			    esum+=ele; 
			   else 
			    osum+=ele; 
			  } 
			  System.out.println("Sum of even elements:"+esum); 
			  System.out.println("Sum of odd elements:"+osum); 

	}

}
