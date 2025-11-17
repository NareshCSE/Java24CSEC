package java_assignment;
import java.util.Random;

class RandomNumber extends Thread{
	int data;
	Random rand=new Random();
	public RandomNumber(int data) {
		this.data=data;
	}
	public void run() {
		int n=rand.nextInt(100);
		System.out.println("Generated number:"+ n);
		if(n%2==0) {
			evenThread t2=new evenThread(n);
			t2.start();
		}
		else {
			oddThread t3=new oddThread(n);
			t3.start();
		}
	}
}
class evenThread extends Thread{
	int data;
	public evenThread(int n) {
		this.data=n;
	}
	public void run() {
		if(data%2==0) {
			System.out.println("Square of the number:"+(data*data));
		}
	}
}
class oddThread extends Thread{
	int data;
	public oddThread(int n) {
		this.data=n;
	}
	public void run() {
		if(data%2!=0) {
			System.out.println("Cube of the number:"+(data*data*data));
		}
	}
}
public class Assignment_17 extends Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 0;
		RandomNumber t1=new RandomNumber(n);
		t1.start();
	}

}
