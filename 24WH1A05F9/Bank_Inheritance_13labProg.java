package labPrograms;
class Bank{
	int getBalance(){
		return 0;
	}
}
class BankA extends Bank{
	int getBalance() {
		return 1000;
	}
}
class BankB extends Bank{
	int getBalance() {
		return 1500;
	}
}
class BankC extends Bank{
	int getBalance() {
		return 2000;
	}
}

public class Bank_Inheritance_13labProg {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankA a=new BankA();
		BankB b=new BankB();
		BankC c=new BankC();
		System.out.println("Balance in Bank A: "+a.getBalance());
		System.out.println("Balance in Bank B: "+b.getBalance());
		System.out.println("Balance in Bank C: "+c.getBalance());
	}

}
