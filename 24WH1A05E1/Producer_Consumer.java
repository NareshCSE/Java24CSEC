class SharedBuffer {
    private int data;
    private boolean hasData = false;

    // Producer puts data into buffer
    public synchronized void produce(int value) {
        while (hasData) {
            try {
                wait(); // Wait until buffer is empty
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        data = value;
        hasData = true;
        System.out.println("Produced: " + value);
        notify(); // Notify consumer
    }

    // Consumer takes data from buffer
    public synchronized int consume() {
        while (!hasData) {
            try {
                wait(); // Wait until buffer has data
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        hasData = false;
        System.out.println("Consumed: " + data);
        notify(); // Notify producer
        return data;
    }
}

class Producer extends Thread {
    private SharedBuffer buffer;

    public Producer(SharedBuffer buffer) {
        this.buffer = buffer;
    }

    public void run() {
        for (int i = 1; i <= 10; i++) {
            buffer.produce(i);
            try {
                Thread.sleep(500); // Simulate time to produce
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

class Consumer extends Thread {
    private SharedBuffer buffer;

    public Consumer(SharedBuffer buffer) {
        this.buffer = buffer;
    }

    public void run() {
        for (int i = 1; i <= 10; i++) {
            buffer.consume();
            try {
                Thread.sleep(800); // Simulate time to consume
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

public class Producer_Consumer {
    public static void main(String[] args) {
        SharedBuffer buffer = new SharedBuffer();
        Producer producer = new Producer(buffer);
        Consumer consumer = new Consumer(buffer);

        producer.start();
        consumer.start();
    }
}