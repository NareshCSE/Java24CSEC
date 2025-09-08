package java5J1;
import java.util.Scanner;
public class Bank {
		public static class BankA {
			static int balance = 0;
			public static void deposit(int amount) {
				balance += amount;
			}
			public static int getBalance() {
				return balance;
			}
		}
		public static class BankB {
			static int balance = 0;
			public static void deposit(int amount) {
				balance += amount;
			}
			public static int getBalance() {
				return balance;
			}
		}
		public static class BankC {
			static int balance = 0;
			public static void deposit(int amount) {
				balance += amount;
			}
			public static int getBalance() {
				return balance;
			}
		}
		public static void main(String[] args) {
			Scanner sc = new Scanner (System.in);
			System.out.println("The balance amount in the Bank is: " + 0);
			System.out.println("Enter the amount to deposit in BankA:");
			int amountA = sc.nextInt();
			BankA.deposit(amountA);
			System.out.println("Enter the amount to deposit in BankB:");
			int amountB = sc.nextInt();
			BankB.deposit(amountB);
			System.out.println("Enter the amount to deposit in BankC:");
			int amountC = sc.nextInt();
			BankC.deposit(amountC);
			
			System.out.println("The Balance in BankA is: $" + BankA.getBalance());
			System.out.println("The Balance in BankB is: $" + BankB.getBalance());
			System.out.println("The Balance in BankC is: $" + BankC.getBalance());
			sc.close();
	}

}
