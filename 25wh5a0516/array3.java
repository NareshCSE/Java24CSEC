package assignment;

public class array3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        String[] array1 = {"apple", "banana", "cherry", "mango"};
		        String[] array2 = {"grape", "banana", "apple", "kiwi"};

		        System.out.println("Common elements:");

		        for (int i = 0; i < array1.length; i++) {
		            for (int j = 0; j < array2.length; j++) {
		                if (array1[i].equals(array2[j])) {
		                    System.out.println(array1[i]);
		                    break; 
		                }
		            }
		        }
		    }
		}

