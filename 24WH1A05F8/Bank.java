package src;

class Bank_menu {
    public int getBalance() {
        return 0;
    }
}

class BankA extends Bank_menu {
    public int getBalance() {
        return 1000;
    }
}

class BankB extends Bank_menu {
    public int getBalance() {
        return 1500;
    }
}

class BankC extends Bank_menu {
    public int getBalance() {
        return 2000;
    }
}

public class Bank {
    public static void main(String[] args) {
        BankA bankA = new BankA();
        BankB bankB = new BankB();
        BankC bankC = new BankC();

        System.out.println("Bank A balance: " + bankA.getBalance());
        System.out.println("Bank B balance: " + bankB.getBalance());
        System.out.println("Bank C balance: " + bankC.getBalance());
    }


}
