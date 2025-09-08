
public class duplicates {

	public static void main(String[] args) {

		        String str = "ad%#6782#@";   

		        boolean[] present = new boolean[10]; 

		        for (int i = 0; i < str.length(); i++) {

		            char ch = str.charAt(i);

		            if (Character.isDigit(ch)) {

		                present[ch - '0'] = true;

		            }

		        }
int smallestEven = -1;
 for (int d = 0; d <= 9; d++) {
	 if (present[d] && d % 2 == 0) {
		 smallestEven = d;
		 break;

		          }

 }
 if (smallestEven == -1) {

		            System.out.println(-1);

		            return;

		        }



		        System.out.println("largest even no:");

		        

		        for (int d = 9; d >= 0; d--) {

		            if (present[d] && d != smallestEven) {

		                System.out.print(d);

		            }

		        }



		     System.out.println(smallestEven);

		       

		    }

		

	}


