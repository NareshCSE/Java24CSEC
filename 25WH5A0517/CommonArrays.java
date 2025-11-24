package navya_25wh5a0517;

import java.util.*;
public class CommonArrays {
public static void main(String[] args) {
int n1, n2, i,j;
Scanner sc = new Scanner(System.in);
System.out.println("25WH5A0517\n");
System.out.print("Enter size of 1st Array: ");
n1 = sc.nextInt();
sc.nextLine();
String[] arr1 = new String[n1];
System.out.println("Enter elements:");
for (i = 0; i < n1; i++)
arr1[i] = sc.nextLine();
System.out.print("Enter size of 2nd Array: ");
n2 = sc.nextInt();
sc.nextLine();
String[] arr2 = new String[n2];
System.out.println("Enter elements:");
for (i = 0; i < n2; i++)
arr2[i] = sc.nextLine();
System.out.println("Common Elements:");
for (i = 0; i < n1; i++) {
for (j = 0; j < n2; j++) {
if (arr1[i].equals(arr2[j]))
System.out.println(arr1[i]);
}
}
}
}

