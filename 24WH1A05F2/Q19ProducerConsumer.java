package java_exps;

class SharedData {
    int data;
    boolean hasData = false;

    synchronized void produce(int value) {
        while (hasData) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        data = value;
        hasData = true;
        System.out.println("Produced: " + data);
        notify();
    }

    synchronized void consume() {
        while (!hasData) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Consumed: " + data);
        hasData = false;
        notify();
    }
}

class Producer extends Thread {
    SharedData shared;

    Producer(SharedData shared) {
        this.shared = shared;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            shared.produce(i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Consumer extends Thread {
    SharedData shared;

    Consumer(SharedData shared) {
        this.shared = shared;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            shared.consume();
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Q19ProducerConsumer {
    public static void main(String[] args) {
        SharedData shared = new SharedData();
        Producer p = new Producer(shared);
        Consumer c = new Consumer(shared);

        p.start();
        c.start();
    }
}