package myClass;
import java.util.Scanner; 
public class Sum_even_odd {

	public static void main(String[] args) {
		int esum=0,osum=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number of values: ");
		int n=scan.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter value : ");
			int number=scan.nextInt();
			if(number%2==0) {
				esum=esum+number;
			}
			else {
				osum=osum+number;
			}
		}
		System.out.println("esum= "+esum);
		System.out.println("osum= "+osum);
		scan.close();
	}
}