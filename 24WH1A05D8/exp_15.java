package java_practice;

class CreditsNotSufficientException extends Exception{
	private int requiredcredits=50;
	private int currentcredits;
	public CreditsNotSufficientException(int currentcredits) {
		super("credits are less than 50, credit not sufficient exception "+currentcredits);
		this.currentcredits=currentcredits;
	}
	public int getRequiredcredits() {
		return requiredcredits;
	}
	public int getCurrentcredits() {
		return currentcredits;
	}
}
public class exp_15 {
	public static void checkCredits(String username,int credits) throws CreditsNotSufficientException{
		int minCredits=50;
		System.out.println("checking credits for :"+username);
		if(credits<minCredits) {
			throw new CreditsNotSufficientException(credits);
		}
		System.out.println("credits are sufficient:"+credits);
	}
	public static void PurchaseBasic(String username,int credits){
		System.out.println("purchasing basic item for : "+username);
		try {
			checkCredits(username,credits);
			System.out.println("purchase successful");
		}catch(CreditsNotSufficientException e) {
			System.out.println("Credit is not sufficient:"+e.getCurrentcredits());
			System.out.println("error in purchasing basic item for :"+username+":"+e.getMessage());
		}catch(Exception e) {
			System.out.println("unexpected error occured"+e.getMessage());
		}
	}
	public static void Premiumpurchase(String username,int credits) throws CreditsNotSufficientException{
		System.out.println("purchasing premium item for : "+username);
		checkCredits(username,credits);
		System.out.println("Premium purchase successful");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PurchaseBasic("Vaish",80);
		PurchaseBasic("Sharab",75);
		try {
			Premiumpurchase("mala",35);
		}catch(CreditsNotSufficientException e){
			System.out.println("transaction failed"+e.getMessage());
		}catch(Exception e) {
			System.out.println("unexpected error"+e.getMessage());
		}
		try {
			Premiumpurchase("anand",50);
		}catch(CreditsNotSufficientException e){
			System.out.println("transaction failed"+e.getMessage());
		}
	}

}

