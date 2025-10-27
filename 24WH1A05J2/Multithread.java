package vaishnavi;
import java.util.Random;

//Thread 1: Generates a random number every 1 second
class NumberGenerator extends Thread {
 public void run() {
     Random random = new Random();

     for (int i = 1; i <= 10; i++) { // Run only 10 times
         int number = random.nextInt(1); // Random number between 0 and 99
         System.out.println("\nGenerated Number " + i + ": " + number);

         if (number % 2 == 0) {
             SquareThread square = new SquareThread(number);
             square.start();
         } else {
             CubeThread cube = new CubeThread(number);
             cube.start();
         }

         try {
             Thread.sleep(1000); // Wait for 1 second
         } catch (InterruptedException e) {
             System.out.println("Thread interrupted.");
         }
     }

     System.out.println("\nNumber generation completed.");
 }
}

//Thread 2: Calculates square of even number
class SquareThread extends Thread {
 int number;

 SquareThread(int number) {
     this.number = number;
 }

 public void run() {
     int square = number * number;
     System.out.println("Even → Square of " + number + " = " + square);
 }
}

//Thread 3: Calculates cube of odd number
class CubeThread extends Thread {
 int number;

 CubeThread(int number) {
     this.number = number;
 }

 public void run() {
     int cube = number * number * number;
     System.out.println("Odd → Cube of " + number + " = " + cube);
 }
}

//Main class to run the program
public class Multithread {
 public static void main(String[] args) {
     NumberGenerator generator = new NumberGenerator();
     generator.start(); // Start the number generator thread
 }
}
