package Ass;

class Buffer {
    private int data;
    private boolean hasData = false;

    public synchronized void produce(int value) {
        try {
            while (hasData) {
                wait();
            }

            data = value;
            hasData = true;
            System.out.println("Produced: " + value);
            
            notify();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized int consume() {
        int value = 0;
        try {
            while (!hasData) {
                wait();
            }

            value = data;
            hasData = false;
            System.out.println("Consumed: " + value);

            notify();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return value;
    }
}

class Producer extends Thread {
    private Buffer buffer;

    public Producer(Buffer buffer) {
        this.buffer = buffer;
    }

    public void run() {
        for (int i = 1; i <= 10; i++) {
            buffer.produce(i);

            try {
                Thread.sleep(500); // Simulate production time
            } catch (InterruptedException e) { }
        }
    }
}

class Consumer extends Thread {
    private Buffer buffer;

    public Consumer(Buffer buffer) {
        this.buffer = buffer;
    }

    public void run() {
        for (int i = 1; i <= 10; i++) {
            buffer.consume();

            try {
                Thread.sleep(800); // Simulate consumption time
            } catch (InterruptedException e) { }
        }
    }
}

public class ASS20_24WH1A05D1 {
    public static void main(String[] args) {
        Buffer buffer = new Buffer();

        Producer producer = new Producer(buffer);
        Consumer consumer = new Consumer(buffer);

        producer.start();
        consumer.start();
    }
}
