package javaAssignment;



import java.util.HashSet;
import java.util.Set;

public class Array5A {

	public static void main(String[] args) {
		

		
		        // a) Find duplicate values in an array of integer values
		        int[] arr = {1, 2, 3, 1, 2, 3, 4, 5, 6};

		        findDuplicates(arr);
		    }

		    public static void findDuplicates(int[] arr) {
		        Set<Integer> seen = new HashSet<>();
		        Set<Integer> duplicates = new HashSet<>();

		        for (int num : arr) {
		            if (!seen.add(num)) {
		                duplicates.add(num);
		            }
		        }

		        if (duplicates.isEmpty()) {
		            System.out.println("No duplicates found.");
		        } else {
		            System.out.println("Duplicate values are: " + duplicates);
		        }
		    }

	}


