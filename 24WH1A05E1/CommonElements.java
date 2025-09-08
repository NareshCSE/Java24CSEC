public class CommonElements {
    public static void main(String[] args) {
        String arr1[] = {"apple", "banana", "cherry", "mango"};
        String arr2[] = {"grapes", "banana", "orange", "mango"};

        System.out.println("Common elements:");
        for(int i=0; i<arr1.length; i++) {
            for(int j=0; j<arr2.length; j++) {
                if(arr1[i].equals(arr2[j])) {
                    System.out.println(arr1[i]);
                }
            }
        }
    }
}
