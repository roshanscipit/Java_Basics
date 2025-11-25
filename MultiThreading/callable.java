package MultiThreading;

import java.util.concurrent.Callable;

// class mythread implements Callable<Integer>{
//     public Integer call()
//     {
//         return 42;
//     }
// }
public class callable {

    public static void main(String[] args) throws Exception {
        // mythread mt = new mythread();
        // Integer result = mt.call();
        // System.out.println("Callable result: " + result);

        // Integer result = new Callable<Integer>(){
        //     public Integer call()
        //     {
        //         return 100;
        //     }
        // }.call();
        // System.out.println("Callable result: " + result);

        Thread t= new Thread(()->
        {
            Callable<Integer> c = ()->{
                return 500;
            };
            try {
                System.out.println("Callable result: " + c.call());
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        t.start();
    }
    
}
