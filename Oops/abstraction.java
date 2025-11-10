package Oops;

abstract class Animal {
    abstract void makeSound();

    void sleep() {
        System.out.println("Zzz");
    }
}

class Dog extends Animal {
    void makeSound() {
        System.out.println("Woof");
    }
}

public class abstraction {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeSound();
        dog.sleep();
    }
}
