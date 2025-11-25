package labexperiments;

interface Bankin {
    void createAccount(String name, double amount);
    void credit(double amount);
    void debit(double amount);
    void transfer(double amount);
    void miniStatement();
    double interestRate(); // returns fixed rate
}

class SBI implements Bankin {

    private String name;
    private double balance;

    public void createAccount(String name, double amount) {
        this.name = name;
        this.balance = amount;
        System.out.println("SBI Account Created for " + name + " with balance: " + balance);
    }

    public void credit(double amount) {
        balance += amount;
        System.out.println("Amount Credited: " + amount + " | New Balance: " + balance);
    }

    public void debit(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Amount Debited: " + amount + " | New Balance: " + balance);
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    public void transfer(double amount) {
        System.out.println("Transferred " + amount + " successfully.");
    }

    public void miniStatement() {
        System.out.println("SBI Mini Statement → Name: " + name + " | Balance: " + balance);
    }

    public double interestRate() {
        return 5.5; // SBI fixed rate
    }
}

class Axis implements Bankin {

    private String name;
    private double balance;

    public void createAccount(String name, double amount) {
        this.name = name;
        this.balance = amount;
        System.out.println("Axis Account Created for " + name + " with balance: " + balance);
    }

    public void credit(double amount) {
        balance += amount;
        System.out.println("Amount Credited: " + amount + " | New Balance: " + balance);
    }

    public void debit(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Amount Debited: " + amount + " | New Balance: " + balance);
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    public void transfer(double amount) {
        System.out.println("Transferred " + amount + " successfully.");
    }

    public void miniStatement() {
        System.out.println("Axis Mini Statement → Name: " + name + " | Balance: " + balance);
    }

    public double interestRate() {
        return 6.0;
    }
}


public class BankInterface {
    public static void main(String[] args) {

        Bankin bank; 

       
        bank = new SBI();
        System.out.println("\n---- SBI BANK ----");
        bank.createAccount("Harshitha", 50);
        bank.credit(20);
        bank.debit(100);
        bank.transfer(20);
        bank.miniStatement();
        System.out.println("Interest Rate: " + bank.interestRate() + "%");


        bank = new Axis();
        System.out.println("\n---- AXIS BANK ----");
        bank.createAccount("Harshitha", 80);
        bank.credit(30);
        bank.debit(20);
        bank.transfer(10);
        bank.miniStatement();
        System.out.println("Interest Rate: " + bank.interestRate() + "%");
    }
}
