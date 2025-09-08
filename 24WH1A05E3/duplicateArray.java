package assignments;
import java.util.Scanner;

public class duplicateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num=new int[5];

		Scanner sc=new Scanner(System.in);
        System.out.print("enter 5 numbers:");
		for(int i=0;i<5;i++) {

			num[i]=sc.nextInt();

		}

		System.out.println("Finding duplicates");

		for(int i=0;i<5;i++) {

			for(int j=i+1;j<5;j++) {

				if (num[i]==num[j]) {

					System.out.println(num[i]);

				}

			}

		}

	}

}
