package assignments;

import java.util.*;

class CreditsNotSufficientException extends Exception {
	public CreditsNotSufficientException() {
		System.out.println("credits are not sufficient");
	}
}

class Demo {
	
	void getcredits(int credits) throws CreditsNotSufficientException {
		if (credits < 50)
			throw new CreditsNotSufficientException();
	}
}

public class Raisingexception extends Demo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no of credits");
		int credits = sc.nextInt();

		try {
			Demo demo = new Demo();
			demo.getcredits(credits);
		} catch (CreditsNotSufficientException e) {
			e.getMessage();
		}
	}

}
