package Java;
import java.util.Scanner;
public class Current_Bill {
	
public static void main(String[] args) {

 Scanner sc=new Scanner(System.in);
 int o=sc.nextInt();
 int n=sc.nextInt();
 int slab=o-n;
 int c=0;
 if(slab<=50) {
   c=1;
   System.out.println(slab*c);}
 else if(slab>50 && slab<=100) {
  c=2;
  System.out.println((slab-50)*c+50);}
 else if(slab>100 && slab<=200) {
  c=3;
  System.out.println((slab-100)*c+50+50*2);}
 else if(slab>200 && slab<=400) {
  c=4;
  System.out.println((slab-50-50)*c+50);}
 else if(slab>500){
  c=5;
  System.out.println((slab-50-50-100-200)*c+50+100+300+800);}
 sc.close();
 }
}