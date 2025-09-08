package file.javac;

import java.util.*;
public class Arrayduplication {

public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int[] numbers = new int[5];
	int i,j;
	System.out.println("Enter the values:");
	for (i = 0; i < numbers.length; i++) {
		numbers[i] = sc.nextInt();
		}
	System.out.println("Duplicate values are:");
	  for (i = 0; i < numbers.length; i++) {
        for (j = i + 1; j < numbers.length; j++) {
		      if (numbers[i] == numbers[j]) {
		          System.out.print(numbers[j] + " ");
		      }
		      else
		      {
		    	  System.out.println("No duplicate values!");
		      }
	     }
	  }
	  sc.close();
   }
}

