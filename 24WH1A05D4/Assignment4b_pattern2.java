package javaD4;

public class Assignment4b_pattern2 {

	public static void main(String[] args) {
		int i, j, k, rows=5;
		for(i=1; i<=rows; i++)
		{
			for(j=1; j<=rows-i; j++)
			{
				System.out.print(" ");
			}
			for(k=1; k<=i; k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
