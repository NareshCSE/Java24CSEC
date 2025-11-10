package e9;
import java.util.Scanner;
import java.lang.Thread;
import java.util.Random;

class RandGen extends Thread{
	public void run() {
		Scanner sc = new Scanner(System.in);
		Random num = new Random();
		int choice;
		do {
			int randNum = num.nextInt(100);
			System.out.println("The generated number is: " + randNum);
			if(randNum%2==0) {
				evenThread e = new evenThread(randNum);
				e.start();
			}
			else {
				oddThread o = new oddThread(randNum);
				o.start();
			}
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				System.out.println(e);
			}
			System.out.println("Press 0 if you wish to stop and press 1 if you wish to continue: ");
			choice = sc.nextInt();
		}
		while(choice == 1); {
			sc.close();
			System.out.println("The process has been terminated!");
		}
	}
}

class evenThread extends Thread{
	int num;
	evenThread(int randNum){
		num = randNum;
	}
	public void run() {
		System.out.println("The square of " + num + " is: " + num*num);
	}
}

class oddThread extends Thread{
	int num;
	oddThread(int randNum){
		num = randNum;
	}
	public void run() {
		System.out.println("The cube of " + num + " is: " + num*num*num);
	}
}

public class A17 {

	public static void main(String[] args) {
		RandGen g = new RandGen();
		g.start();
	}

}
