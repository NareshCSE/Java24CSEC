package basics;
import java.util.Scanner;
public class LA_EXP6 {

	static final int MAX_ACCOUNTS = 100;
    static int[] accNumbers = new int[MAX_ACCOUNTS];
    static String[] names = new String[MAX_ACCOUNTS];
    static int[] aadhars = new int[MAX_ACCOUNTS];
    static int[] pans = new int[MAX_ACCOUNTS];
    static int[] balances = new int[MAX_ACCOUNTS];
    static int totalAccounts = 0;
    static int nextAccNum = 1000;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        Scanner input = new Scanner(System.in);

		        while (true) {
		            System.out.println("\n--- Bank Application ---");
		            System.out.println("1. Account Creation");
		            System.out.println("2. Credit Amount");
		            System.out.println("3. Debit Amount");
		            System.out.println("4. Mini statement / balance enquiry");
		            System.out.println("5. Transfer account");
		            System.out.println("6. Continue");
		            System.out.println("7. Exit");

		            int ch = input.nextInt();

		            switch (ch) {
		                case 1:
		                    Createaccount();
		                    break;
		                case 2:
		                    Credit_amount();
		                    break;
		                case 3:
		                    Debit_amount();
		                    break;
		                case 4:
		                    MiniStatement();
		                    break;
		                case 5:
		                    Transfer_account();
		                    break;
		                case 6:
		                    continue;
		                case 7:
		                    return;
		                default:
		                    System.out.println("Invalid option.");
		            }
		        }
		  
	}
	 public static void Createaccount() {
		        Scanner s = new Scanner(System.in);
		        if (totalAccounts >= MAX_ACCOUNTS) {
		            System.out.println("Bank is full. Can't create more accounts.");
		            return;
		        }

		        System.out.println("Enter name, Aadhar number, PAN number:");
		        String name = s.next();
		        int aadhar = s.nextInt();
		        int pan = s.nextInt();

		        accNumbers[totalAccounts] = nextAccNum++;
		        names[totalAccounts] = name;
		        aadhars[totalAccounts] = aadhar;
		        pans[totalAccounts] = pan;
		        balances[totalAccounts] = 0;

		        System.out.println("Account created successfully. Details:");
		        System.out.println("Account No: " + accNumbers[totalAccounts]);
		        System.out.println("Name: " + name + ", Aadhar: " + aadhar + ", PAN: " + pan);
		        totalAccounts++;
		    }

		    public static void Credit_amount() {
		        Scanner s = new Scanner(System.in);
		        System.out.println("Enter account number and amount:");
		        int accNum = s.nextInt();
		        int amount = s.nextInt();

		        int index = findAccountIndex(accNum);
		        if (index == -1) {
		            System.out.println("Account not found.");
		            return;
		        }

		        balances[index] += amount;
		        System.out.println(amount + " credited successfully to account " + accNum);
		    }

		    public static void Debit_amount() {
		        Scanner s = new Scanner(System.in);
		        System.out.println("Enter account number and amount:");
		        int accNum = s.nextInt();
		        int amount = s.nextInt();

		        int index = findAccountIndex(accNum);
		        if (index == -1) {
		            System.out.println("Account not found.");
		            return;
		        }

		        if (balances[index] < amount) {
		            System.out.println("Insufficient balance.");
		        } else {
		            balances[index] -= amount;
		            System.out.println(amount + " debited successfully from account " + accNum);
		        }
		    }

		    public static void MiniStatement() {
		        Scanner s = new Scanner(System.in);
		        System.out.println("Enter account number:");
		        int accNum = s.nextInt();

		        int index = findAccountIndex(accNum);
		        if (index == -1) {
		            System.out.println("Account not found.");
		            return;
		        }

		        System.out.println("\n--- Mini Statement ---");
		        System.out.println("Account Number: " + accNumbers[index]);
		        System.out.println("Name: " + names[index]);
		        System.out.println("Aadhar: " + aadhars[index]);
		        System.out.println("PAN: " + pans[index]);
		        System.out.println("Balance: ₹" + balances[index]);
		    }

		    public static void Transfer_account() {
		        Scanner s = new Scanner(System.in);
		        System.out.println("Enter FROM account number, TO account number, and amount:");
		        int fromAcc = s.nextInt();
		        int toAcc = s.nextInt();
		        int amount = s.nextInt();

		        int fromIndex = findAccountIndex(fromAcc);
		        int toIndex = findAccountIndex(toAcc);

		        if (fromIndex == -1 || toIndex == -1) {
		            System.out.println("One or both accounts not found.");
		            return;
		        }

		        if (balances[fromIndex] < amount) {
		            System.out.println("Insufficient funds in source account.");
		            return;
		        }

		        balances[fromIndex] -= amount;
		        balances[toIndex] += amount;
		        System.out.println("Transferred " + amount + " from " + fromAcc + " to " + toAcc);
		    }

		    public static int findAccountIndex(int accNum) {
		        for (int i = 0; i < totalAccounts; i++) {
		            if (accNumbers[i] == accNum) {
		                return i;
		            }
		        }
		        return -1;
		    }
		}


