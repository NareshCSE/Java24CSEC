package navya_25wh5a0517;

import java.util.*;
public class Calculator {
public static void main(String[] args) {

int num1, num2, res;
char op;
Scanner sc = new Scanner(System.in);
System.out.println("Enter num1: ");
num1 = sc.nextInt();
System.out.println("Enter num2: ");
num2 = sc.nextInt();
System.out.println("Enter operator: ");
op = sc.next().charAt(0);
switch(op) {
case '+':
res = num1 + num2;
System.out.println("res = " + res);
break;
case '-':
res = num1 - num2;
System.out.println("res = " + res);
break;
case '*':
res = num1 * num2;
System.out.println("res = " + res);
break;
case '/':
res = num1/num2;
System.out.println("res = " + res);
break;
case '%':

res = num1 % num2;

System.out.println("res = " + res);
break;
default:
System.out.println("Invalid Operator");
}
}
}
