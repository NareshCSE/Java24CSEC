package labexperiments;


import java.util.Scanner;
public class ElectricityBill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read = new Scanner(System.in);
		System.out.println("Enter Previous reading");
		double previous_reading = read.nextDouble();
		System.out.println("Enter current reading");
		double current_reading = read.nextDouble();
		double total_consumption = current_reading - previous_reading;
		System.out.println("total consumption:"+ total_consumption+"units");
		
		double billAmount = 0;

        if (total_consumption <= 50) {
            billAmount = total_consumption * 1;
        } else if (total_consumption <= 100) {
            billAmount = 50 * 1 + (total_consumption - 50) * 2;
        } else if (total_consumption <= 200) {
            billAmount = 50 * 1 + 50 * 2 + (total_consumption - 100) * 3;
        } else if (total_consumption <= 400) {
            billAmount = 50 * 1 + 50 * 2 + 100 * 3 + (total_consumption - 200) * 4;
        } else {
            billAmount = 50 * 1 + 50 * 2 + 100 * 3 + 200 * 4 + (total_consumption - 400) * 5;
        }

        System.out.println("Total Electricity Bill: Rs. " + billAmount);

        read.close();	

	}
}
