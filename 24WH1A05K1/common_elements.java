package java_assignment;
import java.util.ArrayList;
		import java.util.List;
		public class common_elements {

		
		    public static void main(String[] args) {
		        String[] array1 = {"apple", "banana", "orange", "grape"};
		        String[] array2 = {"kiwi", "banana", "mango", "apple"};

		        List<String> commonElements = new ArrayList<>();

		        for (int i = 0; i < array1.length; i++) {
		            for (int j = 0; j < array2.length; j++) {
		                if (array1[i].equals(array2[j])) { // Use .equals() for string comparison
		                    commonElements.add(array1[i]);
		                    break; // Found a common element, move to the next element in array1
		                }
		            }
		        }
		        System.out.println("Common Elements: " + commonElements);
		    }
		}
