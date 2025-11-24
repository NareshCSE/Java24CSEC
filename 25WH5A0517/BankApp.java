package navya_25wh5a0517;


import java.util.Scanner;
public class BankApp {
String[] names = new String[100];
float[] balances = new float[100];
int totalAccounts = 0;
Scanner sc = new Scanner(System.in);
// Create Account
void createAccount() {
System.out.print("Enter Name: ");
names[totalAccounts] = sc.nextLine();
balances[totalAccounts] = 0;
System.out.println("Account created! Account Number: " + (totalAccounts + 1));
totalAccounts++;
}
// Credit Amount
void creditAmount() {
System.out.print("Enter Account Number: ");

int acc = sc.nextInt();
sc.nextLine(); // consume newline
if (acc <= 0 || acc > totalAccounts) {
System.out.println("Invalid Account!");
return;
}
System.out.print("Enter amount to credit: ");
float amount = sc.nextFloat();
sc.nextLine(); // consume newline
if (amount <= 0) {
System.out.println("Invalid amount!");
return;
}
balances[acc- 1] += amount;
System.out.println("Amount credited! New Balance: " + balances[acc- 1]);
}
// Debit Amount
void debitAmount() {
System.out.print("Enter Account Number: ");
int acc = sc.nextInt();
sc.nextLine(); // consume newline
if (acc <= 0 || acc > totalAccounts) {
System.out.println("Invalid Account!");
return;
}
System.out.print("Enter amount to debit: ");
float amount = sc.nextFloat();
sc.nextLine(); // consume newline


if (amount <= 0) {
System.out.println("Invalid amount!");
return;
}
if (amount > balances[acc- 1]) {
System.out.println("Insufficient balance!");
} else {
balances[acc- 1]-= amount;
System.out.println("Amount debited! New Balance: " + balances[acc- 1]);
}
}
// Balance Enquiry
void balanceEnquiry() {
System.out.print("Enter Account Number: ");
int acc = sc.nextInt();
sc.nextLine(); // consume newline
if (acc <= 0 || acc > totalAccounts) {
System.out.println("Invalid Account!");
return;
}
System.out.println("Name: " + names[acc- 1]);
System.out.println("Balance: " + balances[acc- 1]);
}
// Main Menu
void menu() {
while (true) {
System.out.println("\n--- Bank Application Menu---");
System.out.println("1. Create Account");
System.out.println("2. Credit Amount");
System.out.println("3. Debit Amount");
System.out.println("4. Balance Enquiry");
System.out.println("5. Exit");
System.out.print("Enter your choice: ");
int choice = sc.nextInt();
sc.nextLine(); // consume newline
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
balanceEnquiry();
break;
case 5:
System.out.println("Thank you! Exiting...");
return;
default:
System.out.println("Invalid choice! Try again.");
}
}
}
// Main method
public static void main(String[] args) {

BankApp bank = new BankApp();
bank.menu(); }}

