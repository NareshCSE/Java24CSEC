package e9;
import java.util.Scanner;
public class A1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double units, unitPrice;
		double slab1=0, slab2=0, slab3=0, slab4=0, slab5=0;
		// Program to generate electricity bill(using if-else-if ladder)
		// Take inputs - old reading, current reading
		// Generate bill per slab as given, by taking input using scanner class
		// 0-50: Rs.1
		// 50-100: Rs2
		// 100-200: Rs.3
		// 200-400: Rs.4
		// >400: Rs.5
		System.out.print("Enter the Old Reading: ");
		double oldReading=input.nextDouble();
		
		System.out.print("Enter the Currrent Reading: ");
		double currentReading=input.nextDouble();
		
		units=currentReading-oldReading;
		
		if(units<=50) {
			slab1 = units*1;
			System.out.print(slab1);
		}
		else if(units<=100){
			slab2 = (50*1) + ((units-50)*2);
			System.out.print(slab2);
		}
		else if(units<=200) {
			slab3 = (50*1) + (50*2) + ((units-100)*3);
			System.out.print(slab3);
		}
		else if(units<=400) {
			slab4 = (50*1) + (50*2) + (100*3) + ((units-200)*4);
			System.out.print(slab4);
		}
		else if(units>400) {
			slab5 = (50*1) + (50*2) + (100*3) + (200*4) + ((units-400)*5);
			System.out.print(slab5);
		}
	}
}
