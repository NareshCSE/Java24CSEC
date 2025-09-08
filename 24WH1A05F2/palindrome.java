package java_lab_exp;
public class palindrome {
	public static void main(String[] args) {
		int number,remainder,sum,temp;
		number=120;
		temp=number;
		sum=0;
		while(number!=0) {
			remainder=number%10;
			sum=(sum*10)+remainder;
			number=number/10;
		}
		if(sum==temp) {
			System.out.println("This is a palindrome number");
	}
		else {
			System.out.println("This is not a palindeome number");

}
	}
}





	
		
		
	
		
