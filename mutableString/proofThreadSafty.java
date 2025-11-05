package mutableString;

public class proofThreadSafty {
    public static void main(String[] args) {

       // StringBuilder mutableString = new StringBuilder();
       StringBuffer mutableString = new StringBuffer();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
            
                    mutableString.append("A");
            
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                    mutableString.append("B");  
            }
        });
        t1.start();
        t2.start();
        
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final string length: " + mutableString.length());
    }
    
}
