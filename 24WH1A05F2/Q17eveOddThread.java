package javaExp;

import java.util.Random;

class NumberGenerator extends Thread {
    public void run() {
        Random rand = new Random();
        for (int i = 1; i <= 10; i++) {
            int num = rand.nextInt(100); // random number between 0–99
            System.out.println("\nGenerated Number " + i + ": " + num);
            if (num % 2 == 0) {
                new SquareThread(num).start();
            } else {
                new CubeThread(num).start();
            }
            try {
                Thread.sleep(1000); // wait for 1 second before next number
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println("\n--- Number Generation Completed ---");
    }
}
class SquareThread extends Thread {
    private int number;
    public SquareThread(int number) {
        this.number = number;
    }
    public void run() {
        int square = number * number;
        System.out.println("Square of " + number + " = " + square);
    }
}
class CubeThread extends Thread {
    private int number;
    public CubeThread(int number) {
        this.number = number;
    }

    public void run() {
        int cube = number * number * number;
        System.out.println("Cube of " + number + " = " + cube);
    }
}
class Q17eveOddThread {
    public static void main(String[] args) {
        NumberGenerator generator = new NumberGenerator();
        generator.start();  //start any random number generator thread
    }
}
