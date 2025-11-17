package java_25wh5a0520;
import java.util.*;
class Bank {
    protected int balance;

    Bank(int balance) {
        this.balance = balance;
    }
    int getBalance() {
        return 0; 
    }
}

class BankA extends Bank {
    BankA(int balance) {
        super(balance);
    }

    int getBalance() {
        return balance;
    }
}

class BankB extends Bank{
    BankB(int balance) {
        super(balance);
    }

    int getBalance() {
        return balance;
    }
}

class BankC extends Bank {
    BankC(int balance) {
        super(balance);
    }

    int getBalance() {
        return balance;
    }
}
public class BankImplementation_Interface  {
	public static void main(String[] args) {
		BankA a = new BankA(1000);
        BankB b = new BankB(1500);
        BankC c = new BankC(2000);

        System.out.println("Amount deposited in Bank A: $" + a.getBalance());
        System.out.println("Amount deposited in Bank B: $" + b.getBalance());
        System.out.println("Amount deposited in Bank C: $" + c.getBalance());
	}

}
