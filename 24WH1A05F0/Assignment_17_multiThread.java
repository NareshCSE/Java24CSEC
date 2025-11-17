package shriya_24WH1A05F0;
import java.util.Random;

class NumberGenerator extends Thread {
    Random rand = new Random();
    public void run() {
        for (int i = 0; i < 3; i++) {
            int num = rand.nextInt(20);
            System.out.println("Generated number: " + num);

            if (num % 2 == 0) {
                new SquareThread(num).start();
            } else {
                new CubeThread(num).start();
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class SquareThread extends Thread {
    int num;
    SquareThread(int n) {
        num = n;
    }
    public void run() {
        System.out.println("Square of " + num + " = " + (num * num));
    }
}

class CubeThread extends Thread {
    int num;
    CubeThread(int n) {
        num = n;
    }
    public void run() {
        System.out.println("Cube of " + num + " = " + (num * num * num));
    }
}

public class Assignment_17_multiThread {
    public static void main(String[] args) {
        NumberGenerator t1 = new NumberGenerator();
        t1.start();
    }
}
