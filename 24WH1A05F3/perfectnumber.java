package com.studyopedia;

public class perfectnumber {

	public static void main(String[] args) {
		int i,number,sum;
		sum=0;
		number=7;
		for(i=1;i<=number;i++) {
			if(number%i==0) {
				sum=sum+i;
			}	
		}
		if(sum==2*number) {
			System.out.println("it is perfect number");
		}
		else {
			System.out.println("not a perfect number");
		}
		    
		
		// TODO Auto-generated method stub

	}

}



