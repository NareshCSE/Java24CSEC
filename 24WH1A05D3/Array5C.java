package javaAssignment;


import java.util.HashSet;
import java.util.Set;

public class Array5C {

	public static void main(String[] args) {
		
		
				// 5c)Java program to find common elements between two arrays (string values)
				 String[] array1 = {"apple", "mango", "cherry", "date"};
			        String[] array2 = {"mango", "date", "fig", "grape"};
			        findCommonElements(array1, array2);
			    }
			    public static void findCommonElements(String[] arr1, String[] arr2) {
			        Set<String> set1 = new HashSet<>();
			        Set<String> common = new HashSet<>();
		       // Add all elements of first array to set1
			        for (String s : arr1) {
			            set1.add(s);
			        }
			        // Check which elements in arr2 are also in set1
			        for (String s : arr2) {
			            if (set1.contains(s)) {
			                common.add(s);
			            }
			        }
			        if (common.isEmpty()) {
			            System.out.println("No common elements found.");
			        } else {
			            System.out.println("Common elements are: " + common);

			        }
			}
		


	}

