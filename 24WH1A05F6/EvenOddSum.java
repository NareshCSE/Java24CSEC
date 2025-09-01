package javaprograms;

//public class EvenOddSum {
	import java.util.Scanner; // Import the Scanner class to read user input

	/**
	 * A JavaSE program that reads a set of integers and prints the sum of even and odd integers separately.
	 */
	public class EvenOddSum {
	    public static void main(String[] args) {
	        // Create a Scanner object for user input
	        Scanner input = new Scanner(System.in);

	        // Declare variables for the sums, initialized to 0
	        int sumEven = 0;
	        int sumOdd = 0;

	        // Prompt the user to enter the number of integers they want to process
	        System.out.print("Enter the number of integers to process: ");
	        int count = input.nextInt();

	        // Loop to read each integer and add it to the correct sum
	        System.out.println("Enter " + count + " integers:");
	        for (int i = 0; i < count; i++) {
	            int number = input.nextInt(); // Read the next integer

	            // Check if the number is even or odd using the modulo operator (%)
	            if (number % 2 == 0) {
	                // If the remainder when divided by 2 is 0, it's an even number
	                sumEven += number;
	            } else {
	                // Otherwise, it's an odd number
	                sumOdd += number;
	            }
	        }

	        // Print the final sums
	        System.out.println("Sum of even integers: " + sumEven);
	        System.out.println("Sum of odd integers: " + sumOdd);

	        // Close the scanner object
	        input.close();
	    }
	}


