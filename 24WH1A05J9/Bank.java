package myClass;
import java.util.*;
public class Bank {
	public static void main(String[] args) {
	try(Scanner sc=new Scanner (System.in)){
		int balance=0;
		boolean loop=true;
		while(loop) {
			System.out.println("   ---MENU---");
			System.out.println("1.Create an account\n2.Credit amount\n3.Debit amount\n4.Balance enquiry\n5.Transfer account\n6.Continue(Y/N)");
			System.out.print("Enter your choice: ");
		    int choice=sc.nextInt();
		switch(choice) {
		case 1: System.out.print("Enter your name: ");
		        String name=sc.nextLine();
		        sc.nextLine();
		        System.out.print("Enter your aadhar number: ");
			    long aadhar_number=sc.nextLong();
			    System.out.print("Enter your PAN number: ");
			    long PAN=sc.nextLong();
			    System.out.println("Account created successfully!!");
			    break;
		case 2: System.out.print("Enter your account number : ");
		        long account_number=sc.nextLong();
		        sc.nextLine();
		        System.out.print("Enter amount to be credited: ");
		        int credit_amount=sc.nextInt();
		        sc.nextLine();
		        balance=balance+credit_amount;
		        System.out.printf("Balance: %d\n",balance);
		        System.out.println("Amount credited successfully!!");
		        break;
		case 3: System.out.print("Enter your account number: ");
		        account_number=sc.nextLong();
		        sc.nextLine();
		        System.out.print("Enter amount to be debited: ");
		        int debit_amount=sc.nextInt();
		        sc.nextLine();
		        balance=balance-debit_amount;
		        System.out.printf("Balance: %d\n",balance);
		        System.out.println("Amount debited successfully!!");
		        break;
		case 4: System.out.print("Enter your account number : ");
		        account_number=sc.nextLong();
		        sc.nextLine();
		        System.out.printf("Your account balance is : %d\n",balance);
		        break;
		case 5: System.out.print("From account number : ");
		        long from_account=sc.nextLong();
		        System.out.print("To account number: ");
		        long to_account=sc.nextLong();
		        System.out.print("Enter amount : ");
		        int amount=sc.nextInt();
		        System.out.print("Amount transferred successfully!!\n");
		        break;
		case 6: System.out.print("Continue(y/n): ");
		        String a= sc.next();
		        if(a .equals("y")) {
		        	continue;
		        }
		        else {
		        System.out.print("Exited successfully..");
		        System.exit(0);break;
		        }
		default:System.out.print("Invalid choice");
		        }
}
}
}
}