
public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String original = "madam";
         String reversed = "";
         for(int i=original.length()-1;i>=0;i--) {
        	 reversed = reversed+original.charAt(i);
         }
         if(original.equals(reversed)) {
        	 System.out.println(original + "is palindrome");
         }
         else {
        	 System.out.println(original + "not palindrome");
         }
	}

}
