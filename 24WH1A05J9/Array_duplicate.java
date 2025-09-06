package myClass;
import java.util.Scanner;
public class Array_duplicate {
	public static void main(String[] args) {
		int n,i,j,flag=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of elements: ");
		n=sc.nextInt();
		int[] a=new int[n];
		System.out.print("Enter the values in the array: ");
		for(i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		System.out.print("Duplicate elements: ");
		for(i=0;i<n;i++) {
			for(j=i+1;j<n;j++){
				if(a[i]==a[j]) {
					System.out.printf("%d ",a[i]);
					flag=1;
					break;
				}
			}
		}
		if(flag==0) {
			System.out.print("No duplicates found");
		}
		sc.close();
}
}