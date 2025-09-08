package Practicejava;

public class Commonelements {

    public static void main(String[] args) {
        String[] arr1 = {"A", "B", "Y", "R", "U", "I", "T", "kau"};
        String[] arr2 = {"kau", "A", "lalli", "R", "harsh", "B"};

        findCommonElements(arr1, arr2);
    }
    public static void findCommonElements(String[] arr1, String[] arr2) {
        System.out.println("Common values:");

        for (int i = 0; i < arr1.length; i++) {

            boolean alreadyChecked = false;
            for (int k = 0; k < i; k++) {
                if (arr1[i].equals(arr1[k])) {
                    alreadyChecked = true;
                    break;
                }
            }
            if (alreadyChecked) {
                continue;
            }
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i].equals(arr2[j])) {
                    System.out.print(arr1[i] + " ");
                    break; 
                }
            }
        }
        System.out.println(); 
    }
}

