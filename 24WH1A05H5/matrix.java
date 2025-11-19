package assignment;

public class matrix {
	public static void main(String[] args) {
		int[][] A = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int[][] B = { { 1, 7, 8 }, { 2, 9, 10 }, { 3, 11, 12 } };
		int rowsA = A.length;
		int colsA = A[0].length;
		int rowsB = B.length;
		int colsB = B[0].length;
		if (colsA != rowsB) {
		 System.out.println("Cannot multiply the matrices");
			return;
		}
		int[][] result = new int[rowsA][colsB];
		for (int i = 0; i < rowsA; i++) {
			for (int j = 0; j < colsB; j++) {
				for (int k = 0; k < colsA; k++) {
					result[i][j] += A[i][k] * B[k][j];
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
