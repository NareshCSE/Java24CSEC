package java_assignment;

import java.util.HashSet;
public class array {

	public static void main(String[] args) {
		
		        int[] arr = {1, 2, 3, 4, 2, 7, 8, 8, 3};
		        HashSet<Integer> seen = new HashSet<>();
		        HashSet<Integer> duplicates = new HashSet<>();

		        for (int num : arr) {
		            if (!seen.add(num)) { // If add returns false, element already exists
		                duplicates.add(num);
		            }
		        }

		        System.out.println("Duplicate elements are: " + duplicates);
		    }
		}
