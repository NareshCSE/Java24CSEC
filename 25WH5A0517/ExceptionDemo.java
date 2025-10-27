package sampleprograms;
import java.util.*;
public class creditsNotSufficient extends Exception{
	public creditsNotSufficient() {
		
		System.out.println("Credits not sufficient Exception");
	}
	
}
class simple{
	void Sample(int credits)throws creditsNotSufficient{
		if(credits<50) {
			throw new creditsNotSufficient();
		}
		else {
			System.out.println("credits are"+credits);
		}
	}
}


	

public class ExceptionDemo extends simple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter your Credits:");
		Scanner sc=new Scanner(System.in);
		int credits=sc.nextInt();
       try {
    	   simple s=new simple();
    	  s.Sample(credits);
       }
       catch(creditsNotSufficient e) {
    	   e.printStackTrace();
       }
	}

}
