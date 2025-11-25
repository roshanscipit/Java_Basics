package ThreadExecutior;

import java.util.concurrent.*;


public class ExecutorService{

    public static void main(String[] args)
    {


        //fixed size thread pool
      
        ExecutorService executor = Executors.newFixedThreadPool(2);

        executor.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("Task 1 is running");
            }
        });

        executor.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("Task 2 is running");
            }
        });

        executor.shutdown();

        //cached thread pool
        ExecutorService cachedExecutor = Executors.newCachedThreadPool();
        cachedExecutor.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("Cached Task 1 is running");
            }
        });
        cachedExecutor.shutdown();

        //single thread executor
        ExecutorService singleExecutor = Executors.newSingleThreadExecutor();
        singleExecutor.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("Single Task is running");
            }
        });
        singleExecutor.shutdown();

        //scheduled thread pool
        ScheduledExecutorService scheduledExecutor = Executors.newScheduledThreadPool(2);   
        scheduledExecutor.schedule(new Runnable() {
            @Override
            public void run() {
                System.out.println("Scheduled Task is running after delay");
            }
        }, 3, TimeUnit.SECONDS);
        scheduledExecutor.shutdown();








    }
}