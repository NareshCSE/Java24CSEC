import java.util.Scanner;
public class Common_array {

	public static void main(String[] args) {
	

		Scanner sc=new Scanner(System.in);

		System.out.println("enter size of arr1:");

		int size1= sc.nextInt();

		String[] arr1 = new String[size1];

		System.out.println("values of arr1:");

		for(int i =0;i<size1;i++) {

			arr1[i]=sc.next();

		}

		System.out.println("enter size of arr2:");

		int size2=sc.nextInt();

		String[] arr2 = new String[size2];

		System.out.println("values of arr2:");

		for(int j=0;j<size2;j++) {

			arr2[j]=sc.next();

		}

		 System.out.print("finding the common elements:");

		 for(int i=0;i<size1;i++) {

			 for(int j=0;j<=i;j++) {

				 if(arr1[i].equals(arr2[j])) {

					 System.out.println(arr1[i]);

				 }
			 }
		 }
	}
}