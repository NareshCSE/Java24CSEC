package assignment;

 class bankbalance {
	public int getBalance() {
		return 0;
	}
}


class BankA extends bankbalance {
	public int getBalance() {
		return 1000;
	}
}


class BankB extends bankbalance {
	public int getBalance() {
		return 1500;
	}
}


class BankC extends bankbalance {
	public int getBalance() {
		return 2000;
	}
}


public class bankassignment {
	public static void main(String[] args) {
	BankA bankA = new BankA();
		BankB bankB = new BankB();
		bankbalance bankC = new BankC();
		System.out.println("Money deposited in Bank A: $" + bankA.getBalance());
		System.out.println("Money deposited in Bank B: $" + bankB.getBalance());
		System.out.println("Money deposited in Bank C: $" + bankC.getBalance());
	}
}


