import java.util.Scanner;



public class fibonacci {

    public static boolean isPrime(int num) {

        if (num <= 1) return false;

        for (int i = 2; i <= Math.sqrt(num); i++) {

            if (num % i == 0) return false;

        }

        return true;

    }



   

    public static boolean isfibonacci(int n) {

        int a = 0, b = 1;

        while (a <= n) {

            if (a == n) return true;

            int c = a + b;

            a = b;

            b = c;

        }

        return false;

    }



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");

        int n = sc.nextInt();



        System.out.println("Prime Fibonacci numbers up to " + n + ": ");

        for (int i = 2; i <= n; i++) {

            if (isPrime(i) && isfibonacci(i)) {

                System.out.print(i + " ");

            }

        }

    }


		

	}


