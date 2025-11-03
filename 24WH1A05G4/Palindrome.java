package Assignment;

public class Palindrome {
    public boolean isPalindrome(int x) {
		int r;
		int temp=x;
		int sum=0;
		
		if(x<0) 
			return false;
		while(x!=0)
			{
				r=x%10;
				sum=sum*10+r;
				x=x/10;
		}
	
			
			return temp==sum;
     }
}

				
	 
        

	


