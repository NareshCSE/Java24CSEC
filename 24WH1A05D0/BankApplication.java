package javaprograms;

import java.util.Scanner;

class BankApplication{
    static final int MAX_ACCOUNTS = 100; 
    static int accountCount = 0;

    static int[] accountNumbers = new int[MAX_ACCOUNTS];
    static String[] names = new String[MAX_ACCOUNTS];
    static String[] aadhars = new String[MAX_ACCOUNTS];
    static String[] pans = new String[MAX_ACCOUNTS];
    static double[] balances = new double[MAX_ACCOUNTS];

    static Scanner sc = new Scanner(System.in);

    static void createAccount() {
        if (accountCount >= MAX_ACCOUNTS) {
            System.out.println("Cannot create more accounts!");
            return;
        }
        System.out.print("Enter customer name: ");
        String name = sc.next();
        System.out.print("Enter Aadhar number: ");
        String aadhar = sc.next();
        System.out.print("Enter PAN number: ");
        String pan = sc.next();

        int accNo = 1001 + accountCount; 
        accountNumbers[accountCount] = accNo;
        names[accountCount] = name;
        aadhars[accountCount] = aadhar;
        pans[accountCount] = pan;
        balances[accountCount] = 0.0;

        System.out.println("Account created successfully!");
        System.out.println("Your Account Number is: " + accNo);

        accountCount++;
    }

    // Find account index
    static int findAccount(int accNo) {
        for (int i = 0; i < accountCount; i++) {
            if (accountNumbers[i] == accNo) {
                return i;
            }
        }
        return -1;
    }

    // Credit amount
    static void creditAmount() {
        System.out.print("Enter account number: ");
        int accNo = sc.nextInt();
        int index = findAccount(accNo);

        if (index == -1) {
            System.out.println("Account not found!");
            return;
        }
        System.out.print("Enter amount to credit: ");
        double amount = sc.nextDouble();
        balances[index] += amount;
        System.out.println("Amount credited successfully! New Balance: " + balances[index]);
    }

    // Debit amount
    static void debitAmount() {
        System.out.print("Enter account number: ");
        int accNo = sc.nextInt();
        int index = findAccount(accNo);

        if (index == -1) {
            System.out.println("Account not found!");
            return;
        }
        System.out.print("Enter amount to debit: ");
        double amount = sc.nextDouble();

        if (amount > balances[index]) {
            System.out.println("Insufficient balance!");
        } else {
            balances[index] -= amount;
            System.out.println("Amount debited successfully! New Balance: " + balances[index]);
        }
    }

    // Balance enquiry
    static void balanceEnquiry() {
        System.out.print("Enter account number: ");
        int accNo = sc.nextInt();
        int index = findAccount(accNo);

        if (index == -1) {
            System.out.println("Account not found!");
        } else {
            System.out.println("Account Number: " + accNo);
            System.out.println("Customer Name: " + names[index]);
            System.out.println("Balance: " + balances[index]);
        }
    }

    // Transfer amount
    static void transferAmount() {
        System.out.print("Enter FROM account number: ");
        int fromAcc = sc.nextInt();
        int fromIndex = findAccount(fromAcc);

        System.out.print("Enter TO account number: ");
        int toAcc = sc.nextInt();
        int toIndex = findAccount(toAcc);

        if (fromIndex == -1 || toIndex == -1) {
            System.out.println("Invalid account number(s)!");
            return;
        }

        System.out.print("Enter transfer amount: ");
        double amount = sc.nextDouble();

        if (amount > balances[fromIndex]) {
            System.out.println("Insufficient balance in source account!");
        } else {
            balances[fromIndex] -= amount;
            balances[toIndex] += amount;
            System.out.println("Transfer successful!");
            System.out.println("From Account New Balance: " + balances[fromIndex]);
            System.out.println("To Account New Balance: " + balances[toIndex]);
        }
    }

    // Main menu
    public static void main(String[] args) {
        char choice;
        do {
            System.out.println("\n===== Bank Menu =====");
            System.out.println("1. Account Creation");
            System.out.println("2. Credit Amount");
            System.out.println("3. Debit Amount");
            System.out.println("4. Balance Enquiry");
            System.out.println("5. Transfer Amount");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int option = sc.nextInt();

            switch (option) {
                case 1:
                    createAccount();
                    break;
                case 2:
                    creditAmount();
                    break;
                case 3:
                    debitAmount();
                    break;
                case 4:
                    balanceEnquiry();
                    break;
                case 5:
                    transferAmount();
                    break;
                case 6:
                    System.out.println("Exiting application...");
                    return;
                default:
                    System.out.println("Invalid option!");
            }

            System.out.print("Do you want to continue (y/n)? ");
            choice = sc.next().charAt(0);

        } while (choice == 'y' || choice == 'Y');

        System.out.println("Thank you for using Bank Application!");
    }
}
