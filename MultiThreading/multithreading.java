package MultiThreading;

// class mythread implements Runnable{

//     public void run()
//     {
//         System.out.println("run");
//     }
// }

// class mythread extends Thread{

//     public void run()
//     {
//         System.out.println("run");
//     }
// }



public class multithreading {
    public static void main(String[] args) {

  
        // Thread th1 = new Thread(new Runnable() {
        //     @Override
        //     public void run() {
        //         System.out.println("run");
        //     }
        // });
        // th1.start();

        Thread th1 = new Thread(()->{
                System.out.println("run");
        });
        th1.run();
        

     
}
}