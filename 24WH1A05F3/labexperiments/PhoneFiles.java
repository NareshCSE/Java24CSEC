package labexperiments;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class PhoneFiles {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Map<String, String> table=new Hashtable();
		String phone=null;
		String name = null;
		try {
			FileWriter f=new FileWriter("myfile.txt");
			String str="harshitha \t 95463798267";
			for(int i=0;i<str.length();i++) {
				f.write(str.charAt(i));
			}
			 String[] fields = str.split("\t");
             if (fields.length == 2) {
                 name = fields[0].trim();
                 phone = fields[1].trim();
                 table.put(name, phone);
             }
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("table contains "+table.get(name)+":"+name);
		System.out.println("enter name");
		String name1=sc.next();
		if(table.containsKey(name1))
			System.out.println("data is found :"+table.toString());
		else
			System.out.println("not found");
	}

}
