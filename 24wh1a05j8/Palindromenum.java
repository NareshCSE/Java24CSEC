
public class Palindromenum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=120,remainder,target,sum=0;
		while(number!=0) {
		 target=number;
		 sum=0;
		 while(target>0)
		 {
			 remainder=target%10;
			 target=target/10;
			 sum=sum*10+remainder;
		 }
		 if(number==sum)
		 {
			 System.out.println( number+"palindrome");
			 break;
		 }
		 else {
			 number=number+1;
		 }
	
	}

}}
