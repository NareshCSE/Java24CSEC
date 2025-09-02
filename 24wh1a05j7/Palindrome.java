
public class Palindrome {
    public static void main (String[] args) {
	int number = 1,remainder, sum=0, target= number;
	while (number>0) {
		remainder = number%10;
		sum = sum*10+ remainder;
		number = number/10;
	}
	if (target==sum) {
		System.out.println(target + " is palindrome");
	}
	else {
		System.out.println(target + "is not a palindrome");
	}
}
}
