package Java;
import java.util.*;
public class common_element_5c {
	public static void main(String[] args) {
        String[] list1 = new String[3];
        String[] list2 = new String[3];
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter values for list1:");
        for (int i = 0; i < list1.length; i++) {
            list1[i] = sc.next();
        }

        System.out.println("Enter values for list2:");
        for (int i = 0; i < list2.length; i++) {
            list2[i] = sc.next();
        }

        System.out.println("Common strings are:");
        for (int i = 0; i < list1.length; i++) {
            for (int j = 0; j < list2.length; j++) {
                if (list1[i].equals(list2[j])) {
                    System.out.print(list2[j] + " ");
                }
            }
        }

        sc.close();
    }
}