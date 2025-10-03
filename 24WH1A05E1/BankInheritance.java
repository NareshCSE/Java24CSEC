
class Banks {
    int getBalance() {
        return 0;
    }
}

class BankA extends Banks {
    int getBalance() {
        return 1000;
    }
}

class BankB extends Banks {
    int getBalance() {
        return 1500;
    }
}

class BankC extends Banks {
    int getBalance() {
        return 2000;
    }
}

public class BankInheritance {
    public static void main(String[] args) {
        BankA a = new BankA();
        BankB b = new BankB();
        BankC c = new BankC();
        System.out.println("Money in Bank A: $" + a.getBalance());
        System.out.println("Money in Bank B: $" + b.getBalance());
        System.out.println("Money in Bank C: $" + c.getBalance());
    }
}

