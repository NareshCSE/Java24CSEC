package src;

public class DuplicateValuesInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1,1,2,3,3,4,5,6,6,7,8,8,9};
		System.out.println("Duplicate Values in the Array are: ");
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] == array[j]) {
				
					System.out.println(array[i]);
				}
			}
		}

	}

}
