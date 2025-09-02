package evenodd;

import java.util.*;

import java.util.Scanner;





public class sum {

	public static void main(String[] args) {				// TODO Auto-generated method stub 

				int even=0, odd = 0,num,element;

				Scanner sc = new Scanner(System.in);

				System.out.println("Enter size of array: ");

				num = sc.nextInt();

				for(int i=1; i<=num; i++) {

					element = sc.nextInt();

					if(element % 2 == 0) {

						even = even+ element;

					}

					else {

						odd = odd + element;

					}

				}

				System.out.println("even sum = " + even);

				System.out.println("ood sum = " + odd);

			}
}