package duplicates;

public class Duplicatearray {
	

		public static void main(String[] args) {

			// TODO Auto-generated method stub

			



			        // Find Duplicate Values in an Integer Array 

			        System.out.println(" Find Duplicate Values ");

			        int[] intArray = {1, 5, 2, 3, 1, 7, 3, 8, 5};



			        boolean[] visited = new boolean[intArray.length];

			        for (int i = 0; i < intArray.length; i++) {

			            if (visited[i]) continue;

			            boolean isDuplicate = false;

			            for (int j = i + 1; j < intArray.length; j++) {

			                if (intArray[i] == intArray[j]) {

			                    isDuplicate = true;

			                    visited[j] = true; // mark duplicate

			                }

			            }

			            if (isDuplicate) {

			                System.out.println("Duplicate: " + intArray[i]);

			            }

			        }



			        //  Multiplication of Two Matrices 

			        System.out.println("\n Task B: Matrix Multiplication ");



			        int[][] matrix1 = {

			            {2, 4},

			            {3, 4}

			        };

			        int[][] matrix2 = {

			            {1, 2},

			            {1, 3}

			        };



			        int rows1 = matrix1.length;

			        int cols1 = matrix1[0].length;

			        int cols2 = matrix2[0].length;



			        int[][] result = new int[rows1][cols2];



			        // Matrix multiplication logic

			        for (int i = 0; i < rows1; i++) {

			            for (int j = 0; j < cols2; j++) {

			                for (int k = 0; k < cols1; k++) {

			                    result[i][j] += matrix1[i][k] * matrix2[k][j];

			                }

			            }

			        }



			        System.out.println("Result of matrix multiplication:");

			        for (int i = 0; i < rows1; i++) {

			            for (int j = 0; j < cols2; j++) {

			                System.out.print(result[i][j] + " ");

			            }

			            System.out.println();

			        }



			        //  Find Common Elements Between Two String Arrays

			        System.out.println("\nTask C: Find Common Elements ");



			        String[] array1 = {"apple", "banana", "cherry", "mango"};

			        String[] array2 = {"banana", "grape", "mango", "peach"};



			        for (int i = 0; i < array1.length; i++) {

			            for (int j = 0; j < array2.length; j++) {

			                if (array1[i].equals(array2[j])) {

			                    System.out.println("Common element: " + array1[i]);

			                    break; // Avoid printing the same match multiple times
			                }
			            }
			        }
		}
}

			                




