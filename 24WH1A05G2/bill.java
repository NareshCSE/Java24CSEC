package week3;
import java.util.Scanner;

public class bill {

	public static void main(String[] args) {
		int charge=0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter old reading: ");
		int oreading = sc.nextInt();
		
		System.out.print("Enter current reading: ");
		int creading = sc.nextInt();
		
		int units = creading - oreading;
		if (units <= 50) 
		{
		    charge = units * 1;
		}
		else if (units <= 100)
		{
			charge = (50 * 1) + ((units - 50) *2);
			
		}
		else if (units <= 200)
		{
			charge = (50 * 1) + (50 * 2) + ((units - 100) * 3);
		}
		else if (units <= 400)
		{
			charge = (50 * 1) + (50 * 2) + (100 * 3) + ((units - 200) * 4);
		}
		else
		{
			charge = (50 * 1) + (50 * 2) + (100 * 3) + (200 * 4) + ((units - 400) * 5);
		}
		System.out.println("Electricity Bill Summary");
        System.out.println("Old Reading     : " + oreading);
        System.out.println("Current Reading : " + creading);
        System.out.println("Units Consumed  : " + units);
        System.out.println("Total Charge    : ₹" + charge);

        sc.close();


	}

}
