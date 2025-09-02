
public class collatz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=60,target=1;
		while(target>0) {
			if(number%2==0)
			{
				target=number/2;
			}
			else {
				target=3*number+1;
			}
			number=target;
			 System.out.println( target);
			if(target==1)
			{
				break;
			}
			
		}

	}

}
