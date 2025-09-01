package cycle1;
import java.util.*;
public class evenoddsum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner read = new Scanner(System.in);
        int n;
        int num;
        int oddsum,evensum;
        n = read.nextInt();
        for(int i=1; i<=n; i++) {
        	
        
        num = read.nextInt();
        System.out.println(num);
        	if(num%2==0)
        	{
        		 evensum = 0;
        		evensum = evensum +num;
        			}
     
        		
        
        	else
        	{
        		 oddsum=0;
        		oddsum = oddsum +num;
        		
        		
        	}
        	 System.out.println("even sum is" + evensum);
        	 System.out.println("odd sum is" + oddsum);
             
       
	}

	}
}
