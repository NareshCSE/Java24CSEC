
public class Palindromeloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int remainder,sum=0,target,temp;
		for(int i=1;i<200;i++) {
			target=i;sum=0;temp=i;
			while(temp>0) {
				remainder=temp%10;
				temp=temp/10;
				sum=sum*10+remainder;
			}
			if(target==sum)
			{
				System.out.println(target);
				System.out.println("palindrome");
				
			}
			
		}

	}

}
