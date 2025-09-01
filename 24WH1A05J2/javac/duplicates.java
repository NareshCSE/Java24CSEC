package javac;
import java.util.Arrays;

public class duplicates {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 5, 5};
        Arrays.sort(arr);

        System.out.println("Duplicates:");
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                System.out.println(arr[i]);
            }
        }
    }
}

