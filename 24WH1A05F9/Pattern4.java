package labprograms;
import java.util.Scanner;

public class Pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n value");
        int n=sc.nextInt();
        int i,j;
		for(i=1;i<=n;i++) {
	        for (j=1;j<=n-i;j++) {
	            System.out.print(" ");
	        }
	        for(j=1;j<=i;j++) {
	            System.out.print(j);
	        }
	        for(j=i-1;j>=1;j--) {
	            System.out.print(j);
	        }
	        System.out.println();
	    }

        	
        
        
	}

}
