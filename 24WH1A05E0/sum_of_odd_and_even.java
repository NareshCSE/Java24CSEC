package labprogramss;
 import java.util.Scanner;

public class Sum_of_even_and_odd {

	public static void main(String[] args) {
	

		Scanner sc = new Scanner(System.in);
	
		
			int evensum=0;
			int oddsum=0;
			for(int i=2;i<=10;i++) {
			if(i%2==0) {
				evensum+=i;
			}
			else
			{
				oddsum+=i;
			}
				
		}
			System.out.println(evensum);
			System.out.println(oddsum);
		}
		
		
	}	
