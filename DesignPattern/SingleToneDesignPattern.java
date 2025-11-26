package DesignPattern;

enum singletone{

    INSTANCE;

    public void showMessage(){
        System.out.println("Hello from Singleton Enum!");
    }
}

class Singletone{

    //Early initialization
    // private static final Singletone instance = new Singletone();

    // private Singletone(){
    //     //private constructor to prevent instantiation
    // }   

    // public static Singletone getInstance() {
    //     return instance;
    // }

    //Lazy Initialization
    // private static Singletone instance;
    // private Singletone(){
    //     //private constructor to prevent instantiation
    // }
    // public static Singletone getInstance() {
    //     if(instance == null){
    //         instance = new Singletone();
    //     }
    //     return instance;
    // }

    //Thread Safe Singleton
    // private static Singletone instance;
    // private Singletone(){
    //     //private constructor to prevent instantiation
    // }
    // public static synchronized Singletone getInstance() {
    //     if(instance == null){
    //         instance = new Singletone();
    //     }
    //     return instance;
    // }

    //Double Checked Locking
    // private static volatile Singletone instance; 
    // private Singletone(){
    //     //private constructor to prevent instantiation
    // }
    // public static Singletone getInstance() {
    //     if(instance == null){
    //         synchronized (Singletone.class) {
    //             if(instance == null){
    //                 instance = new Singletone();
    //             }
    //         }
    //     }
    //     return instance;
    // }

    //bill Pugh Singleton Implementation
    //private Singletone(){
    //     //private constructor to prevent instantiation
    // }
    //private static class SingletonHelper{
    //     private static final Singletone instance = new Singletone();
    // }

    // public static Singletone getInstance() {
    //     return SingletonHselper.instance;
    // }   

}

public class SingleToneDesignPattern {
    public static void main(String[] args) {
        singletone s1 = singletone.INSTANCE;
        singletone s2 = singletone.INSTANCE;

        if(s1 == s2){
            System.out.println("Both references point to the same instance.");
        } else {
            System.out.println("Different instances exist.");
        }
    }
}