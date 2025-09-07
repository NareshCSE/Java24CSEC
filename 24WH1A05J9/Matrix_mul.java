package myClass;
import java.util.*;
public class Matrix_mul {

	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in)){;
		int m,n,i,j,k,p,q;
		System.out.print("Enter the number of elements in first matrix(m n): ");
		m=sc.nextInt();
		n=sc.nextInt();
		int[][] a=new int[m][n];
		System.out.printf("Enter the %d values in the  first matrix: ",m*n);
		for(i=0;i<m;i++) {
			for(j=0;j<n;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		System.out.print("Enter the number of elements in first matrix(p q): ");
		p=sc.nextInt();
		q=sc.nextInt();
		int [][] b=new int[p][q];
		System.out.printf("Enter the %d values in the second matrix: ",p*q);
		for(i=0;i<p;i++) {
			for(j=0;j<q;j++) {
				b[i][j]=sc.nextInt();
			}
		}
		if(n!=p) { 
			System.out.println("Matrix multiplication is not possible");
		}
		else {
			int [][] c= new int[m][q];
			for(i=0;i<m;i++) {
				for(j=0;j<q;j++) {
					 c[i][j] = 0;
                     for (k = 0; k < n; k++) {
                         c[i][j] += a[i][k] * b[k][j];
				}
			}
		}
		
		System.out.println("The resultant matrix is:");
		for(i=0;i<m;i++) {
			for(j=0;j<q;j++) {
				System.out.printf("%d ",c[i][j]);
			}
			System.out.print("\n");

		}

	}

}
}
}
