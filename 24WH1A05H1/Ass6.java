package java_assignment;
import java.util.Scanner;

public class Ass6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice;
		String aadhar;
		int pan=0;
		int accno=0;int cre;int deb;int bal=0;
		String name="";
		Scanner sc=new Scanner(System.in);
		System.out.println("BANK APPLICATION\n1. ACCOUNT CREATION\n2. CREDIT AMOUNT\n3. DEBIT AMOUNT\n4. MINI STATEMENT\n5. TRANSFER ACCOUNT\n6. CONTINUE (Y/N)");
        while (true) {
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice){
                case 1: 
                    System.out.println("Enter your Name: ");
                    name = sc.nextLine();
                    System.out.println("Enter your Aadhar Number: ");
                    aadhar = sc.nextLine();
                    System.out.println("Enter your Pan Number: ");
                    pan = sc.nextInt();
                    System.out.println("Account Created Successfully!");
                    System.out.println("Name: " + name + ", Aadhar Number: " + aadhar + ", Pan Number: " + pan);
                    break;
                case 2: 
                    System.out.println("Enter account number: ");
                    accno = sc.nextInt();

                    System.out.println("Enter the amount you want to credit: ");

                    cre = sc.nextInt();

                    bal += cre;

                    System.out.println("Amount credited successfully. New Balance is: " + bal);

                    break;

                case 3: 

                    System.out.println("Enter account number: ");

                    accno = sc.nextInt();

                    System.out.println("Enter the amount you want to debit: ");

                    deb = sc.nextInt();

                    if (bal >= deb) {

                        bal -= deb;

                        System.out.println("Amount debited successfully. New Balance is: " + bal);

                    }

                    else {

                        System.out.println("Insufficient Balance.");

                    }

                    break;

                case 4: 

                    System.out.println("MINI STATEMENT");

                    System.out.println("Account Holder: " + name);

                    System.out.println("Account Number: " + accno);

                    System.out.println("Balance is: " + bal);

                    break;

                case 5: 

                    System.out.println("Enter your Account number: ");

                    int fromAccno = sc.nextInt();

                    System.out.println("Enter the recipient Account number: ");

                    int toAccno = sc.nextInt();

                    System.out.println("Enter the amount to transfer: ");

                    int transferAmount = sc.nextInt();

                    if (bal >= transferAmount) {

                        bal -= transferAmount;

                        System.out.println("Transfer successful. Amount transferred: " + transferAmount);

                        System.out.println("New Balance: " + bal);

                    }

                    else {

                        System.out.println("Insufficient Balance for transfer.");

                    }

                    break;

                case 6: 

                    System.out.println("Do you want to continue? (Y/N): ");

                    char continueChoice = sc.next().charAt(0);

                    if (continueChoice == 'N' || continueChoice == 'n') {

                        sc.close(); 

                        return; 
                    }
                    break;

                default:

                    System.out.println("Invalid choice! Please try again.");

            }

            System.out.println("\nBANK APPLICATION\n1. ACCOUNT CREATION\n2. CREDIT AMOUNT\n3. DEBIT AMOUNT\n4. MINI STATEMENT\n5. TRANSFER ACCOUNT\n6. CONTINUE (Y/N)");
	}

}
}
