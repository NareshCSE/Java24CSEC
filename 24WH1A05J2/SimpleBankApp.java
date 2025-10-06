package vaishnavi;
import java.util.Scanner;

public class SimpleBankApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Bank data storage using arrays
        String[] accountNumbers = new String[10];
        String[] customerNames = new String[10];
        String[] aadharNumbers = new String[10];
        String[] panNumbers = new String[10];
        double[] balances = new double[10];
        int totalAccounts = 0;
        
        System.out.println("=== SIMPLE BANK APPLICATION ===");
        
        while(true) {
            // Display menu
            System.out.println("\n--- BANK MENU ---");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Check Balance");
            System.out.println("5. Transfer Money");
            System.out.println("6. Exit");
            System.out.print("Enter your choice (1-6): ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); // clear the buffer
            
            switch(choice) {
                case 1:
                    // Create Account
                    if(totalAccounts >= 10) {
                        System.out.println("Bank is full! Cannot create more accounts.");
                        break;
                    }
                    
                    System.out.println("\n--- CREATE ACCOUNT ---");
                    System.out.print("Enter Customer Name: ");
                    String name = scanner.nextLine();
                    
                    System.out.print("Enter Aadhar Number: ");
                    String aadhar = scanner.nextLine();
                    
                    System.out.print("Enter PAN Number: ");
                    String pan = scanner.nextLine();
                    
                    // Generate account number
                    String accNumber = "ACC" + (totalAccounts + 1);
                    
                    // Store in arrays
                    accountNumbers[totalAccounts] = accNumber;
                    customerNames[totalAccounts] = name;
                    aadharNumbers[totalAccounts] = aadhar;
                    panNumbers[totalAccounts] = pan;
                    balances[totalAccounts] = 0.0;
                    
                    System.out.println("Account created successfully!");
                    System.out.println("Account Number: " + accNumber);
                    System.out.println("Customer Name: " + name);
                    
                    totalAccounts++;
                    break;
                    
                case 2:
                    // Deposit Money
                    System.out.println("\n--- DEPOSIT MONEY ---");
                    System.out.print("Enter Account Number: ");
                    String depositAcc = scanner.nextLine();
                    
                    int depositIndex = -1;
                    for(int i = 0; i < totalAccounts; i++) {
                        if(accountNumbers[i].equals(depositAcc)) {
                            depositIndex = i;
                            break;
                        }
                    }
                    
                    if(depositIndex == -1) {
                        System.out.println("Account not found!");
                        break;
                    }
                    
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    
                    if(depositAmount > 0) {
                        balances[depositIndex] += depositAmount;
                        System.out.println("Deposit successful!");
                        System.out.println("New balance: " + balances[depositIndex]);
                    } else {
                        System.out.println("Invalid amount!");
                    }
                    break;
                    
                case 3:
                    // Withdraw Money
                    System.out.println("\n--- WITHDRAW MONEY ---");
                    System.out.print("Enter Account Number: ");
                    String withdrawAcc = scanner.nextLine();
                    
                    int withdrawIndex = -1;
                    for(int i = 0; i < totalAccounts; i++) {
                        if(accountNumbers[i].equals(withdrawAcc)) {
                            withdrawIndex = i;
                            break;
                        }
                    }
                    
                    if(withdrawIndex == -1) {
                        System.out.println("Account not found!");
                        break;
                    }
                    
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    
                    if(withdrawAmount > 0) {
                        if(withdrawAmount <= balances[withdrawIndex]) {
                            balances[withdrawIndex] -= withdrawAmount;
                            System.out.println("Withdrawal successful!");
                            System.out.println("New balance: " + balances[withdrawIndex]);
                        } else {
                            System.out.println("Insufficient balance!");
                        }
                    } else {
                        System.out.println("Invalid amount!");
                    }
                    break;
                    
                case 4:
                    // Check Balance
                    System.out.println("\n--- CHECK BALANCE ---");
                    System.out.print("Enter Account Number: ");
                    String balanceAcc = scanner.nextLine();
                    
                    int balanceIndex = -1;
                    for(int i = 0; i < totalAccounts; i++) {
                        if(accountNumbers[i].equals(balanceAcc)) {
                            balanceIndex = i;
                            break;
                        }
                    }
                    
                    if(balanceIndex == -1) {
                        System.out.println("Account not found!");
                        break;
                    }
                    
                    System.out.println("Account Number: " + accountNumbers[balanceIndex]);
                    System.out.println("Customer Name: " + customerNames[balanceIndex]);
                    System.out.println("Current Balance: " + balances[balanceIndex]);
                    break;
                    
                case 5:
                    // Transfer Money
                    System.out.println("\n--- TRANSFER MONEY ---");
                    System.out.print("Enter From Account Number: ");
                    String fromAcc = scanner.nextLine();
                    
                    System.out.print("Enter To Account Number: ");
                    String toAcc = scanner.nextLine();
                    
                    int fromIndex = -1, toIndex = -1;
                    
                    // Find from account
                    for(int i = 0; i < totalAccounts; i++) {
                        if(accountNumbers[i].equals(fromAcc)) {
                            fromIndex = i;
                            break;
                        }
                    }
                    
                    // Find to account
                    for(int i = 0; i < totalAccounts; i++) {
                        if(accountNumbers[i].equals(toAcc)) {
                            toIndex = i;
                            break;
                        }
                    }
                    
                    if(fromIndex == -1 || toIndex == -1) {
                        System.out.println("One or both accounts not found!");
                        break;
                    }
                    
                    System.out.print("Enter amount to transfer: ");
                    double transferAmount = scanner.nextDouble();
                    
                    if(transferAmount > 0) {
                        if(transferAmount <= balances[fromIndex]) {
                            balances[fromIndex] -= transferAmount;
                            balances[toIndex] += transferAmount;
                            System.out.println("Transfer successful!");
                            System.out.println("From Account Balance: " + balances[fromIndex]);
                            System.out.println("To Account Balance: " + balances[toIndex]);
                        } else {
                            System.out.println("Insufficient balance!");
                        }
                    } else {
                        System.out.println("Invalid amount!");
                    }
                    break;
                    
                case 6:
                    // Exit
                    System.out.println("Thank you for using our bank!");
                    scanner.close();
                    return;
                    
                default:
                    System.out.println("Invalid choice! Please enter 1-6.");
            }
        }
    }
}

