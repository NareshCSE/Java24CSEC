interface Bank {
    void createAccount(String name, double amount);
    void credit(int acc, double amt);
    void debit(int acc, double amt);
    double balance(int acc);
}

class SBI implements Bank {
    double[] accounts = new double[100];
    public void createAccount(String name, double amount) { accounts[0] = amount; System.out.println("SBI Account Created"); }
    public void credit(int acc, double amt) { accounts[acc] += amt; }
    public void debit(int acc, double amt) { accounts[acc] -= amt; }
    public double balance(int acc) { return accounts[acc]; }
}

class Axis implements Bank {
    double[] accounts = new double[100];
    public void createAccount(String name, double amount) { accounts[0] = amount; System.out.println("Axis Account Created"); }
    public void credit(int acc, double amt) { accounts[acc] += amt; }
    public void debit(int acc, double amt) { accounts[acc] -= amt; }
    public double balance(int acc) { return accounts[acc]; }
}

public class BankInterfaceDemo {
    public static void main(String[] args) {
        Bank bank = new SBI(); 
        bank.createAccount("Hani", 1000);
        bank.credit(0, 500);
        System.out.println("Balance: " + bank.balance(0));
        
        bank = new Axis(); 
        bank.createAccount("RK", 2000);
        bank.debit(0, 1000);
        System.out.println("Balance: " + bank.balance(0));
    }
}
