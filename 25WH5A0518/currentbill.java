package Electricity;

import java.util.Scanner;



public class currentbill {

public static void main(String[] args)

{

Scanner sc=new Scanner(System.in);

System.out.println("enter old readings");

int oldreadings=sc.nextInt();

System.out.println("enter new readings");

int newreadings=sc.nextInt();

int actual_readings=newreadings-oldreadings;

if(actual_readings<50) {

System.out.println("the curennt bill is"+(actual_readings*1));

}

else if(actual_readings>50&&actual_readings<100){


System.out.println("the curennt bill is"+(actual_readings*2));

}

else if(actual_readings>100&&actual_readings<200){

System.out.println("the curennt bill is"+(actual_readings*3));

}

else if(actual_readings>200&&actual_readings<300){

System.out.println("the curennt bill is"+(actual_readings*4));

}

else if(actual_readings>300&&actual_readings<400){

System.out.println("the curennt bill is"+(actual_readings*5));

}

else {

System.out.println("the curennt bill is"+(actual_readings*6));

}



}



}