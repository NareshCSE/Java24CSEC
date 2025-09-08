package basics;
import java.util.Scanner;
public class lab_exp8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String str=s.next();
		String str1=remove_duplicates(str);
		int[] arr=new int[10];
		arr=extract_digits(str1);
		int max=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("final output:");
		int n=arr.length;
		if(arr[n-1]%2!=0) {
		int temp=arr[n-1];
		arr[n-1]=arr[n-2];
		arr[n-2]=temp;
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]);
			}
		}
		else {
			for(int i=0;i<arr.length;i++) {
				System.out.print(arr[i]);
			}
		}
	}
	public static String remove_duplicates(String str) {
		StringBuilder sb = new StringBuilder(str);
		for(int i=0;i<sb.length();i++) {
			for(int j=i+1;j<sb.length();j++) {
				if(sb.charAt(i)==sb.charAt(j)) {
					sb.deleteCharAt(j);
					j--;
				}
			}
			 str = sb.toString();  
		}
		System.out.println("after removing duplicates from string :");
		System.out.println(str);
		return str;
	}
	public static int[] extract_digits(String str) {
		int j=0;
		int[] arr=new int[str.length()];
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)>='0' && str.charAt(i)<='9') {
				arr[j]=str.charAt(i)-'0';
				j++;
			}
		}
		int result[]=new int[j];
		System.out.println("after extracting digits:");
		for(int i=0;i<j;i++) {
			result[i]=arr[i];
			System.out.print(result[i]);
		}
		System.out.println();
		return result;
	}

}

