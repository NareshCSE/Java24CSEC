package e9;



public class A4a {



	public static void main(String[] args) {

		// print patterns using for/while loops

				// *

				// * *

				// * * *

				// * * * *

				// * * * * *

		int i, j, rows=5;

		for(i=1; i<=rows; i++)

		{

			for(j=1; j<=i; j++)

			{

				System.out.print("* ");

			}

			System.out.println();

		}

	}



}