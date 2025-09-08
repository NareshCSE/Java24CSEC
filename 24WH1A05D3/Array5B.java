package javaAssignment;

public class Array5B {

	public static void main(String[] args) {
		 int[][] matrixA = {{1, 2, 3},{4, 5, 6}};
	        int[][] matrixB = { {7, 8, 9},{10, 11, 12}, { 1, 2, 3}};

	        // Dimensions
	        int rowsA = matrixA.length;
	        int colsA = matrixA[0].length;
	        int rowsB = matrixB.length;
	        int colsB = matrixB[0].length;
	        if (colsA != rowsB) {
	            System.out.println("Matrix multiplication not possible. Columns of A must equal rows of B.");
	            return;
	        }

	        int[][] result = new int[rowsA][colsB];


	        for (int i = 0; i < rowsA; i++) {         
	            for (int j = 0; j < colsB; j++) {     
	                for (int k = 0; k < colsA; k++) { 
	                    result[i][j] += matrixA[i][k] * matrixB[k][j];
	               }
	            }
	        }
	        System.out.println("Result of multiplication:");
	        for (int i = 0; i < rowsA; i++) {
	            for (int j = 0; j < colsB; j++) {
	                System.out.print(result[i][j] + " ");
	            }
	            System.out.println();
	        }
	}

}
