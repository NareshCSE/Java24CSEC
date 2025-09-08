package javaprograms;

public class removeduplicates {
	
	    public static void main(String[] args) {
	        int[] array = {1, 5, 2, 1, 3, 2, 4, 5};
	        int length = array.length;

	        // Temporary array to hold unique elements
	        int[] temp = new int[length];
	        int newLength = 0;

	        for (int i = 0; i < length; i++) {
	            boolean isDuplicate = false;

	            // Check if array[i] is already in temp[]
	            for (int j = 0; j < newLength; j++) {
	                if (array[i] == temp[j]) {
	                    isDuplicate = true;
	                    break;
	                }
	            }

	            // If not duplicate, add to temp[]
	            if (!isDuplicate) {
	                temp[newLength++] = array[i];
	            }
	        }

	        // Copy unique elements to final result array
	        int[] result = Arrays.copyOf(temp, newLength);

	        // Print result
	        System.out.println("Array after removing duplicates: " + Arrays.toString(result));
	    
	}


}
