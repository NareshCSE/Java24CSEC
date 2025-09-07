
import java.util.Scanner;

public class bank {

    public static int findAccountIndex(int[] accountNumbers, int accountCount, int accNo) {
        for (int i = 0; i < accountCount; i++) {
            if (accountNumbers[i] == accNo) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = new String[5];
        String[] aadharNumbers = new String[5];
        String[] panNumbers = new String[5];
        int[] accountNumbers = new int[5];
        double[] balances = new double[5];

        int accountCount = 0;
        int nextAccountNumber = 1001;

        int option;
        do {
            System.out.println("Bank Menu:");
            System.out.println("1. Account Creation");
            System.out.println("2. Credit Amount");
            System.out.println("3. Debit Amount");
            System.out.println("4. Mini Statement / Balance Enquiry");
            System.out.println("5. Transfer Amount");
            System.out.println("6. Exit");
            System.out.print("Select option (1-6): ");
            option = sc.nextInt();
            sc.nextLine();

            switch (option) {
                case 1:
                    System.out.print("Enter customer name: ");
                    names[accountCount] = sc.nextLine();

                    System.out.print("Enter Aadhar number: ");
                    aadharNumbers[accountCount] = sc.nextLine();

                    System.out.print("Enter PAN number: ");
                    panNumbers[accountCount] = sc.nextLine();

                    accountNumbers[accountCount] = nextAccountNumber;
                    balances[accountCount] = 0.0;

                    System.out.println("Account created successfully! Account Number: " + nextAccountNumber);

                    accountCount++;
                    nextAccountNumber++;
                    break;

                case 2:
                    System.out.print("Enter account number: ");
                    int accNo = sc.nextInt();
                    sc.nextLine();

                    int idx = findAccountIndex(accountNumbers, accountCount, accNo);

                    if (idx == -1) {
                        System.out.println("Account not found.");
                    } else {
                        System.out.print("Enter amount to credit: ");
                        double amount = sc.nextDouble();
                        sc.nextLine();

                        if (amount <= 0) {
                            System.out.println("Amount should be positive.");
                        } else {
                            balances[idx] += amount;
                            System.out.println("Amount credited successfully. New balance: " + balances[idx]);
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter account number: ");
                    accNo = sc.nextInt();
                    sc.nextLine();

                    idx = findAccountIndex(accountNumbers, accountCount, accNo);

                    if (idx == -1) {
                        System.out.println("Account not found.");
                    } else {
                        System.out.print("Enter amount to debit: ");
                        double amount = sc.nextDouble();
                        sc.nextLine();

                        if (amount <= 0) {
                            System.out.println("Amount should be positive.");
                        } else if (balances[idx] < amount) {
                            System.out.println("Insufficient balance.");
                        } else {
                            balances[idx] -= amount;
                            System.out.println("Amount debited successfully. New balance: " + balances[idx]);
                        }
                    }
                    break;

                case 4:
                    System.out.print("Enter account number: ");
                    accNo = sc.nextInt();
                    sc.nextLine();

                    idx = findAccountIndex(accountNumbers, accountCount, accNo);

                    if (idx == -1) {
                        System.out.println("Account not found.");
                    } else {
                        System.out.println("Account Holder: " + names[idx]);
                        System.out.println("Account Number: " + accountNumbers[idx]);
                        System.out.println("Current Balance: " + balances[idx]);
                    }
                    break;

                case 5:
                    System.out.print("Enter FROM account number: ");
                    int fromAcc = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter TO account number: ");
                    int toAcc = sc.nextInt();
                    sc.nextLine();

                    int fromIdx = findAccountIndex(accountNumbers, accountCount, fromAcc);
                    int toIdx = findAccountIndex(accountNumbers, accountCount, toAcc);

                    if (fromIdx == -1 || toIdx == -1) {
                        System.out.println("One or both account numbers not found.");
                    } else {
                        System.out.print("Enter amount to transfer: ");
                        double amount = sc.nextDouble();
                        sc.nextLine();

                        if (amount <= 0) {
                            System.out.println("Amount should be positive.");
                        } else if (balances[fromIdx] < amount) {
                            System.out.println("Insufficient balance in FROM account.");
                        } else {
                            balances[fromIdx] -= amount;
                            balances[toIdx] += amount;
                            System.out.println("Transfer successful!");
                            System.out.println("FROM Account New Balance: " + balances[fromIdx]);
                            System.out.println("TO Account New Balance: " + balances[toIdx]);
                        }
                    }
                    break;

                case 6:
                    System.out.println("Exiting... Thank you for using the Bank Application!");
                    break;

                default:
                    System.out.println("Invalid option. Please select from 1 to 6.");
                    break;
            }
            System.out.println();
        } while (option != 6);
        sc.close();
    }
}