package threads;

import java.util.Random;

class NumberGenerator extends Thread {
    public void run() {
        Random random = new Random();

        for(int i = 0;i<5;i++) {
            int num = random.nextInt(1000);  // Generate random number 0–99
            System.out.println("\nGenerated Number: " + num);
            //creating diff threads with condn
            // If even → square thread
            if (num % 2 == 0) {
                new SquareThread(num).start();
            }
            // If odd → cube thread
            else {
                new CubeThread(num).start();
            }

            try {
                Thread.sleep(5000); // Wait 1 second before next number, 
                //since it is milliseconds we use 1000= 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class SquareThread extends Thread {
    int num;
    SquareThread(int num) {
        this.num = num;
    }

    public void run() {
        int square = num * num;
        System.out.println("Even Number: " + num + ", Square: " + square);
    }
}

class CubeThread extends Thread {
    int num;
    CubeThread(int num) {
        this.num = num;
    }

    public void run() {
        int cube = num * num * num;
        System.out.println("Odd Number: " + num + ", Cube: " + cube);
    }
}

public class MultiThreadSimple {
    public static void main(String[] args) {
        NumberGenerator random = new NumberGenerator();
        random.start();
    }
}

