package Assignment;

public class CommonElements {
    public static void main(String[] args) {
        String[] array1 = {"poo", "lalli", "preethi", "kau"};
        String[] array2 = {"kau", "harini", "harshika", "poo"};

        System.out.println("Common elements:");

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i].equals(array2[j])) {
                    System.out.println(array1[i]);
                }
            }
        }
    }
}
