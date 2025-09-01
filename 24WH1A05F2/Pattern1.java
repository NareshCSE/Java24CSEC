package java5f2core;
import java.util.*;
public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		pattern();

	}
	static void pattern()
	{
		for(int i=0; i<5; i++) 
		{
			for(int j=0; j<i; j++)
			{
				System.out.println("*");
			}
			System.out.println();
		}
	}
	static void pattern1()
	{
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=5-i; j++) {
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
    
}
