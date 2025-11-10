import java.util.Random;

class NumberData {
    int number;
    boolean available = false;
}

class NumberGenerator extends Thread {
    private final NumberData data;
    private final Random random = new Random();

    NumberGenerator(NumberData data) {
        this.data = data;
    }

    public void run() {
        while (true) {
            synchronized (data) {
                data.number = random.nextInt(100) + 1;
                System.out.println("\nGenerated Number: " + data.number);
                data.available = true;
                data.notifyAll();
            }

            try {
                Thread.sleep(1000); // generate every 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class SquareThread extends Thread {
    private final NumberData data;

    SquareThread(NumberData data) {
        this.data = data;
    }

    public void run() {
        while (true) {
            synchronized (data) {
                try {
                    while (!data.available) {
                        data.wait();
                    }

                    if (data.number % 2 == 0) {
                        System.out.println("Square of " + data.number + " = " + (data.number * data.number));
                    }
                    data.available = false;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

class CubeThread extends Thread {
    private final NumberData data;

    CubeThread(NumberData data) {
        this.data = data;
    }

    public void run() {
        while (true) {
            synchronized (data) {
                try {
                    while (!data.available) {
                        data.wait();
                    }

                    if (data.number % 2 != 0) {
                        System.out.println("Cube of " + data.number + " = " + (data.number * data.number * data.number));
                    }
                    data.available = false;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

public class MultiThreadExample {
    public static void main(String[] args) {
        NumberData data = new NumberData();

        Thread generator = new NumberGenerator(data);
        Thread square = new SquareThread(data);
        Thread cube = new CubeThread(data);

        generator.start();
        square.start();
        cube.start();
    }
}
