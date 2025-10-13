package javaprograms;

public class pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j<n-1;j++)
			{
				System.out.print(" ");
			}
			for(int w=1;w<=i;w++)
			{
				System.out.print(w);
			}
			for(int j=n-1;j>=1;j--)
			{
				System.out.print(j);
			}
			System.out.println( );
		}

	}

}
