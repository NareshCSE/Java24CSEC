
public class palindrome {

	public static void main(String[]args) {
	String original="MOM";
	String reverse="";
	for(int i =original.length()-1;i>=0;i--) {
		reverse= reverse+original.charAt(i);
	}
	if(original.equals(reverse)) {
		System.out.println(original+" is a palindrome");
		}
	else {
		System.out.println(original+" is not palindrome ");
	
	
	}	

	}

}
