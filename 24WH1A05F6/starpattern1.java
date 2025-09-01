package javaprograms;

public class starpattern1 {
	//public class StarPattern1 {

	    public static void main(String[] args) {
	        // Pattern a: Right-angled triangle
	        System.out.println("Pattern a:");
	        printRightAngledTriangle(5); // You can change the number of rows here

	        System.out.println("\n"); // Add some spacing between patterns

	        // Pattern b: Solid rectangle (assuming the yellow block represents a filled rectangle)
	        System.out.println("Pattern b:");
	        printSolidRectangle(5, 5); // You can change rows and columns here
	    }

	    /**
	     * Prints a right-angled triangle pattern of stars.
	     *
	     * @param rows The number of rows in the triangle.
	     */
	    public static void printRightAngledTriangle(int rows) {
	        for (int i = 1; i <= rows; i++) { // Outer loop for rows
	            for (int j = 1; j <= i; j++) { // Inner loop for printing stars
	                System.out.print("* ");
	            }
	            System.out.println(); // Move to the next line after each row
	        }
	    }

	    /**
	     * Prints a solid rectangle pattern of stars.
	     *
	     * @param rows    The number of rows in the rectangle.
	     * @param columns The number of columns in the rectangle.
	     */
	    public static void printSolidRectangle(int rows, int columns) {
	        for (int i = 0; i < rows; i++) { // Outer loop for rows
	            for (int j = 0; j < columns; j++) { // Inner loop for printing stars
	                System.out.print("* ");
	            }
	            System.out.println(); // Move to the next line after each row
	        }
	    }
	}



