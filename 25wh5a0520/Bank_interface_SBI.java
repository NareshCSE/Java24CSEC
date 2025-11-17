package java_25wh5a0520;
import java.util.*;

interface Bank1{
    void createAccount(String name, int accNo, double initialDeposit);
    void creditAmount(double amount);
    void debitAmount(double amount);
    void transferAmount(Bank1 receiver, double amount);
    void miniStatement();
    double getRateOfInterest();
}

class SBI implements Bank1 {
    String name;
    int accNo;
    double balance;
    final double rateOfInterest = 6.5;

    public void createAccount(String name, int accNo, double initialDeposit) {
        this.name = name;
        this.accNo = accNo;
        this.balance = initialDeposit;
        System.out.println("SBI Account created successfully for " + name + " with A/c No: " + accNo);
    }

    public void creditAmount(double amount) {
        balance += amount;
        System.out.println("Credited ₹" + amount + " to SBI account. New Balance: ₹" + balance);
    }

    public void debitAmount(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Debited ₹" + amount + " from SBI account. New Balance: ₹" + balance);
        } else {
            System.out.println("Insufficient Balance in SBI account!");
        }
    }

    public void transferAmount(Bank1 receiver, double amount) {
        if (amount <= balance) {
            balance -= amount;
            receiver.creditAmount(amount);
            System.out.println("Transferred ₹" + amount + " from SBI to another account.");
        } else {
            System.out.println("Insufficient balance for transfer!");
        }
    }

    public void miniStatement() {
        System.out.println("\n--- SBI Mini Statement ---");
        System.out.println("Account Holder: " + name);
        System.out.println("Account Number: " + accNo);
        System.out.println("Balance: ₹" + balance);
        System.out.println("Rate of Interest: " + rateOfInterest + "%");
    }

    public double getRateOfInterest() {
        return rateOfInterest;
    }
}

class Axis implements Bank1 {
    String name;
    int accNo;
    double balance;
    final double rateOfInterest = 7.0;

    public void createAccount(String name, int accNo, double initialDeposit) {
        this.name = name;
        this.accNo = accNo;
        this.balance = initialDeposit;
        System.out.println("Axis Account created successfully for " + name + " with A/c No: " + accNo);
    }

    public void creditAmount(double amount) {
        balance += amount;
        System.out.println("Credited ₹" + amount + " to Axis account. New Balance: ₹" + balance);
    }

    public void debitAmount(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Debited ₹" + amount + " from Axis account. New Balance: ₹" + balance);
        } else {
            System.out.println("Insufficient Balance in Axis account!");
        }
    }

    public void transferAmount(Bank1 receiver, double amount) {
        if (amount <= balance) {
            balance -= amount;
            receiver.creditAmount(amount);
            System.out.println("Transferred ₹" + amount + " from Axis to another account.");
        } else {
            System.out.println("Insufficient balance for transfer!");
        }
    }

    public void miniStatement() {
        System.out.println("\n--- Axis Mini Statement ---");
        System.out.println("Account Holder: " + name);
        System.out.println("Account Number: " + accNo);
        System.out.println("Balance: ₹" + balance);
        System.out.println("Rate of Interest: " + rateOfInterest + "%");
    }

    public double getRateOfInterest() {
        return rateOfInterest;
    }
}

public class Bank_interface_SBI {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        Bank1 bank1 = new SBI();
	        bank1.createAccount("Ravi", 1001, 5000);
	        Bank1 bank2 = new Axis();
	        bank2.createAccount("Sneha", 2001, 8000);
	        bank1.creditAmount(1500);
	        bank1.debitAmount(1000);
	        bank1.miniStatement();
	        bank2.creditAmount(2000);
	        bank2.transferAmount(bank1, 1000);
	        bank2.miniStatement();

	        sc.close();
	}

}