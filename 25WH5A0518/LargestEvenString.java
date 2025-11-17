package sathvika_25wh5a0518;

import java.util.Scanner;
public class LargestEvenString {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter the string: ");
String str = sc.nextLine();
boolean[] digitPresent = new boolean[10]; // track digits 0-9 present
// Extract digits and mark them in digitPresent
for (int i = 0; i < str.length(); i++) {
char ch = str.charAt(i);
if (Character.isDigit(ch)) {
int digit = ch- '0';
digitPresent[digit] = true;
}
}
int largestEven =-1;
// Check for largest even digit from 8 down to 0
for (int i = 8; i >= 0; i-= 2) {
if (digitPresent[i]) {
largestEven = i;
break;
}
}
if (largestEven ==-1) {
System.out.println("No even digit found in the string.");
} else {
System.out.println("Largest even digit: " + largestEven);
}
sc.close();
}
}