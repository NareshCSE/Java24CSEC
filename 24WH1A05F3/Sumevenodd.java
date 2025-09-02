import java.util.Scanner;
public class Sumevenodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read = new Scanner(System.in);

		System.out.println("Enter number of elements:");
		int n= read.nextInt();
		int arr[]=new int[n];
		int evensum=0;
		int oddsum=0;
		int i;
		System.out.println("Enter the integer elements:");
		for(i=0;i<n;i++) {
			arr[i]= read.nextInt();
			if(arr[i]%2==0) {
				evensum+=arr[i];
			}
			else {
				oddsum+=arr[i];
			}
		}
		System.out.println("SUM of even integers is "+ evensum);
		System.out.println("SUM of odd integers is "+ oddsum);
		read.close();
		

	
	}

}
