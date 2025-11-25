package MultiThreading;

public class Daemon {
    public static void main(String args[])
    {
        Thread t = new Thread(()->
       {
        System.out.println("Daemon thread running");
       });

    t.setDaemon(true);
    t.start();

    try {
        Thread.sleep(1000);  // Give daemon thread time to execute
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    }
}
