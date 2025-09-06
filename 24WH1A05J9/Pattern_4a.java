package myClass;
import java.util.Scanner;
public class Pattern_4a{
	public static void main(String[] args) {
		int n,i,j;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter n value: ");
		n=sc.nextInt();
		for(i=1;i<=n;i++){
	        for(j=1;j<=i;j++){
	            System.out.print("*");
	        }
	        System.out.print("\n");
	    }
	}
}
