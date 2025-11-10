package sample;
import java.util.*;
class RandomThread extends Thread
{
	
	public void run()
	{
		Random r=new Random();
		int randomvalue=r.nextInt();
		if(randomvalue%2==0)
		{
			EvenThread t2 =new EvenThread(randomvalue);
			t2.start();
		}
		else
		{
			OddThread t3=new OddThread(randomvalue);
			t3.start();
		}
	}
	
}
class EvenThread extends Thread{
	int number1;
	public EvenThread(int randomvalue)
	{
		this.number1=randomvalue;
	}
	public void run()
	{
		System.out.println("the square of the randomvalue is:"+number1*number1);
	}
}
class OddThread extends Thread{
	int number2;
	public OddThread(int randomvalue)
	{
		this.number2=randomvalue;
	}
	public void run()
	{
		System.out.println("the cube of the randomvalue is:"+number2*number2*number2);
	}
}


class MultithreadExample extends Thread{

	public static void main(String[] args) {
	
		RandomThread t1 =new RandomThread();
		t1.start();
	}
}
