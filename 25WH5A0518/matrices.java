package Arraya;

public class matrices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrixA = {{3,4,5},{5,8,4},{9,3,6}};
		int[][] matrixB = {{1,2,6},{5,6,3},{3,7,4}};
		int[][] matmul = new int[3][3];
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				for(int k=0;k<3;k++) {
				matmul[i][j] = matrixA[i][k] * matrixB[k][j];
				}
			}
		}
		System.out.println("the multiplication of matrixA and matrixB is");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print( matmul[i][j] +" ");
			}
			System.out.println(" ");
		}
 
	}

}
