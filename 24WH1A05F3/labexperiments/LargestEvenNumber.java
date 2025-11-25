package labexperiments;
import java.util.*;
public class LargestEvenNumber {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        String input = sc.nextLine();
	  
	        Set<Character> digitSet = new HashSet<>();
	        for (char ch : input.toCharArray()) {
	            if (Character.isDigit(ch)) {
	                digitSet.add(ch);
	            }
	        }
	        if (digitSet.isEmpty()) {
	            System.out.println(-1);
	            return;}
	        
	        List<Character> digits = new ArrayList<>(digitSet);
	        Collections.sort(digits, Collections.reverseOrder());
	        
	        int evenIndex = -1;
	        for (int i = digits.size() - 1; i >= 0; i--) {
	            char ch = digits.get(i);
	            if ((ch - '0') % 2 == 0) {
	                evenIndex = i;
	                break;
	            }
	        }

	        if (evenIndex == -1) {
	            System.out.println(-1);
	            return;
	        }

	        char evenDigit = digits.remove(evenIndex);
	        digits.add(evenDigit);

	        StringBuilder result = new StringBuilder();
	        for (char ch : digits) {
	            result.append(ch);
	        }
	        System.out.println(result.toString());
	    }
	}


