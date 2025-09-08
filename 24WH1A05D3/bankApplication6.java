package javaAssignment;
import java.util.*;

       	class Account {
		    int accountNumber;
		    String name, aadhar, pan;
		    double balance;

		    Account(int accountNumber, String name, String aadhar, String pan) {
		        this.accountNumber = accountNumber;
		        this.name = name;
		        this.aadhar = aadhar;
		        this.pan = pan;
		        this.balance = 0.0;
		    }
		}

		public class bankApplication6 {
		    static List<Account> accounts = new ArrayList<>();
		    static int nextAccountNumber = 1001;

		    public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        while (true) {
		            System.out.println("\n--- Bank Menu ---");
		            System.out.println("1. Create Account");
		            System.out.println("2. Credit");
		            System.out.println("3. Debit");
		            System.out.println("4. Balance Enquiry");
		            System.out.println("5. Transfer");
		            System.out.println("6. Exit");
		            System.out.print("Enter choice: ");

		            switch (sc.nextInt()) {
		                case 1 -> createAccount(sc);
		                case 2 -> credit(sc);
		                case 3 -> debit(sc);
		                case 4 -> balanceEnquiry(sc);
		                case 5 -> transfer(sc);
		                case 6 -> { 
		                    System.out.println("Thank you! Exiting...");
		                    return;
		                }
		                default -> System.out.println("Invalid choice!");
		            }
		        }
		    }

		    static void createAccount(Scanner sc) {
		        sc.nextLine();
		        System.out.print("Name: "); String name = sc.nextLine();
		        System.out.print("Aadhar: "); String aadhar = sc.nextLine();
		        System.out.print("PAN: "); String pan = sc.nextLine();

		        accounts.add(new Account(nextAccountNumber, name, aadhar, pan));
		        System.out.println("Account created! Number: " + nextAccountNumber++);
		    }

		    static void credit(Scanner sc) {
		        Account acc = findAccount(sc);
		        if (acc == null) return;
		        System.out.print("Amount to credit: ");
		        double amt = sc.nextDouble();
		        if (amt > 0) {
		            acc.balance += amt;
		            System.out.println("Credited! New balance: " + acc.balance);
		        } else System.out.println("Invalid amount.");
		    }

		    static void debit(Scanner sc) {
		        Account acc = findAccount(sc);
		        if (acc == null) return;
		        System.out.print("Amount to debit: ");
		        double amt = sc.nextDouble();
		        if (amt > 0 && acc.balance >= amt) {
		            acc.balance -= amt;
		            System.out.println("Debited! New balance: " + acc.balance);
		        } else System.out.println("Insufficient balance or invalid amount.");
		    }

		    static void balanceEnquiry(Scanner sc) {
		        Account acc = findAccount(sc);
		        if (acc != null)
		            System.out.println("Name: " + acc.name + ", Balance: " + acc.balance);
		    }

		    static void transfer(Scanner sc) {
		        System.out.print("From account: "); int fromNum = sc.nextInt();
		        System.out.print("To account: "); int toNum = sc.nextInt();
		        System.out.print("Amount: "); double amt = sc.nextDouble();

		        Account from = findAccount(fromNum), to = findAccount(toNum);
		        if (from == null || to == null) {
		            System.out.println("Account not found.");
		            return;
		        }
		        if (amt > 0 && from.balance >= amt) {
		            from.balance -= amt;
		            to.balance += amt;
		            System.out.println("Transferred! From bal: " + from.balance + ", To bal: " + to.balance);
		        } else System.out.println("Insufficient funds or invalid amount.");
		    }

		    static Account findAccount(Scanner sc) {
		        System.out.print("Enter account number: ");
		        return findAccount(sc.nextInt());
		    }

		    static Account findAccount(int accNum) {
		        for (Account a : accounts)
		            if (a.accountNumber == accNum) return a;
		        System.out.println("Account not found.");
		        return null;
		    }
		}


	


