package e9;

public class A5b {

    public static void main(String[] args) {
        int[][] a = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[][] b = {
            {9, 8, 7},
            {6, 5, 4},
            {3, 2, 1}
        };

        int[][] result = new int[3][3]; 

        
        for (int i = 0; i < 3; i++) {          
            for (int j = 0; j < 3; j++) {     
                for (int k = 0; k < 3; k++) {  
                    result[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        
        System.out.println("Multiplication of two 3x3 matrices:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}