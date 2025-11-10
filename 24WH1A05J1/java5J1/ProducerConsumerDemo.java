import java.util.LinkedList;

class SharedBuffer {
    private final LinkedList<Integer> buffer = new LinkedList<>();
    private final int capacity = 5;

    // Producer method
    public void produce() throws InterruptedException {
        int value = 0;
        while (true) {
            synchronized (this) {
                while (buffer.size() == capacity) {
                    wait(); // Wait if buffer is full
                }

                buffer.add(value);
                System.out.println("Produced: " + value);
                value++;

                notify(); // Notify consumer
                Thread.sleep(500); // Simulate delay
            }
        }
    }

    // Consumer method
    public void consume() throws InterruptedException {
        while (true) {
            synchronized (this) {
                while (buffer.isEmpty()) {
                    wait(); // Wait if buffer is empty
                }

                int value = buffer.removeFirst();
                System.out.println("Consumed: " + value);

                notify(); // Notify producer
                Thread.sleep(500); // Simulate delay
            }
        }
    }
}

public class ProducerConsumerDemo {
    public static void main(String[] args) {
        SharedBuffer buffer = new SharedBuffer();

        // Producer thread
        Thread producer = new Thread(() -> {
            try {
                buffer.produce();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Consumer thread
        Thread consumer = new Thread(() -> {
            try {
                buffer.consume();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        producer.start();
        consumer.start();
    }
}
