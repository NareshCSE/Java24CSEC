package sathvika_25wh5a0518;

class Bank2 {
 int getBalance() {
     return 0;  // Default balance
 }
}

//Subclass BankA
class BankA extends Bank2 {
 @Override
 int getBalance() {
     return 1000;  // Balance in Bank A
 }
}

//Subclass BankB
class BankB extends Bank2 {
 @Override
 int getBalance() {
     return 15;}}
class BankC extends Bank2 {
 @Override
 int getBalance() {
     return 2000;  // Balance in Bank C
 }
}

//Main class (must match file name)
public class Bank {
 public static void main(String[] args) {

     BankA a = new BankA();
     BankB b = new BankB();
     BankC c = new BankC();

     // Print balances from all three banks
     System.out.println("Money deposited in Bank A: $" + a.getBalance());
     System.out.println("Money deposited in Bank B: $" + b.getBalance());
     System.out.println("Money deposited in Bank C: $" + c.getBalance());
 }
}
