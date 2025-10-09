package labPrograms;
interface Bank1{
	double rate_of_intrest=9.5;
	void createAccount(String name,String accountNumber,double intialDeposition);
	void creditAmount(double amount);
	void debitAmount(double amount);
	void transferAmount(Bank1 axis,double amount);
	void miniStatement();
}
class SBI implements Bank1{
	private String name;
	private String accountNumber;
	private double balance;
	public void createAccount(String name,String accountNumber,double intialDeposition) {
		this.name=name;
		this.accountNumber=accountNumber;
		this.balance=intialDeposition;
		System.out.println("SBI Account has been Successfully created by"+name+"with balance"+balance);
	}
	public void creditAmount(double amount) {
		balance+=amount;
		System.out.println("credited amount in SBI...check total balance:"+balance);
	}
	public void debitAmount(double amount) {
		if(amount>balance) {
			System.out.println("Insufficient amount in SBI to debit");
		}
		else {
			balance-=amount;
			System.out.println("Amount debited from SBI..check balance:"+balance);
		}
	}
	public void transferAmount(Bank1 chooseBank,double amount) {
		if(amount>balance) {
			System.out.println("Insuffient to transfer in SBI");
		}
		else {
			this.debitAmount(amount);
			chooseBank.creditAmount(amount);
			System.out.println("SBI transfered amount"+amount);
		}
	}
	public void miniStatement() {
		System.out.println("SBI statement-Name:"+name+"Balance:"+balance);
	}
}
class Axis implements Bank1{
	private String name;
	private String accountNumber;
	private double balance;
	public void createAccount(String name,String accountNumber,double intialDeposition) {
		this.name=name;
		this.accountNumber=accountNumber;
		this.balance=intialDeposition;
		System.out.println("Axis Account has been Successfully created by"+name+"with balance"+balance);
	}
	public void creditAmount(double amount) {
		balance+=amount;
		System.out.println("credited amount in Axis...check total balance:"+balance);
	}
	public void debitAmount(double amount) {
		if(amount>balance) {
			System.out.println("Insufficient amount in Axis to debit");
		}
		else {
			balance-=amount;
			System.out.println("Amount debited from Axis..check balance:"+balance);
		}
	}
	public void transferAmount(Bank1 chooseBank,double amount) {
		if(amount>balance) {
			System.out.println("Insuffient to transfer in Axis");
		}
		else {
			this.debitAmount(amount);
			chooseBank.creditAmount(amount);
			System.out.println("Axis transfered amount"+amount);
		}
	}
	public void miniStatement(){
		System.out.println("Axis statement-Name:"+name+"Balance:"+balance);
	}
}

public class Bank_Interface_labProg14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank1 sbi=new SBI();
		Bank1 axis=new Axis();
		sbi.createAccount("vinuthna", "2425347342", 5000);
		axis.createAccount("Snehith","2746272891", 3000);
		sbi.creditAmount(1500);
        sbi.debitAmount(2000);
        sbi.transferAmount(axis, 1000);
        sbi.miniStatement();

        axis.miniStatement();

	}

}
