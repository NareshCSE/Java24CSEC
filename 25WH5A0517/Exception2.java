package sampleprograms;

import java.util.Scanner;

class pinMisMatch extends Exception{
	public pinMisMatch() {
	System.out.println("sorry..your Account has been locked");
	}
}
class Navya{
	void pinvalidator(int pinNo,String name) throws pinMisMatch {
		int i=0;
			while( i<3) {
				Scanner sc=new Scanner(System.in);
				System.out.println( "Enter your pin");
				int pin=sc.nextInt();
				if(pin==pinNo) {
					System.out.println("your acc name is:"+name+"your acc pin is:"+pinNo);
					break;
				}
				
				i++;
			}
	throw new pinMisMatch();
	}
}
public class Exception2 extends Navya {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your name:");
		String name=sc.next();
		int pinNo=456;
		try {
		Navya obj=new Navya();
		obj.pinvalidator(pinNo, name);
		}
		catch(pinMisMatch e) {
			e.printStackTrace();
		}
		sc.close();

	}

}
