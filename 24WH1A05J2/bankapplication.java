package vaishnavi;
import java.util.Scanner;
interface Bank {
 void createAccount();
 void deposit();
 void withdraw();
 void checkBalance();
 void showBankInfo();
}

class SBI implements Bank {
 Scanner scanner = new Scanner(System.in);
 String accountNumber = "";
 String customerName = "";
 double balance = 0;
 boolean accountCreated = false;
 
 public void createAccount() {
     System.out.println("\n=== SBI Account Creation ===");
     System.out.print("Enter Customer Name: ");
     customerName = scanner.nextLine();
     System.out.print("Enter Aadhar Number: ");
     String aadhar = scanner.nextLine();
     System.out.print("Enter PAN Number: ");
     String pan = scanner.nextLine();
     
     accountNumber = "SBI12345";
     balance = 0;
     accountCreated = true;
     
     System.out.println(" Account Created Successfully!");
     System.out.println("Account Number: " + accountNumber);
     System.out.println("Customer Name: " + customerName);
 }
 
 public void deposit() {
     if (!accountCreated) {
         System.out.println(" Please create account first!");
         return;
     }
     
     System.out.println("\n=== SBI Deposit ===");
     System.out.print("Enter amount to deposit: ");
     double amount = scanner.nextDouble();
     scanner.nextLine();
     
     if (amount > 0) {
         balance += amount;
         System.out.println(" Deposit Successful!");
         System.out.println("New Balance: " + balance);
     } else {
         System.out.println(" Invalid amount!");
     }
 }
 
 public void withdraw() {
     if (!accountCreated) {
         System.out.println(" Please create account first!");
         return;
     }
     
     System.out.println("\n=== SBI Withdraw ===");
     System.out.print("Enter amount to withdraw: ");
     double amount = scanner.nextDouble();
     scanner.nextLine();
     
     if (amount > 0 && amount <= balance) {
         balance -= amount;
         System.out.println(" Withdrawal Successful!");
         System.out.println("New Balance: " + balance);
     } else {
         System.out.println(" Invalid amount or insufficient balance!");
     }
 }
 
 public void checkBalance() {
     if (!accountCreated) {
         System.out.println(" Please create account first!");
         return;
     }
     
     System.out.println("\n=== SBI Balance ===");
     System.out.println("Account Number: " + accountNumber);
     System.out.println("Customer Name: " + customerName);
     System.out.println("Current Balance: " + balance);
 }
 
 public void showBankInfo() {
     System.out.println("\n=== SBI Bank Information ===");
     System.out.println("Bank Name: State Bank of India");
     System.out.println("Interest Rate: 4.0%");
     System.out.println("Headquarters: Mumbai");
 }
}

class Axis implements Bank {
 Scanner scanner = new Scanner(System.in);
 String accountNumber = "";
 String customerName = "";
 double balance = 0;
 boolean accountCreated = false;
 
 public void createAccount() {
     System.out.println("\n=== Axis Bank Account Creation ===");
     System.out.print("Enter Customer Name: ");
     customerName = scanner.nextLine();
     System.out.print("Enter Aadhar Number: ");
     String aadhar = scanner.nextLine();
     System.out.print("Enter PAN Number: ");
     String pan = scanner.nextLine();
     
     accountNumber = "AXIS67890";
     balance = 0;
     accountCreated = true;
     
     System.out.println(" Account Created Successfully!");
     System.out.println("Account Number: " + accountNumber);
     System.out.println("Customer Name: " + customerName);
 }
 
 public void deposit() {
     if (!accountCreated) {
         System.out.println(" Please create account first!");
         return;
     }
     
     System.out.println("\n=== Axis Bank Deposit ===");
     System.out.print("Enter amount to deposit: ");
     double amount = scanner.nextDouble();
     scanner.nextLine();
     
     if (amount > 0) {
         balance += amount;
         System.out.println(" Deposit Successful!");
         System.out.println("New Balance: " + balance);
     } else {
         System.out.println(" Invalid amount!");
     }
 }
 
 public void withdraw() {
     if (!accountCreated) {
         System.out.println(" Please create account first!");
         return;
     }
     
     System.out.println("\n=== Axis Bank Withdraw ===");
     System.out.print("Enter amount to withdraw: ");
     double amount = scanner.nextDouble();
     scanner.nextLine();
     
     if (amount > 0 && amount <= balance) {
         balance -= amount;
         System.out.println(" Withdrawal Successful!");
         System.out.println("New Balance: " + balance);
     } else {
         System.out.println(" Invalid amount or insufficient balance!");
     }
 }
 
 public void checkBalance() {
     if (!accountCreated) {
         System.out.println(" Please create account first!");
         return;
     }
     
     System.out.println("\n=== Axis Bank Balance ===");
     System.out.println("Account Number: " + accountNumber);
     System.out.println("Customer Name: " + customerName);
     System.out.println("Current Balance: " + balance);
 }
 
 public void showBankInfo() {
     System.out.println("\n=== Axis Bank Information ===");
     System.out.println("Bank Name: Axis Bank");
     System.out.println("Interest Rate: 4.5%");
     System.out.println("Headquarters: Mumbai");
 }
}

public class bankapplication {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     
     
     Bank bank = null;
     
     System.out.println(" WELCOME TO SIMPLE BANKING SYSTEM");
     
     
     System.out.println("\nChoose Your Bank:");
     System.out.println("1. SBI Bank");
     System.out.println("2. Axis Bank");
     System.out.print("Enter choice (1 or 2): ");
     
     int bankChoice = scanner.nextInt();
     scanner.nextLine();
     
     if (bankChoice == 1) {
         bank = new SBI(); 
         System.out.println("You selected: SBI Bank");
     } else if (bankChoice == 2) {
         bank = new Axis(); 
         System.out.println("You selected: Axis Bank");
     } else {
         System.out.println("Invalid choice! Exiting...");
         return;
     }
     
     boolean running = true;
     
     while (running) {
         System.out.println("\n BANK MENU:");
         System.out.println("1. Create Account");
         System.out.println("2. Deposit Money");
         System.out.println("3. Withdraw Money");
         System.out.println("4. Check Balance");
         System.out.println("5. Bank Information");
         System.out.println("6. Exit");
         System.out.print("Enter your choice (1-6): ");
         
         int choice = scanner.nextInt();
         scanner.nextLine();
         
         switch (choice) {
             case 1:
                 bank.createAccount();
                 break;
             case 2:
                 bank.deposit();
                 break;
             case 3:
                 bank.withdraw();
                 break;
             case 4:
                 bank.checkBalance();
                 break;
             case 5:
                 bank.showBankInfo();
                 break;
             case 6:
                 System.out.println("Thank you for banking with us! ");
                 running = false;
                 break;
             default:
                 System.out.println(" Invalid choice! Please try again.");
         }
     }
     
     scanner.close();
 }
}