package ThreadExecutior;

public class Virtual {
    public static void main(String[] args) {
        System.out.println("Virtual Thread Example");

        Thread thread = Thread.startVirtualThread(() -> {
            System.out.println("Hello from a virtual thread!");
        });
        try {
            thread.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        
    }
}