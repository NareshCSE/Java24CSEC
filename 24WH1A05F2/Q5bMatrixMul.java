package java_lab_exp;

public class Q5bMatrixMul {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[][] A = { {1,2}, {3,4} };
	        int[][] B = { {5,6}, {7,8} };
	        int[][] C = new int[2][2]; // result matrix

	        for (int i = 0; i < 2; i++) {
	            for (int j = 0; j < 2; j++) {
	                C[i][j] = 0;
	                for (int k = 0; k < 2; k++) {
	                    C[i][j] += A[i][k] * B[k][j];
	                }
	            }
	        }
            System.out.println("Result:");
	        for (int i = 0; i < 2; i++) {
	            for (int j = 0; j < 2; j++) {
	                System.out.print(C[i][j] + " ");
	            }
	            System.out.println();
	        }
	}

}
