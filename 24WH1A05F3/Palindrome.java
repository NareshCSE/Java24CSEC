package com.studyopedia;

public class Palindrome {

	public static void main(String[] args) {
		int number,remainder,sum,temp;
		number=120;
		temp=number;
		sum=0;
		while(number!=0) {
			remainder=number%10;
			sum=(sum*10)+remainder;
			number=number/10;
		}
		if(sum==temp) {
			System.out.println("It is palindrome");
			}
		
		else{
			
			System.out.println("not a palindrome");
		}
		
		}
		
		// TODO Auto-generated method stub

	}

