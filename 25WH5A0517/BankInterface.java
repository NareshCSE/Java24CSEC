
package navya_25wh5a0517;
import java.util.Scanner;

//Interface with bank services
interface Bank5 {
void createAccount(String name, int accNo); // create account
void creditAmount(int accNo, double amount); // deposit money
void debitAmount(int accNo, double amount); // withdraw money
void transferAmount(int fromAcc, int toAcc, double amount); // transfer money
void miniStatement(int accNo); // show balance
double rateOfInterest(); // fixed rate of interest
}

//Implementation for SBI Bank
class SBI implements Bank5 {
String name;
int accNo;
double balance;

@Override

public void creditAmount(int accNo, double amount) {
if (this.accNo == accNo) {
balance += amount;
System.out.println("Amount credited: " + amount + ". New Balance: " + balance);
} else {
System.out.println("Account number mismatch.");
}
}
@Override
public void debitAmount(int accNo, double amount) {
if (this.accNo == accNo) {
if (amount > balance) {
System.out.println("Insufficient balance!");
} else {
balance -= amount;
System.out.println("Amount debited: " + amount + ". New Balance: " + balance);
}
} else {
System.out.println("Account number mismatch."); }}
@Override
public void transferAmount(int fromAcc, int toAcc, double amount) {
if (this.accNo == fromAcc) {
if (amount > balance) {
System.out.println("Insufficient balance to transfer!");
} else {
balance -= amount;
System.out.println("Transferred " + amount + " from account " + fromAcc + " to " +

toAcc);
}
} else {
System.out.println("Account number mismatch.");
}
} @Override
public void miniStatement(int accNo) {
if (this.accNo == accNo) {
System.out.println("Account No: " + accNo + ", Name: " + name + ", Balance: " +
balance);
} else {
System.out.println("Account number mismatch.");
}
}@Override
public double rateOfInterest() {
return 5.5; // fixed interest rate
}
@Override
public void createAccount(String name, int accNo) {
	// TODO Auto-generated method stub
	
}
}
//Implementation for Axis Bank
class Axis implements Bank5 {
String name;
int accNo;
double balance;

@Override
public void createAccount(String name, int accNo) {
this.name = name;
this.accNo = accNo;

this.balance = 0;

System.out.println("Axis Account created for " + name + " with account number " +
accNo);
} @Override
public void creditAmount(int accNo, double amount) {
if (this.accNo == accNo) {
balance += amount;
System.out.println("Amount credited: " + amount + ". New Balance: " + balance);
} else {
System.out.println("Account number mismatch.");
}
}@Override
public void debitAmount(int accNo, double amount) {
if (this.accNo == accNo) {
if (amount > balance) {
System.out.println("Insufficient balance!");
} else {
balance -= amount;
System.out.println("Amount debited: " + amount + ". New Balance: " + balance);
}
} else {
System.out.println("Account number mismatch."); }}
@Override
public void transferAmount(int fromAcc, int toAcc, double amount) {
if (this.accNo == fromAcc) {
if (amount > balance) {
System.out.println("Insufficient balance to transfer!");
} else {


balance -= amount;
System.out.println("Transferred " + amount + " from account " + fromAcc + " to " +
toAcc);
System.out.println("Remaining Balance: " + balance);
}
} else {
System.out.println("Account number mismatch.");
}
} @Override
public void miniStatement(int accNo) {
if (this.accNo == accNo) {
System.out.println("Account No: " + accNo + ", Name: " + name + ", Balance: " +
balance);
} else {
System.out.println("Account number mismatch.");
}
} 
@Override
public double rateOfInterest() {
return 6.0; // fixed interest rate
}}
public class BankInterface {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

Bank5 bank; // interface reference

System.out.println("Choose Bank: 1. SBI 2. Axis");
int choice = sc.nextInt();
sc.nextLine(); // consume leftover newline

if (choice == 1) {
bank = new SBI();
} else {
bank = new Axis();
} System.out.print("Enter your name: ");
String name = sc.nextLine();
System.out.print("Enter account number: ");
int accNo = sc.nextInt();
bank.createAccount(name, accNo);
bank.creditAmount(accNo, 5000);
bank.debitAmount(accNo, 2000);
bank.transferAmount(accNo, 999, 1000); // transfer to account 999 (just demo)
bank.miniStatement(accNo);
System.out.println("Rate of Interest: " + bank.rateOfInterest() + "%");
sc.close();}}


