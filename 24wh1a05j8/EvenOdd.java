package ass1;
import java.util.Scanner;
public class EvenOdd {

	public static void main(String[] args) {
		int i,Osum=0,Esum=0;
		Scanner num= new Scanner(System.in);
		System.out.println("enter a number");
		int n= num.nextInt();
		for(i=1;i<=n;i++) {
			if(i%2==0) {
			 Esum=Esum+i;	
			}
			else
				Osum=Osum+i;
		}
		System.out.println(Esum);
		System.out.println(Osum);
		
		
		

	}

}
