package assignments;
import java.util.Scanner;

public class commonElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the size of arr1:");
		int size1=sc.nextInt();
	
		
		String[] arr1=new String[size1];
		System.out.println("Elements of array1:");
		for(int i=0;i<size1;i++) {
			arr1[i]=sc.next();
		}
	 
		System.out.print("enter the size of arr2:");
		int size2=sc.nextInt();
		
		String []arr2=new String[size2];
		System.out.println("elements of array2:");
		for(int j=0;j<size2;j++) {
			arr2[j]=sc.next();
		}
		System.out.println("Common elements between two array:");
		for(int i=0;i<size1;i++) {
			for(int j=0;j<=i;j++) {
				if(arr1[i].equals(arr2[j])) {
					System.out.println(arr1[i]);
				}
			}
		}
	}

}
