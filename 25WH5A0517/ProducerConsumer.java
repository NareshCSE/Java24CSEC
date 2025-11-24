package navya_25wh5a0517;

class SharedBuffer {
private int data;
private boolean hasData = false;
synchronized void produce(int value) {
while (hasData) {
try {
wait();
} catch (InterruptedException e) {
System.out.println(e);
}
}
data = value;
hasData = true;
System.out.println("Producer produced: " + value);
notify();
}
synchronized int consume() {
while (!hasData) {
try {
wait();
} catch (InterruptedException e) {
System.out.println(e);
}
}
hasData = false;
System.out.println("Consumer consumed: " + data);
notify();
return data;
}
}
class Producer extends Thread {
SharedBuffer buffer;
Producer(SharedBuffer buffer) {
this.buffer = buffer;
}
public void run() {
for (int i = 1; i <= 5; i++) {
buffer.produce(i);
try {
Thread.sleep(500);
}

catch (InterruptedException e) {
System.out.println(e);
} } } }
class Consumer extends Thread {
SharedBuffer buffer;
Consumer(SharedBuffer buffer) {
this.buffer = buffer;
}
public void run() {
for (int i = 1; i <= 5; i++) {
buffer.consume();
try {
Thread.sleep(800); // simulate consumption time
} catch (InterruptedException e) {
System.out.println(e);
}
} } }
public class ProducerConsumer {
public static void main(String[] args) {
SharedBuffer buffer = new SharedBuffer();
Producer producer = new Producer(buffer);
Consumer consumer = new Consumer(buffer);
producer.start();
consumer.start();
}
}