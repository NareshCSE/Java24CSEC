package javaprograms;

public class bankapplication_using_functions {

	int AccountCreation(String name,long aadhar,String pan)
	{
		
		System.out.println("the detail of customer");
		System.out.println("name:"+name);
		System.out.println("aadhar"+aadhar);
		System.out.println("pan:"+pan);
		System.out.println("Account created sucssfully");
		return 1234;
	}
	
	public static void main(String[] args) {
		String customer_name="siri";
		long aadhar_no=1234478934;
		String pan_card="XYN20HG";
		short account_no=AccountCreation(customer_name,aadhar_no,pan_card);

	}

}
