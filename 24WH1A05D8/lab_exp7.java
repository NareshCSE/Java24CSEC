package basics;
import java.util.Scanner;
public class lab_exp7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter a string");
		String str=s.next();
		if(is_palindrome(str))
			System.out.println("given string is palindrome"+" "+str);
		else
			System.out.println("given string is not a palindrome"+" "+str);
	}
	public static boolean is_palindrome(String str) {
		for(int i=0;i<str.length()/2;i++) {
				if(str.charAt(i) != str.charAt((str.length()-1)- i)) {
					return false;
				}
			}
		return true;
	}

}
