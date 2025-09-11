package lab_assignments;
import java.util.Scanner;
public class Assignment_one {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Assignment 1:  JavaSE application to generate Electricity bill   (use if-else-if ladder)
		//inputs are old reading and current reading and generate the bill by following  slabs/ranges: Scan the inputs using Scanner class
		//0-50: Rs.1
		//50-100: Rs2
		//100-200: Rs.3
		//200-400: Rs.4
		//>400: Rs.5
		//example if the number of units are 120 then the consumption charge is (50*1)+(50*2)+(20*3)=Rs.210 
		Scanner read =new Scanner(System.in);
        System.out.println("Old reading: ");
        int oldread = read.nextInt();
        System.out.println("Current reading: ");
        int currentread = read.nextInt();
        int units = oldread - currentread;
        if(oldread>currentread){
            System.out.println("Error!");
        }
        int bill =0;
        if(units<=50){
            bill = units*1;
        }
        else if(units>50 && units<=100){
            bill = (units*1) + (units*2);
        }
        else if(units>100 && units<=200){
             bill = (units*1) + (units*2)+(units*3);
        }
        else if(units>200 && units<=400){
          bill = (units*1) + (units*2)+(units*3)+ (units*4);
        }
        else if(units>400){
        bill =(units*1) + (units*2)+(units*3)+ (units*4)+(units*5);
        }
     
        System.out.println("Total electricity bill: Rs." + bill);


	}

}
