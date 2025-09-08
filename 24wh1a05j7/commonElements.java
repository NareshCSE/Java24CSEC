package Assignment;
import java.util.Scanner;
public class commonElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner scanf = new Scanner(System.in);
      System.out.println("Enter the number of elements in array1 string :\n");
      int s1 = scanf.nextInt();
      scanf.nextLine();
      String[] arr1 = new String[s1];
      System.out.println("Enter elements:\n");
      for(int i = 0; i < s1 ; i++) {
    	  arr1[i] = scanf.nextLine();
      }
      
      System.out.println("Enter the number of elements in array2 string:\n");
      int s2 = scanf.nextInt();
      scanf.nextLine();
      String[] arr2 = new String[s2];
      System.out.println("Enter elements:\n");
      for(int j = 0; j < s2 ;j++) {
    	  arr2[j] = scanf.nextLine();
      }
      
      int maxSize = s1 < s2 ? s1:s2;
      String[] common = new String[maxSize];
      int val = 0;
      for(int i=0;i<s1;i++) {
   	   for(int j=0;j<s2;j++) {
   		   if(arr1[i].equals(arr2[j])) {
   			   int k =0;
   			   for(;k<val;k++) {
   				   if(common[k].equals(arr1[i])) {
   					   break;
   				   }
   			   }
   			   if(k==val) {
   				   common[val++]= arr1[i];
   			   }
   			   break;
   		   }
   	   }
      }
      
      System.out.println("Common Elements from both array strings are:");
      if(val == 0) {
    	  System.out.println("No common elements.");
      }
      else {
    	  for(int k = 0;k < val; k++) {
    		  System.out.print(common[k]+ " ");
    	  }
      }
      scanf.close();
	}

}
