package src;

import java.util.Scanner;

public class calci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
      Scanner num = new Scanner(System.in);
      System.out.println("Enter number 1:");
      int a = num.nextInt();
      System.out.println("Enter number 2:");
      int b = num.nextInt();
      System.out.println("\t MENU\n1. Addition\n2.Subtraction\n3.Multiply\n4.Division\n");
      System.out.println("Enter your choice:");
      i = num.nextInt();
      switch(i) {
      case 1: System.out.println(a+b);break;
      case 2: System.out.println (a-b);break;
      case 3: System.out.println(a*b);break;
      case 4: System.out.println(a/b);break;
      }
      
	}
}
