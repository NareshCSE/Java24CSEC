
public class perfect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=28,sum=0;
		for(int i=1;i<number;i++) {
			if(number%i==0)
			{
				sum=sum+i;
			}
		}
		if(number==sum) {
			System.out.println( "perfect number");
		}
		else {
			System.out.println( "not a perfect number");
		}

	}

}
