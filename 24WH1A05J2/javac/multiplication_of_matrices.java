package javac;
		public class multiplication_of_matrices {
		    public static void main(String[] args) {
		       
		        int[][] matrix1 = {
		            {1, 2, 3},
		            {4, 5, 6},
		        };
		        int[][] matrix2 = {
		            {7, 8},
		            {9, 10},
		            {11, 12},
		        };

		        
		        int[][] result = multiplyMatrices(matrix1, matrix2);

		      
		        System.out.println("Result of matrix multiplication:");
		        for (int i = 0; i < result.length; i++) {
		            for (int j = 0; j < result[i].length; j++) {
		                System.out.print(result[i][j] + " ");
		            }
		            System.out.println();
		        }
		    }

		    public static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) {
		        int rowsMatrix1 = matrix1.length;
		        int colsMatrix1 = matrix1[0].length;
		        int rowsMatrix2 = matrix2.length;
		        int colsMatrix2 = matrix2[0].length;

		      
		        if (colsMatrix1 != rowsMatrix2) {
		            throw new IllegalArgumentException("Matrix dimensions are not compatible for multiplication");
		        }

		      
		        int[][] result = new int[rowsMatrix1][colsMatrix2];

		       
		        for (int i = 0; i < rowsMatrix1; i++) {
		            for (int j = 0; j < colsMatrix2; j++) {
		                for (int k = 0; k < colsMatrix1; k++) {
		                    result[i][j] += matrix1[i][k] * matrix2[k][j];
		                }
		            }
		        }

		        return result;
		    }
		}

	