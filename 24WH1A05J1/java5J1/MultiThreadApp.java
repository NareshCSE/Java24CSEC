import java.util.Random;

public class MultiThreadApp {

    static class NumberGenerator extends Thread {
        public void run() {
            Random rand = new Random();
            int count = 0;

            while (count < 10) {
                int num = rand.nextInt(100);
                System.out.println("Generated Number: " + num);

                if (num % 2 == 0) {
                    Thread squareThread = new Thread(() -> {
                        System.out.println("Square of " + num + " is " + (num * num));
                    });
                    squareThread.start();
                } else {
                    Thread cubeThread = new Thread(() -> {
                        System.out.println("Cube of " + num + " is " + (num * num * num));
                    });
                    cubeThread.start();
                }

                count++;

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("Generator interrupted");
                }
            }

            System.out.println("\nFinished generating numbers. Program stopped.");
        }
    }

    public static void main(String[] args) {
        NumberGenerator generator = new NumberGenerator();
        generator.start();
    }
}
