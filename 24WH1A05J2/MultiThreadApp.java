package vaishnavi;
import java.util.Random;

class NumberHolder {
    int number;
    boolean isReady = false;
}

class Generator implements Runnable {
    NumberHolder holder;

    public Generator(NumberHolder holder) {
        this.holder = holder;
    }

    @Override
    public void run() {
        Random rand = new Random();
        while (true) {
            synchronized (holder) {
                holder.number = rand.nextInt(100); 
                holder.isReady = true;
                System.out.println("Generated: " + holder.number);
                holder.notifyAll();
            }
            try {
                Thread.sleep(1000); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class EvenProcessor implements Runnable {
    NumberHolder holder;

    public EvenProcessor(NumberHolder holder) {
        this.holder = holder;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (holder) {
                try {
                    holder.wait();
                    if (holder.isReady && holder.number % 2 == 0) {
                        System.out.println("Even → Square: " + (holder.number * holder.number));
                        holder.isReady = false;
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

class OddProcessor implements Runnable {
    NumberHolder holder;

    public OddProcessor(NumberHolder holder) {
        this.holder = holder;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (holder) {
                try {
                    holder.wait();
                    if (holder.isReady && holder.number % 2 != 0) {
                        System.out.println("Odd → Cube: " + (holder.number * holder.number * holder.number));
                        holder.isReady = false;
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

public class MultiThreadApp {
    public static void main(String[] args) {
        NumberHolder holder = new NumberHolder();

        Thread t1 = new Thread(new Generator(holder));
        Thread t2 = new Thread(new EvenProcessor(holder));
        Thread t3 = new Thread(new OddProcessor(holder));

        t1.start();
        t2.start();
        t3.start();
    }
}