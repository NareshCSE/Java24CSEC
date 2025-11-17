package sathvika_25wh5a0518;
import java.util.*; 
public class MultiplicationMatrix { 
  public static void main(String[] args) { 
int r1, c1, c2, i, j, k; 
Scanner sc = new Scanner(System.in); 
System.out.print("Enter rows of first matrix: "); 
r1 = sc.nextInt(); 
System.out.print("Enter columns of first matrix: "); 
c1 = sc.nextInt(); 
System.out.print("Enter columns of second matrix: "); 
c2 = sc.nextInt(); 

int[][] a = new int[r1][c1]; 
System.out.println("Enter elements of first matrix:"); 
for (i = 0; i < r1; i++) { 
  for (j = 0; j < c1; j++) a[i][j] = sc.nextInt(); 
} 
int[][] b = new int[c1][c2]; 
System.out.println("Enter elements of second matrix:"); 
for (i = 0; i < c2; i++) { 
  for (j = 0; j < c2; j++) { 
    b[i][j] = sc.nextInt(); 
  } 
} 
int[][] res = new int[r1][c2]; 
for (i = 0; i < r1; i++) { 
  for (j = 0; j < c2; j++) { 
    for (k = 0; k < c1; k++)  
      res[i][j] += a[i][k] * b[k][j]; 
  } 
} 
System.out.println("ResultMatrix:"); 
for (i = 0; i < r1; i++) { 
  for (j = 0; j < c2; j++)  
    System.out.print(res[i][j] + " "); 
  System.out.println(); 
} 
} 
} 