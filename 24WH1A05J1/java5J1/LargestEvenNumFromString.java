import java.util.Scanner;
import java.util.TreeSet;

public class LargestEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = sc.next();
        TreeSet<Integer> digits = new TreeSet<>(); 
        for(char c : s.toCharArray()) {
            if(Character.isDigit(c)) digits.add(c - '0');
        }

        String result = "";
        for(int d : digits.descendingSet()) result += d; // largest to smallest

        if(result.length() > 0 && (result.charAt(result.length()-1)-'0') %2 == 0)
            System.out.println("Largest Even Number: " + result);
        else System.out.println(-1);
    }
}
