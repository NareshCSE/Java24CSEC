import java.util.Scanner;
public class Duplicate_array {

	public static void main(String[] args) {

		int[] num=new int[5];

		Scanner sc=new Scanner(System.in);

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