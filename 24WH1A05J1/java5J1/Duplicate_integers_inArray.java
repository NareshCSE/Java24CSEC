package java5J1;
import java.util.Scanner;
import java.util.HashSet;
import java.util.ArrayList;
public class Duplicate_integers_inArray {
	public static void main (String[] args) {
		ArrayList<Integer> array = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		int n, element; // number of elements in the array and the value of the element
		System.out.println("Enter the no.of elements in the array:");
		n = sc.nextInt();
		for (int i = 0; i < n; i ++) {
			System.out.println("Enter element " + (i + 1) + ":");
			element = sc.nextInt();
			array.add(element);
		}
		HashSet<Integer> dupArray = new HashSet<>();
		HashSet<Integer> seen = new HashSet<>();
		for (int num : array) {
			if(seen.contains(num)) {
				dupArray.add(num);
			} else {
				seen.add(num);
			}			
		}
		System.out.println("The duplicate elements present in the given array are:");
		for (int dup : dupArray) {
			System.out.println(dup);
		}	
		sc.close();
	}
}
