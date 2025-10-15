package java_lab_exp;
class Bank {
    int getBalance() { return 0; }
}

class BankA extends Bank {
    int getBalance() { return 1000; }
}

class BankB extends Bank {
    int getBalance() { return 1500; }
}

class BankC extends Bank {
    int getBalance() { return 2000; }
}
public class Q10Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Bank banks[] = { new BankA(), new BankB(), new BankC() };
	        String names[] = { "A", "B", "C" };
            for (int i = 0; i < banks.length; i++) {
	            System.out.println("Money in Bank " + names[i] + ": $" + banks[i].getBalance());
	        }
	}

}



