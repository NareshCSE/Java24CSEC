package ass1;
import java.util.Scanner;
public class Pattern2 {
	public static void main(String[] args) {
	int n,i,j,k;
	Scanner num= new Scanner(System.in);
	   n=num.nextInt();
	for(i=1;i<=n;i++) {
			for(k=n;k>i;k--) {
			System.out.print("\t");
			}
			for(j=1;j<=i;j++) {
			System.out.print("*\t");
		}
		System.out.println("\n");
	}
	num.close();
	
	}
}
