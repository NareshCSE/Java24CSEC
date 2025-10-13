package javaprograms;

public class pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j<=n;j++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<(2*i)-1;j++)
			{
				System.out.print("*");
			}
			System.out.println( );
		}
		for(int i=n-1;i>=1;i--)
		{
			for(int j=n;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int j=(2*i)-1;j>=1;j--)
			{
				System.out.print("*");
			}

			System.out.println( );
		
		}

	}

}
