package Oops;

abstract class lovable {

    abstract void eat();

}

class dog extends lovable {
    @Override
    void eat() {
        System.out.println("eating bread...");
    }
}


public class abstractClass {
    public static void main(String[] args) {
        lovable myDog = new dog();        // lovable reference but dog object
        myDog.eat();     // Calls the dog class method
    }
}
