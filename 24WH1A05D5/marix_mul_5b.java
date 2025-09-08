package practice;
import java.util.*;
public class matrix_mul {
	public static void main(String[] args) {
		int x,y,m,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter values of rows, columns of ar1");
		x = sc.nextInt();
		y = sc.nextInt();
		System.out.println("Enter values of rows, columns of ar2");
		m = sc.nextInt();
		n = sc.nextInt();
		int[][] ar1=new int[x][y];
		int[][] ar2=new int[m][n];
		if(y!=m)
			System.out.println("multiplication is not possible");
		else{
		 System.out.println("enter ar1 elements:");
		 for(int i = 0; i < x; i++) {
			for(int j = 0; j < y; j++)
			ar1[i][j]=sc.nextInt();
		 }
		 System.out.println("enter ar2 elements:");
		 for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++)
			ar2[i][j]=sc.nextInt();
		 }
		 int[][] result=new int[x][n];
		 for(int i = 0; i < x; i++) {
		 	for(int j = 0; j < n; j++) {
		  		result[i][j]=0;
				for(int k = 0; k < m; k++) {
					result[i][j]+=ar1[i][k]*ar2[k][j];
				}
		     }
		 }
		 System.out.println("Results: ");
		 for(int i = 0; i < x; i++) {
			for(int j = 0; j < n; j++) {
				System.out.print(result[i][j]+" ");
			}
			System.out.println();
		  }
		}
	}
}

