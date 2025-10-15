package java_lab_exp;
import java.util.Scanner;
interface Bank {
    void createAccount(String name, double amount);
    void credit(double amount);                     
    void debit(double amount);                     
    void miniStatement();                           
    double rateOfInterest();                       
}

class SBI implements Bank {
    double balance;
    String name;

    public void createAccount(String n, double amt) {
        name = n;
        balance = amt;
        System.out.println("SBI Account created for " + name + " with Rs." + balance);
    }
    public void credit(double amt) {
        balance += amt;
        System.out.println("Credited Rs." + amt);
    }
    public void debit(double amt) {
        balance -= amt;
        System.out.println("Debited Rs." + amt);
    }
    public void miniStatement() {
        System.out.println(name + " Balance: Rs." + balance);
    }
    public double rateOfInterest() {
        return 6.5;
    }
}

class Axis implements Bank {
    double balance;
    String name;

    public void createAccount(String n, double amt) {
        name = n;
        balance = amt;
        System.out.println("Axis Account created for " + name + " with Rs." + balance);
    }
    public void credit(double amt) {
        balance += amt;
        System.out.println("Credited Rs." + amt);
    }
    public void debit(double amt) {
        balance -= amt;
        System.out.println("Debited Rs." + amt);
    }
    public void miniStatement() {
        System.out.println(name + " Balance: Rs." + balance);
    }
    public double rateOfInterest() {
        return 7.0;
    }
}

public class Q11InterfaceBank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Choose Bank (1 = SBI, 2 = Axis): ");
        int choice = sc.nextInt();
        sc.nextLine(); 

       Bank bank;
        if (choice == 1) {
            bank = new SBI();
        } else {
            bank = new Axis();
        }

        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Enter opening balance: ");
        double bal = sc.nextDouble();
        bank.createAccount(name, bal);

        bank.credit(500);     
        bank.debit(200);       
        bank.miniStatement();  
        System.out.println("Rate of Interest: " + bank.rateOfInterest() + "%");

        sc.close();
    }
}