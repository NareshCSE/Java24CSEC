interface Bank {
    void createAccount(String name);
    void creditAmount(double amount);
    void debitAmount(double amount);
    void transferAmount(Bank other, double amount);
    void miniStatement();
    double getRateOfInterest();
}

class SBI implements Bank {
    private double balance = 0;
    public void createAccount(String name) { System.out.println("SBI Account created for " + name); }
    public void creditAmount(double amount) { balance += amount; }
    public void debitAmount(double amount) { if (amount <= balance) balance -= amount; }
    public void transferAmount(Bank other, double amount) {
        if (amount <= balance) {
            this.debitAmount(amount);
            other.creditAmount(amount);
        }
    }
    public void miniStatement() { System.out.println("SBI Balance: " + balance); }
    public double getRateOfInterest() { return 5.5; }
}

class Axis implements Bank {
    private double balance = 0;
    public void createAccount(String name) { System.out.println("Axis Account created for " + name); }
    public void creditAmount(double amount) { balance += amount; }
    public void debitAmount(double amount) { if (amount <= balance) balance -= amount; }
    public void transferAmount(Bank other, double amount) {
        if (amount <= balance) {
            this.debitAmount(amount);
            other.creditAmount(amount);
        }
    }
    public void miniStatement() { System.out.println("Axis Balance: " + balance); }
    public double getRateOfInterest() { return 6.0; }
}

public class BankInterface {
    public static void main(String[] args) {
        Bank mySBI = new SBI();    
        Bank myAxis = new Axis();

        mySBI.createAccount("Raj");
        mySBI.creditAmount(5000);
        mySBI.debitAmount(1000);
        mySBI.miniStatement();
        System.out.println("SBI Interest: " + mySBI.getRateOfInterest() + "%");

        myAxis.createAccount("Amit");
        myAxis.creditAmount(3000);
        myAxis.miniStatement();
        System.out.println("Axis Interest: " + myAxis.getRateOfInterest() + "%");

        mySBI.transferAmount(myAxis, 500);
        mySBI.miniStatement();
        myAxis.miniStatement();
    }
}
