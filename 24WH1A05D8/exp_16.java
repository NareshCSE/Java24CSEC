package java_practice;
import java.util.Scanner;
class PinMisMatch extends Exception{
	public PinMisMatch(String message) {
		super(message);
	}
}
public class exp_16 {
	private static int validPin=3456;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter account holder name:");
		String accountHolder=sc.nextLine();
		int attempts=0;
		boolean access=false;
		while(attempts<3) {
			System.out.println("enter pin");
			int entered_pin=sc.nextInt();
			if(entered_pin==validPin) {
				System.out.println("pin is correct. Welcome "+accountHolder);
				access=true;
				break;
			}
			else {
				attempts++;
				try {
					throw new PinMisMatch("Inccorect pin. attemp"+attempts+" of 3");
				}catch(PinMisMatch e) {
					System.out.println(e.getMessage());
				}
			}
		}
		if(!access) {
			try {
				throw new PinMisMatch("Sorry..Your Account Has been Locked");
			}catch(PinMisMatch e) {
				System.out.println(e.getMessage());
			}
		}
	}

}
