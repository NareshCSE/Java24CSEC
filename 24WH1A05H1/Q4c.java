package java_assignment;
import java.util.Scanner;
public class Q4c {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter no.of rows:");
		int n=scanner.nextInt();
		int i,j;
		for (i=1;i<=n;i++) {
            for (j=i;j<n;j++) {
                System.out.print("  ");
            }
            for(j=1;j<=(2*i-1);j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (i=n-1;i>=1;i--) {
            for (j=n;j>i;j--) {
                System.out.print("  ");
            }
            for (j=1;j<=(2*i-1);j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
	}
}
