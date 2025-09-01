package cycle1;
import java.util.*;

public class electricitybill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
         Scanner  read = new Scanner(System.in);
         System.out.println("enter new values: ");
          int currentconsumed;
          currentconsumed = read.nextInt();
          int billamount=0;
          if(currentconsumed>0 && currentconsumed<50)
          {
        	  billamount =( currentconsumed)*1;
          }
          else if(currentconsumed>=50 && currentconsumed<100 )
          {
        	  billamount = (currentconsumed-50)*2+50;
          }
          else if(currentconsumed>=100 && currentconsumed<200)
          {
        	  billamount = (currentconsumed-100)*3+150;
          }
          else if(currentconsumed>=200 && currentconsumed<400) {
        	  billamount = (currentconsumed-200)*4+450;
          }
          else {
        	  billamount = (currentconsume-400)*5+1250;
          }
          System.out.println(billamount);
          read.close();
	}

}
