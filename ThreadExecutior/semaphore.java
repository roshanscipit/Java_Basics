package ThreadExecutior;

public class semaphore {

    public static void main(String[] args) {

        semaphoreExample semaphoreExample = new semaphoreExample(2); // 2 permits

        Runnable worker = () -> {
            String threadName = Thread.currentThread().getName();
            try {
                System.out.println(threadName + " is waiting for a permit.");
                semaphoreExample.acquire();
                System.out.println(threadName + " has acquired a permit.");

                // Simulate some work with sleep
                Thread.sleep(2000);

            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                System.out.println(threadName + " is releasing a permit.");
                semaphoreExample.release();
            }
        };

        // Create and start multiple threads
        for (int i = 0; i < 5; i++) {
            new Thread(worker, "Thread-" + i).start();
        }   
        
        
    }
    
}