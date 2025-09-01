package Java_lab_exp;
import java.util.Scanner;
public class sumof_even_odd_integers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner input=new Scanner(System.in);
			int sumeven=0,sumodd=0,a;
			System.out.println("enter the set of integers");
			for(int i=0;i<10;i++){
				a=input.nextInt();
				if(a%2==0)
					sumeven=sumeven+a;
				else
					sumodd+=a;
				}
			System.out.println("sum of even integers is: "+sumeven);
			System.out.println("sum of odd integers is: "+sumodd);
	}
}
