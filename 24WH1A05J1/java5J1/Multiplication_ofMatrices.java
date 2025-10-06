package src;
import java.util.Scanner;
public class MultiplicationOfTwoMatrices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] array1 = new int[2][2];
		int[][] array2 = new int[2][2];
		int[][] resultArray = new int[2][2];
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the 4 elements of array1: ");
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				array1[i][j] = sc.nextInt();
			}
		}
		System.out.println("Enter the 4 elements of array2: ");
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				array2[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				resultArray[i][j] = 0;
				for (int k = 0; k < 2; k ++) {
					resultArray[i][j] += array1[i][k] * array2[k][j];
				}
			}
		}
		System.out.println("The resultant multiplication matrix is: ");
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print(resultArray[i][j] + " ");
			}
			System.out.println();
		}
		
		sc.close();

	}

}
