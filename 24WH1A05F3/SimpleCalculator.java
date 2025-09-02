import java.util.Scanner;
public class SimpleCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read = new Scanner(System.in);

        while (true) {
            System.out.println("MENU");
            System.out.print("1.ADD\n2.SUBTRACT\n3.MULTIPLY\n4.DIVIDE\n5.MODULO\n6.EXIT\n");
            System.out.print("Choose your choice: ");
            int choice = read.nextInt();
            System.out.print("ENTER FIRST NUMBER: ");
            int num1 = read.nextInt();
            System.out.print("ENTER SECOND NUMBER: ");
            int num2 = read.nextInt();

            // If you want to process exit in switch, no need to check here anymore

            switch (choice) {
                case 1:System.out.println("SUM OF TWO NUMBERS: " + (num1 + num2));break;
                case 2:System.out.println("DIFFERENCE OF TWO NUMBERS: " + (num1 - num2));break;

                case 3:System.out.println("PRODUCT OF TWO NUMBERS: " + (num1 * num2));break;

                case 4:
                    
                    if (num2 != 0) {
                        System.out.println("QUOTIENT OF TWO NUMBERS: " + (num1 / num2));
                    } else {
                        System.out.println("Error: Division by zero!");
                    }
                    break;

                case 5:
                   
                    if (num2 != 0) {
                        System.out.println("REMAINDER OF TWO NUMBERS: " + (num1 % num2));
                    } else {
                        System.out.println("Error: Division by zero!");
                    }
                    break;

                case 6:
                    System.out.println("THANK YOU");
                    read.close();      
                    System.exit(0);   
                    break;

                default:
                    System.out.println("INVALID CHOICE! PLEASE CHOOSE AGAIN.");
            }

        }
        
	}
	}


