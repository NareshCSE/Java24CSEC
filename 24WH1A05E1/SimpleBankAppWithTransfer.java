import java.util.Scanner;

public class SimpleBankAppWithTransfer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        String name1 = "", aadhar1 = "", pan1 = "";
        int accNo1 = 1001;
        double balance1 = 0;
        boolean account1Created = false;

       
        String name2 = "", aadhar2 = "", pan2 = "";
        int accNo2 = 1002;
        double balance2 = 0;
        boolean account2Created = false;

        while (true) {
            System.out.println("\n--- Bank Menu ---");
            System.out.println("1. Create Account 1");
            System.out.println("2. Create Account 2");
            System.out.println("3. Credit Amount");
            System.out.println("4. Debit Amount");
            System.out.println("5. Balance Enquiry");
            System.out.println("6. Transfer Amount");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    sc.nextLine();
                    System.out.print("Enter Name: ");
                    name1 = sc.nextLine();
                    System.out.print("Enter Aadhar: ");
                    aadhar1 = sc.nextLine();
                    System.out.print("Enter PAN: ");
                    pan1 = sc.nextLine();
                    balance1 = 0;
                    account1Created = true;
                    System.out.println("Account 1 created! Account No: " + accNo1);
                    break;

                case 2: 
                    sc.nextLine();
                    System.out.print("Enter Name: ");
                    name2 = sc.nextLine();
                    System.out.print("Enter Aadhar: ");
                    aadhar2 = sc.nextLine();
                    System.out.print("Enter PAN: ");
                    pan2 = sc.nextLine();
                    balance2 = 0;
                    account2Created = true;
                    System.out.println("Account 2 created! Account No: " + accNo2);
                    break;

                case 3: 
                    System.out.print("Enter Account No: ");
                    int accCredit = sc.nextInt();
                    System.out.print("Enter amount: ");
                    double credit = sc.nextDouble();
                    if (accCredit == accNo1 && account1Created) {
                        balance1 += credit;
                        System.out.println("Credited! Balance = " + balance1);
                    } else if (accCredit == accNo2 && account2Created) {
                        balance2 += credit;
                        System.out.println("Credited! Balance = " + balance2);
                    } else {
                        System.out.println("Account not found!");
                    }
                    break;

                case 4: 
                    System.out.print("Enter Account No: ");
                    int accDebit = sc.nextInt();
                    System.out.print("Enter amount: ");
                    double debit = sc.nextDouble();
                    if (accDebit == accNo1 && account1Created) {
                        if (debit <= balance1) {
                            balance1 -= debit;
                            System.out.println("Debited! Balance = " + balance1);
                        } else {
                            System.out.println("Insufficient balance!");
                        }
                    } else if (accDebit == accNo2 && account2Created) {
                        if (debit <= balance2) {
                            balance2 -= debit;
                            System.out.println("Debited! Balance = " + balance2);
                        } else {
                            System.out.println("Insufficient balance!");
                        }
                    } else {
                        System.out.println("Account not found!");
                    }
                    break;

                case 5: 
                    System.out.print("Enter Account No: ");
                    int accCheck = sc.nextInt();
                    if (accCheck == accNo1 && account1Created) {
                        System.out.println("Account Holder: " + name1);
                        System.out.println("Balance: " + balance1);
                    } else if (accCheck == accNo2 && account2Created) {
                        System.out.println("Account Holder: " + name2);
                        System.out.println("Balance: " + balance2);
                    } else {
                        System.out.println("Account not found!");
                    }
                    break;

                case 6:
                    System.out.print("Enter From Account No: ");
                    int from = sc.nextInt();
                    System.out.print("Enter To Account No: ");
                    int to = sc.nextInt();
                    System.out.print("Enter amount: ");
                    double amt = sc.nextDouble();

                    if (from == accNo1 && to == accNo2 && account1Created && account2Created) {
                        if (amt <= balance1) {
                            balance1 -= amt;
                            balance2 += amt;
                            System.out.println("Transfer successful!");
                        } else {
                            System.out.println("Insufficient balance!");
                        }
                    } else if (from == accNo2 && to == accNo1 && account1Created && account2Created) {
                        if (amt <= balance2) {
                            balance2 -= amt;
                            balance1 += amt;
                            System.out.println("Transfer successful!");
                        } else {
                            System.out.println("Insufficient balance!");
                        }
                    } else {
                        System.out.println("Transfer failed! Check accounts.");
                    }
                    break;

                case 7:
                    System.out.println("Thank you for using the Bank Application!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
