package java_exps;
import java.util.Scanner;
public class bank_application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner input = new Scanner(System.in);
       int choice;
       char ch;
       String name;
	   int pan_no;
	   int aadhar_no;
       int credit_amount=0, debit_amount=0;
       int balance=0;
       int account1, account2;
       int amount =0;
       do {
    	   System.out.println("MENU CARD");
    	   System.out.println("1.Account Creation\n2.Credit Amount\n3.Debit Aomunt\n4.Mini Statement/Balance Enquiry\n5.Transfer Account");
    	   System.out.println("Enter your choice");
    	   choice = input.nextInt();
    	   switch(choice) {
    	   case 1:
    		   System.out.println("Enter Customer Details such as Name, Aadhar_no, Pan_no");
    		   name = input.next();
    		   aadhar_no = input.nextInt();
    		   pan_no = input.nextInt(); 
    		   System.out.println("Name of the Customer : "+name+"\n"+"aadhar_no :"+aadhar_no+"\n"+"pan_no : "+pan_no);
    		   break;
    	   case 2:
    		   System.out.println("Enter the Amount to be Credited");
    		   credit_amount = input.nextInt();
    		   balance = balance + credit_amount;
    		   System.out.println("The Amount Credited in your Account is :" +credit_amount);
    		   break;
    	   case 3:
    		   System.out.println("The the Amount to be Debited :");
    		   debit_amount = input.nextInt();
    		   balance = balance - debit_amount;
    		   System.out.println("The Amount Debited from your Account is :" +debit_amount);
    		   break;
    	   case 4:
    		   System.out.println("Mini Statement");
    		   System.out.println("Balance Amount in the Account :" +balance);
    		   break;
    	   case 5:
    		   System.out.println("Enter the Account.no from which you want to transfer money :");
    		   account1=input.nextInt();
    		   System.out.println("Enter the Account.no from which you want to transfer money :");
    		   account2=input.nextInt();  
    		   System.out.println("Enter the Amount");
    		   amount=input.nextInt();
    		   System.out.println(amount+"is transfered from the account"+account1+"to the account"+account2);
    		   break;
    		   default:
    			   System.out.println("INVALID ONE");
}
    	   System.out.println("Enter 'c' to continue");
    	   ch = input.next().charAt(0);
       }
       while(ch=='c');
       input.close();
	}
}




  
                

              
