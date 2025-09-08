package javacodes;

import java.util.Scanner;
public class exp_5c {

	public static void main(String[] args) {
		String[] str1=new String[3];
		String[] str2=new String[3];
		Scanner s=new Scanner(System.in);
		System.out.println("Enter string1 elements:");
		for(int i=0;i<str1.length;i++) {
			str1[i]=s.next();
		}
		System.out.println("Enter string2 elements:");
		for(int i=0;i<str2.length;i++) {
			str2[i]=s.next();
	}
		for(int i=0;i<str1.length;i++) {
			for(int j=0;j<str2.length;j++) {
				if(str1[i].equals(str2[j]))
					System.out.print(str2[j]+" ");
			}
		}

	}

}

}

