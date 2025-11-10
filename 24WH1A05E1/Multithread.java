import java.util.*;
class RandomThread extends Thread {
    public void run() {
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            int randomValue = r.nextInt(100);
            System.out.println("\nGenerated number: " + randomValue);

            if (randomValue % 2 == 0) {
                EvenThread t2 = new EvenThread(randomValue);
                t2.start();
            } else {
                OddThread t3 = new OddThread(randomValue);
                t3.start();
            }

            try {
                Thread.sleep(1000); // Wait 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class EvenThread extends Thread {
    int number;

    public EvenThread(int number) {
        this.number = number;
    }

    public void run() {
        System.out.println("Square of " + number + " is: " + (number * number));
    }
}

class OddThread extends Thread {
    int number;

    public OddThread(int number) {
        this.number = number;
    }

    public void run() {
        System.out.println("Cube of " + number + " is: " + (number * number * number));
    }
}

public class Multithread {
    public static void main(String[] args) {
        RandomThread t1 = new RandomThread();
        t1.start();
    }
}