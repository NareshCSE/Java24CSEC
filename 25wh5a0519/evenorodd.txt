import java.util.Scanner;





public class evenorodd{


public static void main(String[] args) {




Scanner sc=new Scanner(System.in);

int sum_even=0;

int sum_odd=0;

System.out.println("Enter the number of elements: ");

int n=sc.nextInt();


System.out.println("Enter "+n+" Integers: ");

for(int i=0;i<n;i++){

int num=sc.nextInt();

if(num%2==0) {

sum_even+=num;

}


sum_odd+=num;


}
System.out.println("Sum of even numbers: "+ sum_even);

System.out.println("SUm of odd numbers: "+ sum_odd);
sc.close();

}





}