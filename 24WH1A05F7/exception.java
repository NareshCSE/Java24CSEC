package javalabexp;

	import java.util.Scanner;
	class CreditsNotSufficientException extends RuntimeException {
	    public CreditsNotSufficientException() {
	        super("Credits are not sufficient to get promoted");
	    }
	}
	class exception {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter number of credits:");
	        int credits = sc.nextInt();
	    	try {
	    		creditsCheck(credits);
	    	} catch (CreditsNotSufficientException e) {
	    		e.printStackTrace();
	    	}
	    	sc.close();
	    }
	    public static void creditsCheck(int credits) {
	        if (credits >= 50) {
	            System.out.println("Your credits are " + credits + ". You are promoted!");
	        } else {
	            throw new CreditsNotSufficientException();
	        }
	    }
	}
