package navya_25wh5a0517;


import java.util.*;
public class Duplicate {
public static void main(String[] args) {
int i,j,n;
Scanner sc = new Scanner(System.in);
System.out.println("25WH5A0517"
+ "\n");
System.out.print("Enter size of array: ");
n = sc.nextInt();
int[] arr = new int[n];
System.out.println("Enter " + n + " elements:");
for (i = 0; i < n; i++)
arr[i] = sc.nextInt();
System.out.print("Duplicate elements: ");
for (i = 0; i < n; i++) {
for (j = i + 1; j < n; j++) {
if (arr[i] == arr[j]) {
System.out.print(arr[i] + " ");
}
}
}
}
}

