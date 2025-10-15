package java_lab_exp;

public class Q5cCommonElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr1 = {"apple", "banana", "mango"};
        String[] arr2 = {"banana", "grapes", "apple"};

        System.out.println("Common elements:");
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i].equals(arr2[j])) {
                    System.out.println(arr1[i]);
                }
            }
        }
	}

}
