package java_lab_exp;
import java.util.*;
public class exp_5c {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    String[] str1 = new String[3];
	    String[] str2 =new String[3];
	    Scanner sc = new Scanner(System.in); 
	    System.out.println("Enter any string1 elements:");
        for(int i=0; i<str1.length; i++) {
        	str1[i] = sc.next();
	}
        System.out.println("Enter any string2 element:");
        for(int j=0; j<str2.length; j++) {
        	str2[j] = sc.next();
}
        System.out.println("The common elements are: ");
        for(int i=0; i<str1.length; i++) {
        	for(int j=0; j<str2.length; j++ ) {
        		if(str1[i].equals(str2[j])) {
        		    System.out.print(str2[j]+" ");
        	}
        	}
        	}
        	}
        }
	








				
