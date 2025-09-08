package labprograms;
import java.util.Random;
import java.util.Scanner;

public class BankMenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter n value");
			int n = sc.nextInt();
			System.out.print("\n1.1. Account Creation \r\n"
					+ "2. Credit Amount  \r\n"
					+ "3. Debit Amount \r\n"
					+ "4. Mini statement/balance enquiry\r\n"
					+ "5. Transfer account\r\n"
					+ "6. Continue (y/n)\r\n"
					+ "");
			switch(n) {
			case 1: 
			int accountNum=accountCreation();
			System.out.println(accountNum);
			break;
			case 2: creditAmount();break;
			case 3: debitAmount();break;
			case 4: miniStatement();break;
			case 5:transferAccount();break;
			default:System.out.println("Invalid");break;
			}
			
		}

	}
	static int accountCreation() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Name:");
		String name=sc.next();
		System.out.println("Enter Aadhar number");
		int aadhar=sc.nextInt();
		System.out.println("Enter Pan number");
		int pan=sc.nextInt();
		System.out.println("Account has been Created Successfully");
		Random random=new Random();
		return random.nextInt(100, 2000);
		
	}
	static void creditAmount() {
		System.out.println("Amount has been credited");
	}
	static void debitAmount() {
		System.out.println("Amount has been debited");
	}
	static void miniStatement() {
		System.out.println("Mini statement is created");
	}
	static void transferAccount() {
		System.out.println("Amount is transferred");
	}
	
	

}
