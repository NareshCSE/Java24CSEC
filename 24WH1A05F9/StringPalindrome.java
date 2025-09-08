package labprograms;

public class StringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="anna";
		String temp="";
		for(int i=name.length()-1;i>=0;i--) {
			temp+=name.charAt(i);
		}
		if (name.equals(temp)) {
			System.out.println("It is a palindrome");
		}
		else {
			System.out.println("Not a palindrome");
		}

	}

}
