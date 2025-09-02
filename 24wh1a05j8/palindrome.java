
public class palindrome {

	public static void main(String[] args) {
	 int number=121,remainder,updated=0,target;
	 target=number;
	 while(number>0)
	 {
		 remainder=number%10;
		 number=number/10;
		 updated=updated*10+remainder;
	 }
	 if(target==updated)
	 {
		 System.out.println( "palindrome");
	 }
	 else
	 {
		 System.out.println("not palindrome"); 
	 }
	 
	 

	}

}
