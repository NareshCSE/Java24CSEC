package ass1;
import java.util.Scanner;
public class pattern {
	public static void main(String[] args) {
	int n,i,j;
	Scanner num= new Scanner(System.in);
	   n=num.nextInt();
	   for(i=1;i<=n;i++) {
		   for(j=1;j<=i;j++) {
			   System.out.print("*\t");
		   }
		   System.out.println("\n");
		  
	   }
	num.close();
	
	}
}
