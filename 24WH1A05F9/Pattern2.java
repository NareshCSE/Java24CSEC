package labprograms;
import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				int i,j;
				Scanner scanner=new Scanner(System.in);
				System.out.println("Enter n value");
				int n = scanner.nextInt();     
				for (i=1;i<=n;i++) {
					for (j=1;j<=(n-i);j++) {
						System.out.print(" ");
					}
					for (j=1;j<=i;j++) {
					System.out.print("*");
					}
					System.out.println();
				}
				}

				}


	
