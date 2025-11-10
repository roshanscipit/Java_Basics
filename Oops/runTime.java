package Oops;


class Animal {

    void eat() {
        System.out.println("eating...");
    }

}

class dog extends Animal {

    @Override
    void eat() {
        System.out.println("eating bread...");
    }
}

public class runTime {
    public static void main(String[] args) {
       Animal myAnimal = new Animal();  // Animal reference and object
        Animal myDog = new dog();        // Animal reference but dog object

      // myAnimal.eat();  // Calls the Animal class method
        myDog.eat();     // Calls the dog class method
    }
}
    

