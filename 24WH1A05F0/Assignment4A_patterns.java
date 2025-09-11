package lab_assignments;

public class Assignment_4A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows = 4;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(); // Move to the next line
        }

	}

}
