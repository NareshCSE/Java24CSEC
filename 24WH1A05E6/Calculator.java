



		package Assignment;
		import java.util.Scanner;
		class Calculator {

			public static void main(String[] args) {
				Scanner reading = new Scanner(System.in);
				System.out.println("Enter num1 : ");
				double num1 = reading.nextDouble();
				System.out.println("Enter num2 : ");
				double num2 = reading.nextDouble();
				System.out.println("Enter the operation(+,-,/,% : ");
				char choice = reading.next().charAt(0);
				switch(choice) {
				case '+' : System.out.println("Addition: " +  (num1+num2));break;
				case '-' : System.out.println("Subtraction: " + (num1 - num2));break;
				case '/' : System.out.println("Division: " + num1/num2);break;
				case '%' : System.out.println("Modulo: " + num1%num2);break;
				default  : System.out.println("Invalid Operation");
				}
				reading.close();
			}

		}



