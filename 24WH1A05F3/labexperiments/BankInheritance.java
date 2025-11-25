package labexperiments;
import java.util.Scanner;
class Bank {
 public int getBalance() {
     return 0;
 }
}
class BankA extends Bank {
 private int balance;
 public BankA(int initialBalance) {
     this.balance = initialBalance;
 }

 @Override
 public int getBalance() {
     return this.balance;
 }
}
class BankB extends Bank {
 private int balance;
 public BankB(int initialBalance) {
     this.balance = initialBalance;
 }
 @Override
 public int getBalance() {
     return this.balance;
 }
}
class BankC extends Bank {
 private int balance;
 public BankC(int initialBalance) {
     this.balance = initialBalance;
 }
 @Override
 public int getBalance() {
     return this.balance;
 }
}

public class BankInheritance {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int balanceA, balanceB, balanceC;

     System.out.println("Enter the balance for Bank A:");
     if (sc.hasNextInt()) {
         balanceA = sc.nextInt();
     } else {
         System.out.println("Invalid input. Setting Bank A balance to 0.");
         balanceA = 0;
         sc.next(); 
     }

     System.out.println("Enter the balance for Bank B:");
     if (sc.hasNextInt()) {
         balanceB = sc.nextInt();
     } else {
         System.out.println("Invalid input. Setting Bank B balance to 0.");
         balanceB = 0;
         sc.next();
     }

     System.out.println("Enter the balance for Bank C:");
     if (sc.hasNextInt()) {
         balanceC = sc.nextInt();
     } else {
         System.out.println("Invalid input. Setting Bank C balance to 0.");
         balanceC = 0;
         sc.next();
     }

     BankA bankA = new BankA(balanceA);
     BankB bankB = new BankB(balanceB);
     BankC bankC = new BankC(balanceC);
     
     sc.close();

     System.out.println("\n--- Bank Balances ---");
     System.out.println("Balance in Bank A: $" + bankA.getBalance());
     System.out.println("Balance in Bank B: $" + bankB.getBalance());
     System.out.println("Balance in Bank C: $" + bankC.getBalance());
 }
}