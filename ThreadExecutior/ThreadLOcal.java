package ThreadExecutior;
import java.util.thread.ThreadLocal;

public class ThreadLOcal {

    public static void main(String[] args) {
        ThreadLocal<Integer> threadLocal = ThreadLocal.withInitial(() -> 0);

        Runnable task = () -> {
            int value = threadLocal.get();
            value += 1;
            threadLocal.set(value);
            System.out.println(Thread.currentThread().getName() + ": " + threadLocal.get());
        };

        Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(task);
        Thread thread3 = new Thread(task);

        thread1.start();
        thread2.start();
        thread3.start();
    }
    
}