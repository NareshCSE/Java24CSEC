package practice;
public class checkpalindrome {

	public static void main(String[] args) {
		String str=new String("hello");
		int len=str.length();
		String reversed=" ";
		
		int i;
		for(i=0;i<len;i++)
		{
			reversed(i)=str(-(i+1));
			
		}
		if(reversed==str)
		{
			System.out.println("the given string is palindrome");
		}
		else
		{
			System.out.println("the given string is not a palindrome");
		}
			
	
	}

}
