package src;
import java.util.Scanner;

public class BankApp {
    static String[] names = new String[100];
    static String[] aadhar = new String[100];
    static String[] pan = new String[100];
    static double[] balance = new double[100];
    static int count = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char cont;
        do {
            System.out.println("1. Account Creation\n2. Credit Amount\n3. Debit Amount\n4. Balance Enquiry\n5. Transfer Amount");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            
            switch(choice) {
                case 1:
                    System.out.print("Enter Name: "); names[count] = sc.next();
                    System.out.print("Enter Aadhar: "); aadhar[count] = sc.next();
                    System.out.print("Enter PAN: "); pan[count] = sc.next();
                    balance[count] = 0;
                    System.out.println("Account Created. Account Number: " + count);
                    count++; break;
                case 2:
                    System.out.print("Enter Account Number: "); int acc = sc.nextInt();
                    System.out.print("Enter Amount: "); double amt = sc.nextDouble();
                    balance[acc] += amt;
                    System.out.println("Amount Credited. New Balance: " + balance[acc]); break;
                case 3:
                    System.out.print("Enter Account Number: "); acc = sc.nextInt();
                    System.out.print("Enter Amount: "); amt = sc.nextDouble();
                    if(balance[acc] >= amt) {
                        balance[acc] -= amt;
                        System.out.println("Amount Debited. New Balance: " + balance[acc]);
                    } else System.out.println("Insufficient Balance"); break;
                case 4:
                    System.out.print("Enter Account Number: "); acc = sc.nextInt();
                    System.out.println("Balance: " + balance[acc]); break;
                case 5:
                    System.out.print("Enter From Account Number: "); int from = sc.nextInt();
                    System.out.print("Enter To Account Number: "); int to = sc.nextInt();
                    System.out.print("Enter Amount: "); amt = sc.nextDouble();
                    if(balance[from] >= amt) {
                        balance[from] -= amt;
                        balance[to] += amt;
                        System.out.println("Transfer Successful.");
                    } else System.out.println("Insufficient Balance"); break;
                default: System.out.println("Invalid Option");
            }

            System.out.print("Continue? (y/n): ");
            cont = sc.next().charAt(0);
        } while(cont == 'y' || cont == 'Y');
    }
}
