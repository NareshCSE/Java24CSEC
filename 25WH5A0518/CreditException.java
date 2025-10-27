package javamid2;
class Creditsnotsufficientexception extends Exception{
	public   Creditsnotsufficientexception(int credits) { 
		super("the credits are less than the 50. current credits:",+credits);
	}

}
public class CreditException{
//public class Creditsnotsufficientexception{
	static void checkCredits(int credits) throws Creditsnotsufficientexception {
        if (credits < 50) {
            throw new Creditsnotsufficientexception(credits);
}
        else {
        	System.out.println("credits are sufficient("+credits+")");
        }
}
	static void Busticketbook(int credits) {
		System.out.println("processingg");
		try {
			checkCredits(credits);
			System.out.println("the reg booked  successfully");
			}
			catch(Creditsnotsufficientexception e)
		{
			System.out.println("reg failed:"+e.getMessage);
		}}
	static void examreg(int credits) {
		System.out.println("In Process");
		try {
			checkCredits(credits);
			System.out.println("the exam reg done sucess");
		}
		catch(Creditsnotsufficientexception e) {
			System.out.println("not yet registered:"+e.getMessage);
		}
	}
	static void studentapplication(int credits) {
		System.out.println("Student application Process");
	try {
		checkCredits(credits);
		System.out.println("Applied Successfully.");
	}
	catch(Creditsnotsufficientexception e)
	{
	 	System.out.println("application is pending:"+e.getMessage);
	}
	}
public static void main(String[] args) {
	 Busticketbook(40);
	examreg(70);
	studentapplication(35);
}}
	
	