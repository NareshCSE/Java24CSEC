package labprograms;

public class Multiplication_Matix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mat1[][]= {{1,2,3},{4,5,6},{7,8,9}};
		int mat2[][]= {{9,8,7},{6,5,4},{3,2,1}};
		 int r1 = mat1.length;
	     int c1 = mat1[0].length;
	     int r2 = mat2.length;
	     int c2 = mat2[0].length;

	     if (c1 != r2) {
	         System.out.println("Matrices cannot be multiplied.");
	         return;
	     }
	     int[][] product = new int[r1][c2];
	     for (int i = 0; i < r1; i++) {
	         for (int j = 0; j < c2; j++) {
	             for (int k = 0; k < c1; k++) { // Inner loop iterates through columns of first/rows of second
	                 product[i][j] += mat1[i][k] *mat2[k][j];
	             }
	         }
	     }
	     System.out.println("Multiplication of two matrices is:");
	     for (int[] row : product) {
	         for (int column : row) {
	             System.out.print(column + " ");
	         }
	         System.out.println();
	     }

				

	}

}
    