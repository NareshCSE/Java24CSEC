package javacodes;

import java.util.Scanner;
public class exp_5a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int[] arr=new int[8];
		System.out.println("Enetr array elements:");
		for(int i=0;i<arr.length;i++) {
			arr[i]=s.nextInt();
		}
		System.out.println("The duplicate elements are:");
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j])
					System.out.print(arr[j]+" ");
			}
		}

	}

}

}

