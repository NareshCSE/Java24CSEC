package e9;

public class A5a {

    public static void main(String[] args) {
        int[] numbers = {1, 5, 2, 3, 5, 4, 2, 6, 1};

        System.out.println("Duplicate elements in the array:");

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    System.out.println(numbers[i]);
                    break; 
                }
            }
        }
    }
}