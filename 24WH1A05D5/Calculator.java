package Java;
import java.util.Scanner;
public class Calculator {

public static void main(String[] args) {

 Scanner sc = new Scanner(System.in);
 System.out.print("1.ADD\n 2.SUBTRACT\n 3.MULTIPLY\n 4.DIVIDE\n 5.EXIT\n");
 while(true) {
  int a=sc.nextInt();
  int b=sc.nextInt();
  System.out.println("Choose a case: ");
  int choice=sc.nextInt();
  switch(choice) {
   case 1: System.out.println("Sum "+(a+b));break;

   case 2: System.out.println("Subtract "+(a-b));break;

   case 3: System.out.println("Multiply "+(a*b));break;

   case 4: System.out.println("Division "+(a/b));break;

   case 5:System.out.println("Exiting program");sc.close();return;

   default: System.out.println("Invalid entry");break;

 }
 System.out.println();
 sc.close();
  }
 }
}

