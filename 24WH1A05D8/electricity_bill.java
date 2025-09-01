package Java_lab_exp;
import java.util.Scanner;
public class electricity_bill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("enter old reading");
		int oldReading=input.nextInt();
		System.out.println("enter curr reading");
		int currReading=input.nextInt();
		int units;
		units=currReading-oldReading;
		double totalbill;
		if(units<=50)
			totalbill=units*1;
		else if(units<=100)
			totalbill=(50*1)+(units-50)*2;
		else if(units<=200)
			totalbill=(50*1)+(50*2)+(units-100)*3;
		else if(units<=400)
			totalbill=(50*1)+(50*2)+(100*3)+(units-200)*4;
		else 
			totalbill=(50*1)+(50*2)+(100*3)+(200*4)+(units-400)*5;
		System.out.println("total units are : "+units);
		System.out.println("total bill is : "+totalbill);
	}

}
