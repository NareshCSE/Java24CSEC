
public class ArrayMultiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a = {
	            {1, 2, 3},
	            {4, 5, 6}
	        };
	        int[][] b = {
	            {7, 8},
	            {9,10,},
	            {11,12}
	        };

	        int rowsA = a.length;
	        int columnA = a[0].length;
	        int columnB = b[0].length;

	        int[][] result = new int[rowsA][columnB];

	        
	        for (int i = 0; i < rowsA; i++) {
	            for (int j = 0; j < columnB; j++) {
	                for (int k = 0; k < columnA; k++) {
	                    result[i][j] += a[i][k] * b[k][j];
	                }
	            }
	        }

	        
	        System.out.println("Multiplication of matrices:");
	        for (int[] row : result) {
	            for (int value : row) {
	                System.out.print(value + " ");
	            }
	            System.out.println();
	        }
	    }
	}
	