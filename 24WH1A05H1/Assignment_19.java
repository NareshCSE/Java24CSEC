package java_assignment;
import java.io.*; 
import java.io.IOException;
import java.util.*;

public class Assignment_19 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Map<String,String> phoneToname=new HashMap<>();
		Map<String,String> nameTophone=new HashMap<>();
		FileWriter fwriter=new FileWriter("contacts.txt");
		fwriter.write("Shamita    7989677814\n");
		fwriter.write("Ashwitha   9827364728\n");
		fwriter.close();
		FileReader freader=new FileReader("contacts.txt");
		int c;
		while((c=freader.read())!=-1) {
			
		}
	}
}
