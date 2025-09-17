package java_assignment;
import java.util.Scanner;
public class bank_transaction { 
 static Scanner sc = new Scanner(System.in);
    static String[] accountNumbers = new String[100];
    static String[] names = new String[100];
    static String[] aadhars = new String[100];
    static String[] pans = new String[100];
    static double[] balances = new double[100];
    static int accountCount = 0;
  public static void main(String[] args) {
        char cont = 'y';
        while (cont == 'y' || cont == 'Y') {
            System.out.println("\n--- Bank Menu ---");
            System.out.println("1. Account Creation");
            System.out.println("2. Credit Amount");
            System.out.println("3. Debit Amount");
            System.out.println("4. Mini Statement / Balance Enquiry");
            System.out.println("5. Transfer Amount");
            System.out.println("6. Exit");
            System.out.print("Select option (1-6): ");
            int choice = sc.nextInt();
            sc.nextLine();  
                switch (choice) {
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
                    miniStatement();
                    break;
                case 5:
                    transferAmount();
                    break;
                case 6:
                    System.out.println("Exiting... Thank you!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice!");
            }

            System.out.print("Do you want to continue? (y/n): ");
            cont = sc.nextLine().charAt(0);
        }
        System.out.println("Goodbye!");
    }

    static void createAccount() {
        if (accountCount >= 100) {
            System.out.println("Max accounts reached!");
            return;
        }
        System.out.print("Enter Name: ");
        names[accountCount] = sc.nextLine();

        System.out.print("Enter Aadhar Number: ");
        aadhars[accountCount] = sc.nextLine();

        System.out.print("Enter PAN Number: ");
        pans[accountCount] = sc.nextLine();

        System.out.print("Enter Account Number: ");
        accountNumbers[accountCount] = sc.nextLine();

        balances[accountCount] = 0.0;
        accountCount++;
        System.out.println("Account created successfully!");
    }

    static int findAccountIndex(String accNo) {
        for (int i = 0; i < accountCount; i++) {
            if (accountNumbers[i].equals(accNo)) {
                return i;
            }
        }
        return -1;
    }

    static void creditAmount() {
        System.out.print("Enter Account Number: ");
        String accNo = sc.nextLine();
        int idx = findAccountIndex(accNo);
        if (idx == -1) {
            System.out.println("Account not found!");
            return;
        }
        System.out.print("Enter amount to credit: ");
        double amount = sc.nextDouble();
        sc.nextLine();

        balances[idx] += amount;
        System.out.println("Amount credited successfully. New balance: " + balances[idx]);
    }

    static void debitAmount() {
        System.out.print("Enter Account Number: ");
        String accNo = sc.nextLine();
        int idx = findAccountIndex(accNo);
        if (idx == -1) {
            System.out.println("Account not found!");
            return;
        }
        System.out.print("Enter amount to debit: ");
        double amount = sc.nextDouble();
        sc.nextLine();

        if (balances[idx] >= amount) {
            balances[idx] -= amount;
            System.out.println("Amount debited successfully. New balance: " + balances[idx]);
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    static void miniStatement() {
        System.out.print("Enter Account Number: ");
        String accNo = sc.nextLine();
        int idx = findAccountIndex(accNo);
        if (idx == -1) {
            System.out.println("Account not found!");
            return;
        }
        System.out.println("Account Holder: " + names[idx]);
        System.out.println("Aadhar: " + aadhars[idx]);
        System.out.println("PAN: " + pans[idx]);
        System.out.println("Balance: " + balances[idx]);
    }

    static void transferAmount() {
        System.out.print("Enter FROM Account Number: ");
        String fromAcc = sc.nextLine();
        int fromIdx = findAccountIndex(fromAcc);
        if (fromIdx == -1) {
            System.out.println("From Account not found!");
            return;
        }
        System.out.print("Enter TO Account Number: ");
        String toAcc = sc.nextLine();
        int toIdx = findAccountIndex(toAcc);
        if (toIdx == -1) {
            System.out.println("To Account not found!");
            return;
        }
        System.out.print("Enter amount to transfer: ");
        double amount = sc.nextDouble();
        sc.nextLine();

        if (balances[fromIdx] >= amount) {
            balances[fromIdx] -= amount;
            balances[toIdx] += amount;
            System.out.println("Amount transferred successfully.");
        } else {
            System.out.println("Insufficient balance in from account!");
        }
    }
}

