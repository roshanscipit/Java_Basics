package MultiThreading;

import java.util.concurrent.atomic.AtomicInteger;

public class racecodition {
    //private static AtomicInteger counter = new AtomicInteger(0);
    private static int count = 0;

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
               // counter.incrementAndGet();
               synchronized (racecodition.class) {
               count++;
               }
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                // counter.incrementAndGet();
               synchronized (racecodition.class) {
               count++;
               }
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final counter value: " + count);
    }
}
