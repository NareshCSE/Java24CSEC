package labexperiments;

import java.util.Random;


class RandomGenerator extends Thread {
    Random random = new Random();

    public void run() {
        for (int i = 1; i <= 10; i++) { //for infinte numbers , write while(true)
            int num = random.nextInt(100); 
            System.out.println("\nRandom generated number " + i + ": " + num);

            if (num % 2 == 0) {
                EvenThread t1 = new EvenThread(num);
                t1.start();
            } else {
                OddThread t2 = new OddThread(num);
                t2.start();
            }

            try {
                Thread.sleep(1000); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("\nRandom number generation completed for 10 numbers.");
    }
}


class EvenThread extends Thread {
    private int num;

    public EvenThread(int num) {
        this.num = num;
    }

    public void run() {
        System.out.println("Generated number is even; square = " + (num * num));
    }
}


class OddThread extends Thread {
    private int num;

    public OddThread(int num) {
        this.num = num;
    }

    public void run() {
        System.out.println("Generated number is odd; cube = " + (num * num * num));
    }
}


public class Multithreads {
    public static void main(String[] args) {
        RandomGenerator t = new RandomGenerator();
        t.start(); 
    }
}
