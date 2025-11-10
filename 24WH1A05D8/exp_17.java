package basics;

public class exp_17 {
	private static int number=0;
	private static boolean ready=false;
	private static Object lock=new Object();
	static class GeneratorThread extends Thread{
		public void run() {
			System.out.println("generator thread is started");
			try {
				while (!Thread.currentThread().isInterrupted()) {
					int num=(int)(Math.random()*100);
					synchronized (lock) {
                        while (ready) {
                            lock.wait(10); 
                        }
                        number=num;
                        ready=true;
                        System.out.println("generated number : "+num);
                        Thread.sleep(1000);
				}
			}
		}catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
	}
	}
	static class EvenThread extends Thread{
		public void run() {
			System.out.println("even thread has started");
		try {
			while (!Thread.currentThread().isInterrupted()) {
				synchronized(lock) {
					if(ready && number%2==0) {
						int square=number*number;
						System.out.println(" square is : "+square);
						ready=false;
						lock.notifyAll();
					}
				}
				Thread.sleep(10);
			}
		}catch(InterruptedException e) {
			Thread.currentThread().interrupt();
		}
	}
	}
	static class oddThread extends Thread{
		public void run(){
			System.out.println("odd thread has started");
			try {
				while (!Thread.currentThread().isInterrupted()) {
					synchronized(lock) {
						if(ready && number%2!=0) {
							int cube=number*number*number;
							System.out.println(" cube is : "+ cube);
							ready=false;
							lock.notifyAll();
						}
					}
					Thread.sleep(10);
				}
			}catch(InterruptedException e ) {
				Thread.currentThread().interrupt();
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GeneratorThread generator=new GeneratorThread();
		generator.start();
		EvenThread even=new EvenThread();
		even.start();
		oddThread odd=new oddThread();
		odd.start();
		try {
            System.out.println("\nApplication will run for 10 seconds.");
            Thread.sleep(10000); 

            generator.interrupt();
            even.interrupt();
            odd.interrupt();
            
            generator.join();
            even.join();
            odd.join();

        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
	}

}
