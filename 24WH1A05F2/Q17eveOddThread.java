package javaExp;

import java.util.Random;

class Q17eveOddThread {
    public static void main(String[] args) {
        NumberGenerator generator = new NumberGenerator();
        generator.start();
    }
}
class NumberGenerator extends Thread {
    public void run() {
        Random rand = new Random();
        for (int i = 1; i <= 10; i++) {
            int num = rand.nextInt(100);
            System.out.println("\nGenerated Number " + i + ": " + num);
            if (num % 2 == 0) {
                int square = num * num;
                System.out.println("Square of " + num + " = " + square);
            } else {
                int cube = num * num * num;
                System.out.println("Cube of " + num + " = " + cube);
            }
            try {
                Thread.sleep(1000); //stops for 1 second and then continues
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println("\n--- Number Generation Completed ---");
    }
}

