package sample;
import java.io.*;

public class PhoneNumberUsingStreamAndHashmap {

	public static void main(String[] args) {
		try {
			FileOutputStream fout=new FileOutputStream("abcd.txt");
		 String memberdata1="9573473681	siri";
		 String memberdata2="4567893214	hari";
		 String memberdata3="5678934289 harshitha";
		 fout.write(memberdata1.getBytes());
		 fout.write(memberdata2.getBytes());
		 fout.write(memberdata3.getBytes());
		 fout.close();
		 
		} catch (Exception e) {
			e.printStackTrace();
		}
				

	}

}
