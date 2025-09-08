package Practicejava;

public class duplicate {
	
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 2, 4, 5, 5, 8, 9, 7, 9, 4, 6, 2, 6, 6, 7, 3};
        findDuplicates(numbers);
    }

    public static void findDuplicates(int[] arr) {
        System.out.print("Duplicate values: ");

        for (int i = 0; i < arr.length; i++) {
           
            int PrintedCount = 0;
            for (int k = 0; k < i; k++) {
                if (arr[i] == arr[k]) {
                    PrintedCount++;
                }
            }
            if (PrintedCount > 0) {
                continue;
            }
            int duplicateCount = 0;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    duplicateCount++;
                }
            }

            if (duplicateCount > 0) {
                System.out.print(arr[i] + " ");
            }
        }

        System.out.println();
    }
}



