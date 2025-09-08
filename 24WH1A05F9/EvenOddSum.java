package labprograms;
import java.util.Scanner;

public class EvenOddSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				 Scanner sc=new Scanner(System.in);
					int sumeven=0,sumodd=0;
					int n=sc.nextInt();
					for(int i=1;i<n;i++){
						if(i%2==0)
							sumeven=sumeven+i;
						else
							sumodd=sumodd+i;
						}
					System.out.println("sum of even integers is: "+sumeven);
					System.out.println("sum of odd integers is: "+sumodd);
			}
		}

