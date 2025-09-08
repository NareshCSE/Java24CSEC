package javaD4;
import java.util.Scanner;

public class Assignment4a_pattern1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int a = scanner.nextInt();
        
        for(int i = 1; i <= a; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        scanner.close();		
	}
}
