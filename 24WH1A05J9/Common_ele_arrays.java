package myClass;
import java.util.*;
public class Common_ele_arrays {

	public static void main(String[] args) {
	try(Scanner sc=new Scanner(System.in)){
		int i,j;
		boolean flag=false;
		System.out.print("Enter n value: ");
		int n=sc.nextInt();
		sc.nextLine();
		String a[]=new String[n];
		System.out.print("Enter the first array elements: ");
		for(i=0;i<n;i++) {
			a[i]=sc.nextLine();
		}
		System.out.print("Enter m value: ");
		int m=sc.nextInt();
		sc.nextLine();
		String b[]=new String[m];
		System.out.print("Enter the second array elements: ");
		for(i=0;i<m;i++) {
			b[i]=sc.nextLine();
		}
		System.out.print("The common elements are : ");
		for(i=0;i<n;i++) {
			for(j=0;j<m;j++) {
				if(a[i] .equals (b[j])) {
					System.out.printf("%s ",a[i]);
					flag=true;
					break;
				}
			}
		}
		if(flag==false) {
			System.out.println("No common elements found");
		}
		
				
			}
		}
	}

	
