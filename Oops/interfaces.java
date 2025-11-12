package Oops;

interface cat {
    void eat();
    static void sleep() {
        System.out.println("Animal is sleeping");
    }
    default void walk() {
        System.out.println("Animal is walking");
    }
}

public class interfaces implements cat {
    @Override
    public void eat() {
        System.out.println("eating...");
    }

    public static void main(String[] args) {
        interfaces myAnimal = new interfaces();
        myAnimal.eat();  // Calls the eat method
        myAnimal.walk(); // Calls the default walk method
        cat.sleep();  // Calls the static sleep method
    }
    
}
