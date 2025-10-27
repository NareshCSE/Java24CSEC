package assignments;
import java.util.*;
class PinMisMatchException extends Exception
{
	public PinMisMatchException()
	{
		System.out.println("Sorry your acc.. has been locked");
	}
}

public class Atmpinvalidator {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	try {
	System.out.println("enter name");
	String acc_name=sc.next();
	int pin=4567;
	int n=0;
	while(n<3)
	{
		System.out.println("enter pin no");
		int enterpin=sc.nextInt();
		if(pin==enterpin)
		{
			System.out.println("the acc holder name is"+acc_name+"pin is"+enterpin);
			break;
		}
		n++;
	}
	throw new PinMisMatchException();
	}
	catch(PinMisMatchException e)
	{
		e.getMessage();
	}

  }

}
