package javac;
import java.util.Scanner;

public class java1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("no.of integers:");
		int n=sc.nextInt();
		int esum=0;
		int osum=0;
		System.out.println("enter"+n+"numbers:");
		for(int i=0;i<n;i++) {
			int num=sc.nextInt();
			if(num%2==0) {
				esum+=num;
			}
			else {
				osum+=num;
			}
			
		}
		System.out.println("esum:"+esum);
		System.out.println("osum:"+osum);
		sc.close();

	}

}
