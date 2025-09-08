package Assignment;
import java.util.Scanner;
public class duplicatesInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner scanf =new Scanner(System.in);
       
       System.out.print("Enter size of array 1 :\n");
       int n = scanf.nextInt();
       int[] a = new int[n];
       System.out.println("Enter array 1 elements:\n");
       for(int i=0;i<n;i++) {
    	   a[i] = scanf.nextInt();
       }
       
       System.out.print("Enter size of array 2 :\n");
       int x = scanf.nextInt();
       int[] b = new int[x];
       System.out.println("Enter array 2 elements:\n");
       for(int k = 0;k<x;k++) {
    	   b[k] = scanf.nextInt();
       }
       
       int maxSize = n < x ? n:x;
       int[] duplicates = new int[maxSize];
       int count = 0;
       
       for(int i=0;i<n;i++) {
    	   for(int j=0;j<x;j++) {
    		   if(a[i]==b[j]) {
    			   int k =0;
    			   for(;k<count;k++) {
    				   if(duplicates[k]==a[i]) {
    					   break;
    				   }
    			   }
    			   if(k==count) {
    				   duplicates[count++]= a[i];
    			   }
    			   break;
    		   }
    	   }
       }
       System.out.println("Duplicates:\n");
       if(count == 0) {
    	   System.out.println("No Duplicates from array 1 and array 2.\n");
       }else {
       for(int i =0;i<count;i++) {
    	   System.out.print(duplicates[i]+" ");
       }
       }
      scanf.close(); 
	}

}
