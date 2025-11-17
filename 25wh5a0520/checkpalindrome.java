package java_25wh5a0520;

public class CheckPalindrome_strings {

	public static void main(String[] args) {
		String str=new String("heeh");
		int len=str.length();
		String reversed="";
		for(int i=len-1;i>=0;i--)
		{
			reversed+=str.charAt(i);
			
		}
		System.out.println(reversed+" "+str);
		if(reversed.equals(str))
		{
			System.out.println("the given string is palindrome");
		}
		else
		{
			System.out.println("the given string is not a palindrome");
		}
		
	}

}

