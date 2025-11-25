package ThreadExecutior;

import java.util.BlockingQueue;
import java.util.concurrent.ArrayBlockingQueue;

public class producerConsumer {

    public static void main(String[] args) {

        BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(5);

        Thread producer = new Thread(() -> {
            int value = 0;
            try {
                while (true) {
                    System.out.println("Producing " + value);
                    queue.enqueue(value++);
                    Thread.sleep(500); // Simulate time taken to produce
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        Thread consumer = new Thread(() -> {
            try {
                while (true) {
                    int value = queue.dequeue();
                    System.out.println("Consuming " + value);
                    Thread.sleep(1000); // Simulate time taken to consume
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });
        producer.start();
        consumer.start();


        
    }
    
}